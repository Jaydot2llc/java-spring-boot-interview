create table customers (
    id int not null AUTO_INCREMENT,
    firstName varchar(100) not null,
    lastName varchar(100) not null,
    accountNumber int,
    PRIMARY KEY ( id )
);

create table accounts (
    accountNumber int,
    balance float,
    primary key ( accountNumber )
);