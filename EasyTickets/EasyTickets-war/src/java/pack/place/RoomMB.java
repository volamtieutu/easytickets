/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.place;

import entities.Cinema;
import entities.Room;
import entities.Seat;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import models.CinemaFacadeLocal;
import models.RoomFacadeLocal;
import models.SeatFacadeLocal;
import org.primefaces.component.datatable.DataTable;

/**
 *
 * @author Win-PC
 */
@Named(value = "roomMB")
@SessionScoped
public class RoomMB implements Serializable {

    @EJB
    private SeatFacadeLocal seatFacade;

    @EJB
    private CinemaFacadeLocal cinemaFacade;

    @EJB
    private RoomFacadeLocal roomFacade;

    /**
     * Creates a new instance of RoomMB
     */
    private int cinemaID;
    private int seatID;
    private int roomID;
    private String roomName;
    private int seatNo;
    private String row;
    private int number;
    private String mess;
    private ArrayList<Room> value;

    public RoomMB() {
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public RoomFacadeLocal getRoomFacade() {
        return roomFacade;
    }

    public void setRoomFacade(RoomFacadeLocal roomFacade) {
        this.roomFacade = roomFacade;
    }

    public List<Room> displayAll() {
        return roomFacade.findAll();
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public int getCinemaID() {
        return cinemaID;
    }

    public void setCinemaID(int cinemaID) {
        this.cinemaID = cinemaID;
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public SeatFacadeLocal getSeatFacade() {
        return seatFacade;
    }

    public void setSeatFacade(SeatFacadeLocal seatFacade) {
        this.seatFacade = seatFacade;
    }

    public CinemaFacadeLocal getCinemaFacade() {
        return cinemaFacade;
    }

    public void setCinemaFacade(CinemaFacadeLocal cinemaFacade) {
        this.cinemaFacade = cinemaFacade;
    }

    public ArrayList<Room> getValue() {
        return value;
    }

    public void setValue(ArrayList<Room> value) {
        this.value = value;
    }

    private boolean showPopup;

    public boolean isShowPopup() {
        return showPopup;
    }

    public void setShowPopup(boolean showPopup) {
        this.showPopup = showPopup;
    }

    public void show() {
        showPopup = true;
    }

    public void hide() {
        showPopup = false;
    }
    
    private boolean showPopupDelete;

    public boolean isShowPopupDelete() {
        return showPopupDelete;
    }

    public void setShowPopupDelete(boolean showPopupDelete) {
        this.showPopupDelete = showPopupDelete;
    }

    public void hideDelete() {
        showPopupDelete = false;
    }

    public void showDelete() {
        if (getNextObj().isEmpty()) {
            addMessage("Warnning", "Please select at least 1 record!");
        } else {
            showPopupDelete = true;
        }
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void resetValue() {
        this.roomName = null;
        this.seatNo = 0;
        this.mess = null;
    }

    public void createRoom(int cinemaid) {
        Room r = new Room();
        Cinema c = cinemaFacade.find(cinemaid);
        r.setRoomName(this.roomName);
        r.setSeatNo(this.seatNo);
        r.setCinemaID(c);
        roomFacade.create(r);
        this.roomID = r.getRoomID();
        showPopup = true;
    }

    public void remove() {
        DataTable dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot().findComponent("form:table");
        dataTable.setSelection(getNextObj());
        for (int i = 0; i <= getNextObj().size() - 1; i++) {
            roomID = getNextObj().get(i).getRoomID();
            Room r = roomFacade.find(roomID);
            roomFacade.remove(r);
        }
        hideDelete();
        addMessage("Successful", "Record deleted!");
    }

    private ArrayList<Room> getNextObj() {
        if (value == null) {
            return null;
        }
        return value;
    }

    public void createSeat(int roomid) {
        Seat s = new Seat();
        Room r = roomFacade.find(roomid);
        for (int i = 1; i <= number; i++) {
            s.setRow(row);
            s.setNumber(i);
            s.setRoomID(r);
            seatFacade.create(s);
        }
    }
}
