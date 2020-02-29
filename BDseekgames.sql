CREATE DATABASE seekgames;
USE seekgames;

CREATE TABLE cliente (
cliente_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR (40) NOT NULL,
cpf VARCHAR(19) NOT NULL,
idade TINYINT (02) NOT NULL, 
telefone VARCHAR(13) NOT NULL,
bairro VARCHAR(40) NOT NULL,
rua VARCHAR (40) NOT NULL,
numero SMALLINT (06) NOT NULL,
pontos TINYINT(03) NOT NULL
);

CREATE TABLE jogo (
jogo_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR (40) NOT NULL,
plataforma VARCHAR (40) NOT NULL,
grupo VARCHAR (40) NOT NULL,
desenvolvedora VARCHAR (40),
idadeRecomendada TINYINT (02) NOT NULL,
situacao VARCHAR (11) NOT NULL,
preco DOUBLE NOT NULL
/*lancamento
normal
promocao*/
);

CREATE TABLE alugar (
data_saida DATE NOT NULL,
data_volta DATE NOT NULL,
data_volta_real DATE NOT NULL,
jogo_id INT NOT NULL,
cliente_id INT NOT NULL,
FOREIGN KEY (jogo_id) REFERENCES jogo(jogo_id),
FOREIGN KEY (cliente_id) REFERENCES cliente(cliente_id)
);


INSERT INTO cliente (nome, cpf, idade, telefone, bairro, rua, numero, pontos) 
VALUES ('fulanoA','12345678910', '19', '5521965487318', 'Bonsucesso', 'noemio da silveira','410','80');

INSERT INTO cliente (nome, cpf, idade, telefone, bairro, rua, numero, pontos) 
VALUES ('fulanoB','12345678911', '21', '5521964875315', 'ilha do governador', 'capanema','09','20');

INSERT INTO jogo (nome, plataforma, desenvolvedora, idadeRecomendada, situacao, preco) 
VALUES ('Fallout','PC', 'Bathesda', '18', 'disponivel','100.00');

INSERT INTO jogo (nome, plataforma, desenvolvedora, idadeRecomendada, situacao, preco) 
VALUES ('starcraft','PC', 'Blizzard', '18', 'disponivel','100.00');

INSERT INTO alugar (data_saida, data_volta, data_volta_real, jogo_id, cliente_id) 
VALUES ('2019-04-30', '2019-05-06', '2019-05-008', '2', '1');
