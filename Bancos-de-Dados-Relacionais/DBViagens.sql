CREATE DATABASE viagens;

USE viagens;

/*
 * Criação das tabelas.
 */

CREATE TABLE viagens.usuarios
(
    id              INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nome            VARCHAR(100) NOT NULL COMMENT 'Nome do usuário',
    email           VARCHAR(100) NOT NULL UNIQUE COMMENT 'Email do usuário',
    data_nascimento DATE         NOT NULL COMMENT 'Data de nascimento do usuário',
    endereco        VARCHAR(100) NOT NULL COMMENT 'Endereço do usuário'
);

CREATE TABLE viagens.destinos
(
    id        INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nome      VARCHAR(60) NOT NULL COMMENT 'Nome do destino',
    descricao VARCHAR(80) NOT NULL COMMENT 'Descrição do destino'
);

CREATE TABLE viagens.reservas
(
    id           INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    id_usuario   INT COMMENT 'Referência ao ID do usuário que fez a reserva',
    id_destino   INT COMMENT 'Referência ao ID do usuário que fez a reserva',
    data_reserva DATE COMMENT 'Data da reserva',
    status       VARCHAR(15) DEFAULT 'Pendente' COMMENT 'Status da reserva (Confirmada), (Pendente), (Cancelada), etc.'
);

/*
 * Inserção de dados
 */
-- Tabela usuarios
INSERT INTO viagens.usuarios (id, nome, email, data_nascimento, endereco)
    VALUES (1, 'José', 'jose@mail.com', '1995-05-20', 'Rua Carlos Domício, 500 - Bairro Juventude - Juiz de Fora/MG');

INSERT INTO viagens.usuarios (id, nome, email, data_nascimento, endereco)
    VALUES (2, 'Maria', 'maria@mail.com', '1990-10-23', 'Rua Zezé das Couves, 30 - Bairro Recanto da Mata - Juiz de Fora/MG');

INSERT INTO viagens.usuarios (id, nome, email, data_nascimento, endereco)
    VALUES (3, 'Roberta', 'roberta@mail.com', '1998-11-20', 'Rua Dalvo Trombeta, 500 - Bairro Vila Elvira - Juiz de Fora/MG');

-- Tabela destinos
INSERT INTO viagens.destinos (id, nome, descricao)
    VALUES (1, 'Paris', 'Venha conhecer a Torre Eiffel');

-- Tabela reservas
INSERT INTO viagens.reservas (id, id_usuario, id_destino, data_reserva, status)
    VALUES (1, 1, 1, '2024-07-24', 'Pendente');

/*
 * Visualização dos dados.
 */
SELECT * FROM usuarios;
SELECT * FROM destinos;
SELECT * FROM reservas;

SELECT * FROM usuarios WHERE id = 1;

/*
 * Atualizando dados
 */
 UPDATE viagens.usuarios
    SET id = 3
    WHERE email = 'roberta@mail.com';