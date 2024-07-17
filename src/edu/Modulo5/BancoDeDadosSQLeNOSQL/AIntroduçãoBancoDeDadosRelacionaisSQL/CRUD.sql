create TABLE usuarios (
  id INT,
  nome VARCHAR(255) NOT NULL comment 'Nome do usuário',
  email VARCHAR(255) NOT NULL UNIQUE comment 'Endereço de e-mail do usuário',
  data_nascimento DATE NOT NULL comment 'Data de nascimento do usuário',
  endereco VARCHAR(50) NOT NULL comment 'Endereço do Cliente'
);

create TABLE viagens.destinos (
  id INT,
  nome VARCHAR(255) NOT NULL UNIQUE comment 'Nome do destino',
  descricao VARCHAR(255) NOT NULL comment 'Descrição do destino'
);

create TABLE viagens.reservas (
  id INT comment 'Identificador único da reserva',
  id_usuario INT comment 'Referência ao ID do usuário que fez a reserva',
  id_destino INT comment 'Referência ao ID do destino da reserva',
  data DATE comment 'Data da reserva',
  status VARCHAR(255) DEFAULT 'pendente' comment 'Status da reserva (confirmada, pendente, cancelada, etc.)'
);

-- Inserts --
insert into viagens.usuarios (id, nome, email, data_nascimento, endereco) values
(1, 'João Silva', 'joao@example.com', '1990-05-15', 'Rua A, 123, Cidade X, Estado Y'),
(2, 'Maria Santos', 'maria@example.com', '1985-08-22', 'Rua B, 456, Cidade Y, Estado Z'),
(3, 'Pedro Souza', 'pedro@example.com', '1998-02-10', 'Avenida C, 789, Cidade X, Estado Y');

insert into viagens.destinos (id, nome, descricao) values
(1, 'Praia das Tartarugas', 'Uma bela praia com areias brancas e mar cristalino'),
(2, 'Cachoeira do Vale Verde', 'Uma cachoeira exuberante cercada por natureza'),
(3, 'Cidade Histórica de Pedra Alta', 'Uma cidade rica em história e arquitetura');

insert into viagens.reservas (id, id_usuario, id_destino, data, status) values
(1, 1, 2, '2023-07-10', 'confirmada'),
(2, 2, 1, '2023-08-05', 'pendente'),
(3, 3, 3, '2023-09-20', 'cancelada');

-- Selects --

-- Selecionar todos os registros da tabela "usuarios"
select * from usuarios;

-- Selecionar apenas o nome e o email dos usuários
select nome, email from usuarios;

-- Selecionar os usuários que possuem o nome "João Silva"
select * from usuarios where nome = 'João Silva';

-- Selecionar os usuários que nasceram antes de uma determinada data
select * from usuarios where data_nascimento < '1990-01-01';

-- Like
select * from usuarios where nome like '%Silva%';
select * from usuarios where nome like 'Jo_o%';

-- Update --
update usuarios set endereco = 'Nova Rua, 123' where email = 'joao@example.com';

-- delete --
delete from reservas where status = 'cancelada';