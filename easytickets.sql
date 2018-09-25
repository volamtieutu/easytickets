﻿USE [easytickets]
GO
/****** Object:  Table [dbo].[Admin]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Admin](
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	[Role] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Admin] PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Area]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Area](
	[Area_ID] [int] IDENTITY(1,1) NOT NULL,
	[Area_Name] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Area] PRIMARY KEY CLUSTERED 
(
	[Area_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Cinema]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Cinema](
	[Cinema_ID] [int] IDENTITY(1,1) NOT NULL,
	[Cinema_Name] [varchar](50) NOT NULL,
	[Cinema_Address] [varchar](500) NOT NULL,
	[Phone] [varchar](15) NOT NULL,
	[Area_ID] [int] NOT NULL,
 CONSTRAINT [PK_Cinema] PRIMARY KEY CLUSTERED 
(
	[Cinema_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Customer](
	[Customer_ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	[Name] [varchar](100) NOT NULL,
	[Birthday] [date] NOT NULL,
	[Address] [varchar](500) NULL,
	[Phone] [varchar](15) NULL,
	[Poit] [int] NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Event]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Event](
	[Event_ID] [int] IDENTITY(1,1) NOT NULL,
	[Event_Name] [varchar](100) NOT NULL,
	[Event_Type] [varchar](50) NOT NULL,
	[Begin_Date] [date] NOT NULL,
	[Run_Time] [int] NOT NULL,
	[Ticket_Price] [int] NOT NULL,
	[Point] [int] NOT NULL,
	[Description] [varchar](1000) NOT NULL,
	[Image] [varchar](100) NOT NULL,
 CONSTRAINT [PK_Event] PRIMARY KEY CLUSTERED 
(
	[Event_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Event_Booking]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Event_Booking](
	[Booking_ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Place_ID] [int] NOT NULL,
	[Event_ID] [int] NOT NULL,
	[Amount_Of_Payment] [int] NOT NULL,
	[Amout_Of_Seat] [int] NOT NULL,
 CONSTRAINT [PK_Event_Booking] PRIMARY KEY CLUSTERED 
(
	[Booking_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Movie]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Movie](
	[Movie_ID] [int] IDENTITY(1,1) NOT NULL,
	[Movie_Name] [varchar](100) NOT NULL,
	[Genre] [varchar](50) NOT NULL,
	[Language] [varchar](50) NOT NULL,
	[Rated] [int] NOT NULL,
	[Cast] [varchar](250) NOT NULL,
	[Director] [varchar](50) NOT NULL,
	[Run_Time] [int] NOT NULL,
	[Ticket_Price] [int] NOT NULL,
	[Begin_Date] [date] NOT NULL,
	[End_Date] [date] NOT NULL,
	[Point] [int] NOT NULL,
	[Description] [varchar](1000) NOT NULL,
	[Image] [varchar](500) NULL,
	[Media] [varchar](500) NULL,
 CONSTRAINT [PK_Movie] PRIMARY KEY CLUSTERED 
(
	[Movie_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Movie_Booking]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Movie_Booking](
	[Booking_ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Theater_ID] [int] NOT NULL,
	[Movie_ID] [int] NOT NULL,
	[Amout_Of_Seat] [int] NOT NULL,
	[Amout_Of_Payment] [int] NOT NULL,
 CONSTRAINT [PK_Movie_Booking] PRIMARY KEY CLUSTERED 
(
	[Booking_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Place]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Place](
	[Place_ID] [int] IDENTITY(1,1) NOT NULL,
	[Place_Name] [varchar](50) NOT NULL,
	[Place_Address] [varchar](500) NOT NULL,
	[Phone] [varchar](15) NOT NULL,
	[Seat] [int] NOT NULL,
	[Area_ID] [int] NOT NULL,
 CONSTRAINT [PK_Place] PRIMARY KEY CLUSTERED 
(
	[Place_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Promotion]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Promotion](
	[Promotion_ID] [int] IDENTITY(1,1) NOT NULL,
	[Promotion_Name] [varchar](250) NOT NULL,
	[Discount] [int] NOT NULL,
	[Begin_Date] [date] NULL,
	[End_Date] [date] NULL,
	[Discription] [varchar](1000) NULL,
 CONSTRAINT [PK_Promotion] PRIMARY KEY CLUSTERED 
(
	[Promotion_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Showtime_Of_Event]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Showtime_Of_Event](
	[Event_ID] [int] NOT NULL,
	[Place_ID] [int] NOT NULL,
	[Running_Datetime] [datetime] NOT NULL,
 CONSTRAINT [PK_Showtime_Of_Event] PRIMARY KEY CLUSTERED 
(
	[Event_ID] ASC,
	[Place_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Showtime_Of_Movie]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Showtime_Of_Movie](
	[Theater_ID] [int] NOT NULL,
	[Movie_ID] [int] NOT NULL,
	[Running_Datetime] [datetime] NOT NULL,
 CONSTRAINT [PK_Showtime_Of_Movie] PRIMARY KEY CLUSTERED 
(
	[Theater_ID] ASC,
	[Movie_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Sport]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Sport](
	[Sport_ID] [int] IDENTITY(1,1) NOT NULL,
	[Sport_Name] [varchar](250) NOT NULL,
	[Teams] [varchar](250) NOT NULL,
	[Run_Time] [int] NOT NULL,
	[Running_Datetime] [datetime] NOT NULL,
	[Ticket_Price] [int] NOT NULL,
	[Point] [int] NOT NULL,
	[Description] [varchar](1000) NOT NULL,
 CONSTRAINT [PK_Sport] PRIMARY KEY CLUSTERED 
(
	[Sport_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Sport_Booking]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Sport_Booking](
	[Booking_ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Sport_ID] [int] NOT NULL,
	[Place_ID] [int] NOT NULL,
	[Amount_Of_Payment] [int] NOT NULL,
	[Amount_Of_Seat] [int] NOT NULL,
 CONSTRAINT [PK_Sport_Booking] PRIMARY KEY CLUSTERED 
(
	[Booking_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Theater]    Script Date: 15/09/2018 2:40:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Theater](
	[Theater_ID] [int] IDENTITY(1,1) NOT NULL,
	[Theater_Name] [varchar](50) NOT NULL,
	[Seat] [int] NOT NULL,
	[Cinema_ID] [int] NOT NULL,
 CONSTRAINT [PK_Theater] PRIMARY KEY CLUSTERED 
(
	[Theater_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Cinema]  WITH CHECK ADD  CONSTRAINT [FK_Cinema_Area] FOREIGN KEY([Area_ID])
REFERENCES [dbo].[Area] ([Area_ID])
GO
ALTER TABLE [dbo].[Cinema] CHECK CONSTRAINT [FK_Cinema_Area]
GO
ALTER TABLE [dbo].[Event_Booking]  WITH CHECK ADD  CONSTRAINT [FK_Event_Booking_Customer] FOREIGN KEY([Username])
REFERENCES [dbo].[Customer] ([Username])
GO
ALTER TABLE [dbo].[Event_Booking] CHECK CONSTRAINT [FK_Event_Booking_Customer]
GO
ALTER TABLE [dbo].[Event_Booking]  WITH CHECK ADD  CONSTRAINT [FK_Event_Booking_Event] FOREIGN KEY([Event_ID])
REFERENCES [dbo].[Event] ([Event_ID])
GO
ALTER TABLE [dbo].[Event_Booking] CHECK CONSTRAINT [FK_Event_Booking_Event]
GO
ALTER TABLE [dbo].[Event_Booking]  WITH CHECK ADD  CONSTRAINT [FK_Event_Booking_Place] FOREIGN KEY([Place_ID])
REFERENCES [dbo].[Place] ([Place_ID])
GO
ALTER TABLE [dbo].[Event_Booking] CHECK CONSTRAINT [FK_Event_Booking_Place]
GO
ALTER TABLE [dbo].[Movie_Booking]  WITH CHECK ADD  CONSTRAINT [FK_Movie_Booking_Customer] FOREIGN KEY([Username])
REFERENCES [dbo].[Customer] ([Username])
GO
ALTER TABLE [dbo].[Movie_Booking] CHECK CONSTRAINT [FK_Movie_Booking_Customer]
GO
ALTER TABLE [dbo].[Movie_Booking]  WITH CHECK ADD  CONSTRAINT [FK_Movie_Booking_Movie] FOREIGN KEY([Movie_ID])
REFERENCES [dbo].[Movie] ([Movie_ID])
GO
ALTER TABLE [dbo].[Movie_Booking] CHECK CONSTRAINT [FK_Movie_Booking_Movie]
GO
ALTER TABLE [dbo].[Movie_Booking]  WITH CHECK ADD  CONSTRAINT [FK_Movie_Booking_Theater] FOREIGN KEY([Theater_ID])
REFERENCES [dbo].[Theater] ([Theater_ID])
GO
ALTER TABLE [dbo].[Movie_Booking] CHECK CONSTRAINT [FK_Movie_Booking_Theater]
GO
ALTER TABLE [dbo].[Place]  WITH CHECK ADD  CONSTRAINT [FK_Place_Area] FOREIGN KEY([Area_ID])
REFERENCES [dbo].[Area] ([Area_ID])
GO
ALTER TABLE [dbo].[Place] CHECK CONSTRAINT [FK_Place_Area]
GO
ALTER TABLE [dbo].[Showtime_Of_Event]  WITH CHECK ADD  CONSTRAINT [FK_Showtime_Of_Event_Event] FOREIGN KEY([Event_ID])
REFERENCES [dbo].[Event] ([Event_ID])
GO
ALTER TABLE [dbo].[Showtime_Of_Event] CHECK CONSTRAINT [FK_Showtime_Of_Event_Event]
GO
ALTER TABLE [dbo].[Showtime_Of_Event]  WITH CHECK ADD  CONSTRAINT [FK_Showtime_Of_Event_Place] FOREIGN KEY([Place_ID])
REFERENCES [dbo].[Place] ([Place_ID])
GO
ALTER TABLE [dbo].[Showtime_Of_Event] CHECK CONSTRAINT [FK_Showtime_Of_Event_Place]
GO
ALTER TABLE [dbo].[Showtime_Of_Movie]  WITH CHECK ADD  CONSTRAINT [FK_Showtime_Of_Movie_Theater] FOREIGN KEY([Theater_ID])
REFERENCES [dbo].[Theater] ([Theater_ID])
GO
ALTER TABLE [dbo].[Showtime_Of_Movie] CHECK CONSTRAINT [FK_Showtime_Of_Movie_Theater]
GO
ALTER TABLE [dbo].[Sport_Booking]  WITH CHECK ADD  CONSTRAINT [FK_Sport_Booking_Customer] FOREIGN KEY([Username])
REFERENCES [dbo].[Customer] ([Username])
GO
ALTER TABLE [dbo].[Sport_Booking] CHECK CONSTRAINT [FK_Sport_Booking_Customer]
GO
ALTER TABLE [dbo].[Sport_Booking]  WITH CHECK ADD  CONSTRAINT [FK_Sport_Booking_Place] FOREIGN KEY([Place_ID])
REFERENCES [dbo].[Place] ([Place_ID])
GO
ALTER TABLE [dbo].[Sport_Booking] CHECK CONSTRAINT [FK_Sport_Booking_Place]
GO
ALTER TABLE [dbo].[Sport_Booking]  WITH CHECK ADD  CONSTRAINT [FK_Sport_Booking_Sport] FOREIGN KEY([Sport_ID])
REFERENCES [dbo].[Sport] ([Sport_ID])
GO
ALTER TABLE [dbo].[Sport_Booking] CHECK CONSTRAINT [FK_Sport_Booking_Sport]
GO
ALTER TABLE [dbo].[Theater]  WITH CHECK ADD  CONSTRAINT [FK_Theater_Cinema] FOREIGN KEY([Cinema_ID])
REFERENCES [dbo].[Cinema] ([Cinema_ID])
GO
ALTER TABLE [dbo].[Theater] CHECK CONSTRAINT [FK_Theater_Cinema]
GO