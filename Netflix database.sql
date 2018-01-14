CREATE DATABASE Netflix;
GO
use Netflix;

CREATE TABLE Account(
    AccountId int IDENTITY(1,1) PRIMARY KEY,
	Accountname varchar(255) UNIQUE NOT NULL,
	Password varchar(255) NOT NULL,
	Firstname varchar(255) NOT NULL,
	Insertion varchar(50),
	Lastname varchar(255) NOT NULL,
	Street varchar(255) NOT NULL,
	Housenumber int NOT NULL,
	Annax varchar(10),
	Area varchar(255),
	Active BIT
)

CREATE TABLE Profile(
	ProfileId int IDENTITY(1,1) PRIMARY KEY,
	AccountId int NOT NULL,
	Profilename varchar(255) UNIQUE NOT NULL,
	Age int NOT NULL,
	CONSTRAINT FK_Account FOREIGN KEY (AccountId) REFERENCES Account (AccountId) ON DELETE NO ACTION ON UPDATE CASCADE
)

CREATE TABLE Movie(
	MovieId int IDENTITY(1,1) PRIMARY KEY,
	Title varchar(255) NOT NULL,
	Duration int NOT NULL,
	Gerne varchar(255) NOT NULL,
	Language varchar(255) NOT NULL,
	Age int
)


CREATE TABLE Serie(
	SerieId int IDENTITY(1,1) PRIMARY KEY,
	Title varchar(255) NOT NULL,
	Duration int NOT NULL
)

CREATE TABLE Program(
	ProgramId int IDENTITY(1,1) PRIMARY KEY,
	MovieId int, 
	SerieId int,
	ProfileId int NOT NULL,
	Percentage int,
	CONSTRAINT FK_Movie FOREIGN KEY (MovieId) REFERENCES Movie (MovieId) ON DELETE NO ACTION ON UPDATE CASCADE,
	CONSTRAINT FK_Serie FOREIGN KEY (SerieId) REFERENCES Serie (SerieId) ON DELETE NO ACTION ON UPDATE CASCADE,
	CONSTRAINT FK_Profile FOREIGN KEY (ProfileId) REFERENCES Profile (ProfileId) ON DELETE NO ACTION ON UPDATE CASCADE
)

CREATE TABLE Episode(
	Title varchar(255) NOT NULL PRIMARY KEY,
	SerieId int NOT NULL,
	Duration int NOT NULL,
	CONSTRAINT FK_Serie_second FOREIGN KEY (SerieId) REFERENCES Serie (SerieId) ON DELETE NO ACTION ON UPDATE CASCADE
)


