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
	Annex varchar(10),
	Area varchar(255),
	Active BIT
)

CREATE TABLE Profile(
	ProfileId int IDENTITY(1,1) PRIMARY KEY,
	AccountId int NOT NULL,
	Profilename varchar(255) UNIQUE NOT NULL,
	Age int NOT NULL,
	CONSTRAINT FK_Account FOREIGN KEY (AccountId) REFERENCES Account (AccountId) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE Movie(
	MovieId int IDENTITY(1,1) PRIMARY KEY,
	Title varchar(255) NOT NULL,
	Duration int NOT NULL,
	Genre varchar(255) NOT NULL,
	Language varchar(255) NOT NULL,
	Age int
)


CREATE TABLE Serie(
	SerieId int IDENTITY(1,1) PRIMARY KEY,
	Title varchar(255) UNIQUE NOT NULL,
	Duration int NOT NULL
)

CREATE TABLE Episode(
	EpisodeId int IDENTITY(1,1) PRIMARY KEY,
	Title varchar(255) UNIQUE NOT NULL,
	SerieId int NOT NULL,
	Duration int NOT NULL,
	CONSTRAINT FK_Serie_second FOREIGN KEY (SerieId) REFERENCES Serie (SerieId)
)


CREATE TABLE Program(
	ProgramId int IDENTITY(1,1) PRIMARY KEY,
	MovieId int, 
	SerieId int,
	EpisodeId int,
	ProfileId int NOT NULL,
	Percentage int,
	CONSTRAINT FK_Movie FOREIGN KEY (MovieId) REFERENCES Movie (MovieId) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT FK_Serie FOREIGN KEY (SerieId) REFERENCES Serie (SerieId) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT FK_Profile FOREIGN KEY (ProfileId) REFERENCES Profile (ProfileId) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT FK_Episode FOREIGN KEY (EpisodeId) REFERENCES Episode (EpisodeId) ON DELETE CASCADE ON UPDATE CASCADE
)

INSERT INTO Account VALUES ('AccountMichael', 'qwerty', 'Michael', 'van', 'Zundert','Straatnaam' , 5,'','Woonplaats',1); 
INSERT INTO Account VALUES ('AccountTeun', 'qwerty', 'Teun', '', 'Aarts','Straatnaam' , 5,'','Woonplaats',1);
INSERT INTO Account VALUES ('AccountKevin', 'qwerty', 'Kevin', '', 'Gerretsen','Straatnaam' , 5,'','Roosendaal',1); 

INSERT INTO Profile VALUES(1,'ProfielMichael',19);
INSERT INTO Profile VALUES(2,'ProfielTeun',19);
INSERT INTO Profile VALUES(3,'ProfielKevin',26);

INSERT INTO Movie VALUES('Shooter',86,'Action','English',16);
INSERT INTO Movie VALUES('Ferdinand',94,'Animation','English',6);
INSERT INTO Movie VALUES('K3 Love Cruise',86,'Family','English',6);
INSERT INTO Movie VALUES('Star Wars Viii: The Last Jedi',150,'Science Fiction','English',12);

INSERT INTO Serie VALUES('Game of Thrones', 57);
INSERT INTO Serie VALUES('Vikings',44);
INSERT INTO Serie VALUES('Stranger Things',51);
INSERT INTO Serie VALUES('Star Trek: Discovery',60);

INSERT INTO Episode VALUES('Dragonstone', 1, 57);
INSERT INTO Episode VALUES('Stormborn', 1,57);
INSERT INTO Episode VALUES('The Queens Justice',1 ,57);

INSERT INTO Episode VALUES('Homeland', 2, 44);
INSERT INTO Episode VALUES('The Plan', 2, 44);
INSERT INTO Episode VALUES('The Prisoner', 2, 44);

INSERT INTO Episode VALUES('The Vanishing of Will Byers', 3, 51);
INSERT INTO Episode VALUES('The Weirdo on Maple Street', 3, 51);
INSERT INTO Episode VALUES('Holly, Jolly', 3, 51);

INSERT INTO Episode VALUES('The Vulcan Hello', 4, 60);
INSERT INTO Episode VALUES('Battle at the Binary Stars', 4, 60);
INSERT INTO Episode VALUES('Context Is for Kings', 4, 60);

INSERT INTO Program VALUES(1,NULL,NULL,1,100);
INSERT INTO Program VALUES(NULL,NULL,1,2,95);
INSERT INTO Program VALUES(2,NULL,NULL,3,100);
INSERT INTO Program VALUES(NULL,1,NULL,2,80);
INSERT INTO Program VALUES(NULL,NULL,2,1,100);
INSERT INTO Program VALUES(3,NULL,1,3,5);
