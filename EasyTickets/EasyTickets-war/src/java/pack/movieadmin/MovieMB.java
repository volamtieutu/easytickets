/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.movieadmin;

import entities.Movie;
import entities.Promotion;
import java.io.File;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;
import models.MovieFacadeLocal;
import models.PromotionFacadeLocal;
import org.primefaces.component.datatable.DataTable;

/**
 *
 * @author Win-PC
 */
@Named(value = "movieMB")
@SessionScoped
public class MovieMB implements Serializable {

    @EJB
    private MovieFacadeLocal movieFacade;

    @EJB
    private PromotionFacadeLocal promotionFacade;

    /**
     * Creates a new instance of MovieMB
     */
    private int movieID;
    private int proID;
    private String movieName;
    private String[] genre;
    private String language;
    private int rated;
    private String cast;
    private String director;
    private int runTime;
    private int ticketPrice;
    private Date beginDate;
    private Date endDate;
    private int point;
    private String description;
    private String image;
    private String media;
    private Part fileUp;
    private Part file;
    private boolean flag;
    private List<String> genres;
    private ArrayList<Movie> value;
    private Movie val;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getRated() {
        return rated;
    }

    public void setRated(int rated) {
        this.rated = rated;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public List<Movie> displayAll() {
        return movieFacade.findAll();
    }

    public List<Promotion> displayAllPromotion() {
        return promotionFacade.findAll();
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public ArrayList<Movie> getValue() {
        return value;
    }

    public void setValue(ArrayList<Movie> value) {
        this.value = value;
    }

    public Part getFileUp() {
        return fileUp;
    }

    public void setFileUp(Part fileUp) {
        this.fileUp = fileUp;
    }

    public Movie getVal() {
        return val;
    }

    public void setVal(Movie val) {
        this.val = val;
    }

    @PostConstruct
    public void init() {
        genres = new ArrayList<>();
        genres.add("Action");
        genres.add("Adventure");
        genres.add("Animation");
        genres.add("Comedy");
        genres.add("Crime");
        genres.add("Drama");
        genres.add("Family");
        genres.add("Horror");
        genres.add("Mystery");
        genres.add("Musical");
        genres.add("Romance");
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    private String mytoString(String[] theAray, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < theAray.length; i++) {
            if (i > 0) {
                sb.append(delimiter);
            }
            String item = theAray[i];
            sb.append(item);
        }
        return sb.toString();
    }

    public String insertMovieInfo() throws IOException {
//        HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getResourcePaths("image");
//        String url = req.getRequestURL().toString();
//        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
//        String a = servletContext.getRealPath("/") + "image/";
//        System.out.println(a);
//        String root = url.substring(0, url.length() - req.getRequestURI().length()) + req.getContextPath() + "/resources/image/";
//        String root = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + "";

        Movie m = new Movie();
        Promotion pr = promotionFacade.find(proID);
        setFlag(movieFacade.checkExistMovieName(this.movieName));
        if (this.flag == true) {
            addMessage("Warning!", " Movie name alrealy exist");
        } else {
            this.image = file.getSubmittedFileName();
            InputStream input = file.getInputStream();
            File f = new File("C:\\Users\\Win-PC\\Documents\\NetBeansProjects\\EasyTickets\\EasyTickets-war\\web\\resources\\image\\");
            if (!f.exists()) {
                f.createNewFile();
            }
            FileOutputStream output = new FileOutputStream(f + "\\" + this.image);
            byte[] buf = new byte[1024];
            int len;
            while ((len = input.read(buf)) > 0) {
                output.write(buf, 0, len);
            }
            m.setMovieName(movieName);
            m.setGenre(mytoString(genre, ", "));
            m.setLanguage(language);
            m.setRated(rated);
            m.setCast(cast);
            m.setDirector(director);
            m.setRunTime(runTime);
            m.setTicketPrice(ticketPrice);
            m.setBeginDate(beginDate);
            m.setEndDate(endDate);
            m.setPoint(point);
            m.setDescription(description);
            m.setPromotionID(pr);
            m.setImage("\\resources\\image\\" + this.image);
            m.setMedia(media);
            movieFacade.create(m);
            resetValue();
            addMessage("Insert successful!", null);
            return "frViewMovie.xhtml?faces-redirect=true";
        }
        return null;
    }

    public void resetValue() {
        this.movieName = null;
        this.language = null;
        this.genre = null;
        this.rated = 0;
        this.cast = null;
        this.director = null;
        this.runTime = 0;
        this.ticketPrice = 0;
        this.beginDate = null;
        this.endDate = null;
        this.point = 0;
        this.description = null;
        this.image = null;
        this.media = null;
    }

    public void updateMovie() throws IOException {
        Movie m = new Movie(val.getMovieID());

        if (fileUp != null) {
            this.image = fileUp.getSubmittedFileName();
            InputStream input = fileUp.getInputStream();
            File f = new File("C:\\Users\\Win-PC\\Documents\\NetBeansProjects\\EasyTickets\\EasyTickets-war\\web\\resources\\image\\");
            if (!f.exists()) {
                f.createNewFile();
            }
            FileOutputStream output = new FileOutputStream(f + "\\" + this.image);
            byte[] buf = new byte[1024];
            int len;
            while ((len = input.read(buf)) > 0) {
                output.write(buf, 0, len);
            }

            Promotion pr = promotionFacade.find(proID);
            m.setMovieName(val.getMovieName());
            m.setGenre(mytoString(genre, ", "));
            m.setLanguage(val.getLanguage());
            m.setRated(val.getRated());
            m.setCast(val.getCast());
            m.setDirector(val.getDirector());
            m.setRunTime(val.getRunTime());
            m.setTicketPrice(val.getTicketPrice());
            m.setBeginDate(val.getBeginDate());
            m.setEndDate(val.getEndDate());
            m.setPoint(val.getPoint());
            m.setDescription(val.getDescription());
            m.setImage("\\resources\\image\\" + this.image);
            m.setMedia(val.getMedia());
            m.setPromotionID(pr);
            movieFacade.edit(m);
            addMessage("Successful", "Record updated!");
        } else {
            Promotion pr = promotionFacade.find(proID);
            m.setMovieName(val.getMovieName());
            m.setGenre(mytoString(genre, ", "));
            m.setLanguage(val.getLanguage());
            m.setRated(val.getRated());
            m.setCast(val.getCast());
            m.setDirector(val.getDirector());
            m.setRunTime(val.getRunTime());
            m.setTicketPrice(val.getTicketPrice());
            m.setBeginDate(val.getBeginDate());
            m.setEndDate(val.getEndDate());
            m.setPoint(val.getPoint());
            m.setDescription(val.getDescription());
            m.setImage(val.getImage());
            m.setMedia(val.getMedia());
            m.setPromotionID(pr);
            movieFacade.edit(m);
            addMessage("Successful", "Record updated!");
        }
    }

    public void remove() {
        DataTable dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot().findComponent("form:table");
        dataTable.setSelection(getNextObj());
        if (getNextObj().isEmpty()) {
            addMessage("Warnning", "Please select at least 1 record!");
        } else {
            for (int i = 0; i <= getNextObj().size() - 1; i++) {
                movieID = getNextObj().get(i).getMovieID();
                Movie m = movieFacade.find(movieID);
                movieFacade.remove(m);
            }
            addMessage("Successful", "Record deleted!");
        }
    }

    public void cancel() {
        addMessage("Alert!", "action cancel");
    }

    private ArrayList<Movie> getNextObj() {
        if (value == null) {
            return null;
        }
        return value;
    }

    public Date minDateBegin() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }

    public Date minDateEnd() {
        Calendar currentDate = Calendar.getInstance();
        currentDate.add(Calendar.DATE, +30);
        return currentDate.getTime();
    }
}
