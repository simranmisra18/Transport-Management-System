create database if not exists tours;

USE tours;

/*Table structure for table signup */

DROP TABLE IF EXISTS signup;

CREATE TABLE signup (
  UserId      int(11) NOT NULL AUTO_INCREMENT, 
  Username    varchar(50) NOT NULL,
  Password    varchar(50) NOT NULL,
  Name        varchar(50) NOT NULL,
  Email_Id    varchar(50) NOT NULL,
  Contact_no  varchar(50) DEFAULT NULL,
  DOB         varchar(50) DEFAULT NULL,  
  PRIMARY KEY (UserId),
  UNIQUE KEY  (Username)
);


/*Table structure for table journey */

DROP TABLE IF EXISTS journey;

CREATE TABLE journey (
  JourneyId       int(11)     NOT NULL AUTO_INCREMENT,
  From_           varchar(50) NOT NULL,
  To_             varchar(50) NOT NULL,
  Date_Of_Journey varchar(50) NOT NULL,
  Username        varchar(50) NOT NULL,  
  No_of_seats     varchar(11) NOT NULL,
  Fare            double      NOT NULL,
  PaymentStatus   Varchar(1)  NOT NULL DEFAULT 'P',   /* P(Pending), C(Completed) */ 
  PRIMARY KEY (JourneyId)
);


/*Table structure for table payment */

DROP TABLE IF EXISTS payment; 

CREATE TABLE payment (
  PaymentId       int(11)     NOT NULL AUTO_INCREMENT,
  JourneyId       int(11)     NOT NULL,
  BankName        varchar(50) NOT NULL,
  CardNumber      varchar(50) NOT NULL,
  TransactionDate varchar(50) NOT NULL,
  RefId           varchar(50) DEFAULT NULL,
  PRIMARY KEY (PaymentId)
);

