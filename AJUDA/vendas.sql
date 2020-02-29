create database vendas;

use vendas;

create table cliente(
    ID varchar (12) not null primary key,
    CPF int(20) not null,
    Nome varchar(200) not null,
    Idade int(100) not null,
    sexo varchar(200) not null);