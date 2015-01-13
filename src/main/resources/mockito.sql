drop database IF EXISTS mockito;

CREATE database mockito;

USE mockito;

CREATE TABLE User(
	id int NOT NULL,
	name varchar(30) NOT NULL,
	age int NULL,
	
	PRIMARY KEY (id)
);