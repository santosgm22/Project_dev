create table usuarios(

id bigint not null auto_increment,
nome varchar(100) not null,
cpf varchar(14) not null unique,

primary key(id)

);