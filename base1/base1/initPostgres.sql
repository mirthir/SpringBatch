CREATE TABLE IF NOT EXISTS "tb_dados_base_1" (
    "id" int NOT NULL GENERATED ALWAYS AS IDENTITY,
    "nome" varchar(45) NOT NULL,
    "descricao" varchar(200) DEFAULT NULL,
    "email" varchar(100) NOT NULL,
    "senha" varchar(200) NOT NULL,
    PRIMARY KEY ("id")
);

INSERT INTO tb_dados_base_1("nome", "descricao", "email", "senha") VALUES ('Nome 1', 'Descrição 1', 'email1@gmail.com', '123');
INSERT INTO tb_dados_base_1("nome", "descricao", "email", "senha") VALUES ('Nome 2', 'Descrição 2', 'email2@gmail.com', '231');
INSERT INTO tb_dados_base_1("nome", "descricao", "email", "senha") VALUES ('Nome 3', 'Descrição 3', 'email3@gmail.com', '312');
