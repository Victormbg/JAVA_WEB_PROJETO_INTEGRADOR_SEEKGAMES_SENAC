create database oficinazin;

use oficinazin;

create table cep(
    cep varchar (12) not null primary key,
    logradouro varchar(60) not null,
    bairro varchar(40) not null,
    cidade varchar(40) not null,
    uf char(2) not null);
    
    INSERT INTO CEP(CEP,LOGRADOURO,BAIRRO,CIDADE,UF)VALUES
	('26551-090','Travessa Elpidio','Cruzeiro do Sul','Mesquita','RJ'),
	('26551-110','Rua Bagre','Cruzeiro do Sul','Mesquita','RJ'), 
	('26551-140','Rua Paulo','Vila Emil','Mesquita','RJ'),
	('23085-610','Rua Padre Pauwels','Campo Grande','Rio de Janeiro','RJ');
    
create table cliente(
	idcliente smallint not null auto_increment primary key, 
    nome varchar(60) not null,
    cep varchar(12)not null,
    numero smallint not null,
    complemento varchar(30) not null,
    telefone varchar(15) not null,
    foreign key(cep) references cep(cep));
    
    INSERT INTO CLIENTE(NOME,CEP,NUMERO, COMPLEMENTO, TELEFONE)VALUES
	('Manoel da Costa','26551-090','10','Fundos','(21)3358-9856'),
	('Maria da Silva','23085-610','1241','Casa','(21)2224-114521'),
	('Pedro Henrique Dias','26551-140','52','Casa','(21)988875-4578'),
	('Amanda Silveira Silva','26551-110','407','Casa','(21)3589-7784');
    

create table veiculo(
	placa varchar(10) not null primary key,
    marca varchar(60) not null,
    modelo varchar(60) not null,
    ano int (20) not null,
    cor varchar(20) not null,
    idcliente smallint not null,
    foreign key(idcliente) references cliente (idcliente));
    
    
    INSERT INTO VEICULO(PLACA, MARCA, MODELO, ANO, COR, IDCLIENTE)VALUES
	('LUW5554','FIAT','UNO',2006,'PRETO',1),
	('LAU','FORD','KA',2016,'BRANCO',3),
	('APZ5525','FIAT','PALIO',2012,'PRATA',2),
	('ACX2185','CHEVROLET','ONIX',2017,'PRATA',4);

SELECT * FROM servico_profissional;
create table servicos(
	idservico smallint not null auto_increment primary key, 
    descricao_dano varchar(100) not null,
    preco double not null,
    data_entrada date not null,
    data_saida date not null,
    placa varchar (10) not null);
    
    
    
    INSERT INTO SERVICOS(DESCRICAO_DANO, PRECO, DATA_ENTRADA, DATA_SAIDA, PLACA)VALUES
	('Motor Engasgando','200','2019-01-10','2019-01-10','APZ5525'),
	('Falhando Troca de Velocidade','200','2019-01-10','2019-01-12','LAU1128'),
	('Barulho na Roda Dianteira','400','2019-01-11','2019-01-11','LUW5554'),
	('Puxando Direção para a Direita','500','2019-03-10','2019-03-10','ACX2185');
    
    
create table profissional(
	idprofissional smallint not null auto_increment primary key, 
    especialidade varchar(50) not null,
    custo_hora smallint not null);
    
	INSERT INTO PROFISSIONAL(ESPECIALIDADE, CUSTO_HORA)VALUES
	('Lanterneiro','130'),
	('Mecânico','100'),
	('Pintor','150'),
	('Eletricista','170');
    

create table servico_profissional(
	idservico_profissional smallint not null auto_increment primary key, 
    idservico smallint not null,
    idprofissional smallint not null,
    numero_horas smallint not null,
    foreign key (idservico) references servicos (idservico),
    foreign key (idprofissional) references profissional (idprofissional));
    
    INSERT INTO SERVICO_PROFISSIONAL(IDPROFISSIONAL, IDSERVICO, NUMERO_HORAS)VALUES
	(2,1,2),
	(2,3,2),
	(2,4,2),
	(2,2,3);
    
create table pecas(
	idpeca smallint not null auto_increment primary key, 
    nome varchar(100) not null,
    preco_unitario double not null,
    qtd_estoque smallint not null);
    
    INSERT INTO PECAS(NOME,PRECO_UNITARIO,QTD_ESTOQUE)VALUES
	('Vela Bosh','60','35'),
	('Cabo de Vola Jogo','75','25'),
	('Braço Articulado Direito','130','10'),
	('Amortecedor Dianteiro Par Monroe','250','10'),
	('Feixe de Mola','175','4');
    
    
create table servico_pecas(
	idservico_peca smallint not null auto_increment primary key, 
    idpeca smallint	not null,
    idservico smallint not null,
    qtd_usada smallint not null,
    foreign key (idpeca) references pecas (idpeca),
    foreign key (idservico) references servicos (idservico));
    
    INSERT INTO SERVICO_PECAS(IDPECA, IDSERVICO, QTD_USADA)VALUES
	('1','1','2'),
	('2','2','1'),
	('3','3','1'),
	('4','4','1');
    
    
    
/* Mostrar os nomes da tabela cliente */

SELECT * FROM CLIENTE;

/* Mostrar nome e telefone da tabela cliente */

SELECT nome,telefone from cliente;

/*Mostrar nome e telefone de clientes que comecem com a letra "a", =  a% = A no começo %a% = A no meio do nome , %a = A no final do nome                     */

select nome, telefone from cliente
where nome like 'a%';

/* Mostrar a quantidade total de pecas no estoque, ou seja, soma */

select sum(qtd_estoque)from pecas; 

/*Mostrar o valor medio das pecas do estoque */

select avg(preco_unitario)from peca;


/* Mostrar a peça com maior quantidade em estoque */

select max(quant_estoque) from peca;


select nome,max(quant_estoque) from peca;


/* Mostrar a peça com a menor quantidade em estoque */

select nome,min(qtd_estoque) from pecas;

/* Mostrar nome de todas as pecas com quantidade em estoque maior que 15 unidades */

select nome from pecas
where qtd_estoque >15

/* Mostrar nome de todas as pecas com quantidade em estoque maior que 15 unidades e preco menor que 70 reais */

select nome,qtd_estoque from pecas
where qtd_estoque >15
and preco_unitario <70










Leonardo da Silva Fabbio
Senac - Bonsucesso
Téc.Informática
/* Exercício */

Leonardo da Silva Fabbio
Senac - Bonsucesso
Téc.Informática

/*1)Mostrar nome e telefone dos clientes que moram na região do 
cep que começa com 26551. */

select nome,cliente.cep,numero,complemento,logradouro,cidade,uf from cep,cliente
where cep.cep = cliente.cep


/*2) Mostrar modelo, ano e cor de todos os veículos da fiat cadastrados. */
select modelo,ano,cor,marca from veiculo
where marca = 'fiat';


/* 3) Mostrar o valor total em estoque. */
select sum(preco_unitario)from pecas;


 /*4) Mostrar as especialidades dos profissionais que ganham mais 
de R$100,00 a hora.*/
select especialidade,custo_hora from profissional
where custo_hora >100


/*5) Mostrar o maior valor de mão de obra da oficina por especialidade.''*/
select especialidade, max(custo_hora) from profissional;


/*6) Consultar nome e endereço de todos os clientes que moram no bairro vila emil*/
select nome,cliente.cep,logradouro,numero,complemento,bairro,cidade,uf from cep,cliente
where cep.cep = cliente.cep
and bairro = 'vila emil';

/* Utilizando o Inner Join
select nome,cliente.cep,logradouro,numero,complemento,bairro,cidade,uf from cep inner join cliente
on cep.cep = cliente.cep
and bairro = 'vila emil';
*/


/*7) Consultar nome dos clientes, telefone, placa do veiculo, modelo e marca.*/ 
select nome,telefone,placa,modelo,marca from cliente, veiculo;


/*8) consultar nome,telefone e placa do veiculo do cliente do serviço código 3.*/
select nome, telefone, veiculo.placa, idservico from cliente, veiculo, servicos
where cliente.idcliente = veiculo.idcliente
and veiculo.placa = servicos.placa
and idservico = '3';
/*Utilizando o Inner join
select nome, telefone, veiculo.placa, idservico from cliente inner join veiculo inner join servicos
on cliente.idcliente = veiculo.idcliente
and veiculo.placa = servicos.placa
and idservico = '3';
*/

/*9) Nome de todas as peças usadas na ordem de serviço número 1.*/
select nome, servicos.idservico from pecas, servicos
where idservico = '1';


/*10)Mostrar a(s)  especialidade(s) de profissional que realizaram o 
Serviço de código 2.*/
select especialidade, servico_profissional.idservico from profissional, servico_profissional, servicos
where servicos.idservico = servico_profissional.idservico
and profissional.idprofissional = servico_profissional.idprofissional
and idservico_profissional = '2';

/*Utilizando o Inner Join 
select especialidade, servico_profissional.idservico from profissional inner join servico_profissional inner join servicos
on servicos.idservico = servico_profissional.idservico
and profissional.idprofissional = servico_profissional.idprofissional
and idservico_profissional = '2';
*/

