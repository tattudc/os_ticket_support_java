use os_ticket;
CREATE TABLE CHAMADOS (
  ID BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  CLIENTES_ID BIGINT UNSIGNED NOT NULL,
  RESP_TECNICOS_ID BIGINT UNSIGNED NOT NULL,
  ASSUNTO VARCHAR(45) NOT NULL,
  SITUACAO BOOL NOT NULL,
  DESCRICAO VARCHAR(255) NULL,
  PRIMARY KEY(ID),
  INDEX RESP_TECNICO_FK(RESP_TECNICOS_ID),
  INDEX CLIENTE_FK(CLIENTES_ID)
);

CREATE TABLE CLIENTES (
  ID BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  NOME VARCHAR(255) NULL,
  CNPJ VARCHAR(20) NULL,
  TELEFONE VARCHAR(20) NULL,
  PRIMARY KEY(ID)
);

CREATE TABLE RESP_TECNICOS (
  ID BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  NOME VARCHAR(255) NULL,
  EMAIL VARCHAR(255) NULL,
  PRIMARY KEY(ID)
);

CREATE TABLE TRAMITES (
  ID BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  CHAMADOS_ID BIGINT UNSIGNED NOT NULL,
  DESCRICAO VARCHAR(255) NOT NULL,
  SITUACAO VARCHAR(45) NULL,
  PRIMARY KEY(ID),
  INDEX CHAMADO_FK(CHAMADOS_ID)
);

