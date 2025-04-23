# Projeto Spring Boot – Sistema de Cadastro de Alunos e Cursos

## 📚 Descrição
Este projeto foi desenvolvido como parte da aula de Arquitetura de Aplicação Web, utilizando o framework Spring Boot. O objetivo principal foi demonstrar a criação de uma aplicação CRUD com as entidades **Aluno** e **Curso**.

---

## 🛠️ Tecnologias Utilizadas
- **Spring Boot**: Framework para simplificar o desenvolvimento de aplicações Java.
- **Spring Web**: Para criação de APIs REST.
- **Spring Data JPA**: Para integração com banco de dados utilizando o padrão JPA.
- **Lombok**: Para reduzir a verbosidade do código, gerando automaticamente getters, setters, construtores, etc.
- **Spring DevTools**: Para facilitar o desenvolvimento com recarregamento automático.
- **MariaDB**: Banco de dados relacional utilizado no projeto.

---

## 📁 Estrutura do Projeto
O projeto segue a estrutura padrão do Spring Boot:

- `controller/` → Contém os controladores responsáveis por expor as APIs REST.
- `model/` → Contém as classes que representam as entidades do banco de dados.
- `repository/` → Contém as interfaces para acesso ao banco de dados.
- `service/` → Contém a lógica de negócio da aplicação.

---

## 👥 Entidades

### Aluno
Representa um aluno matriculado em algum curso.  
**Atributos**: `id`, `nome`, `email`, `data de nascimento`, `matricula` e `curso`.

### Curso
Representa um curso oferecido pela instituição.  
**Atributos**: `id`, `nome`, `descricao`, `cargaHoraria`, `nivel` e `aluno`.

### Relacionamento Aluno-Curso
O relacionamento entre as entidades **Aluno** e **Curso** é do tipo muitos-para-muitos (Many-to-Many), onde:

- Um **Curso** pode ter vários **Alunos** associados.
- Um **Aluno** pode estar matriculado a vários **Cursos**.

---

## 🛠️ Configuração do Banco de Dados
O projeto utiliza o **MariaDB** como banco de dados.  
Recomenda-se o uso do **XAMPP**, que fornece um ambiente integrado com MariaDB.

### Configurando o XAMPP
1. Baixe e instale o XAMPP: https://www.apachefriends.org/pt_br/index.html  
2. Abra o painel de controle e inicie o serviço do MariaDB (MySQL).
3. Configure as credenciais do banco no arquivo `application.properties` ou application.yaml do projeto::

```properties
spring.datasource.url=jdbc:mariadb://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update.
```
## Executando o Projeto
Certifique-se de que o MariaDB está em execução no XAMPP.

Abra o projeto no Visual Studio Code.

Verifique se a extensão Spring Boot Extension Pack está instalada no VS Code.

No painel lateral do Spring Boot Dashboard, localize o projeto e clique no botão ("play") para iniciar a aplicação.

Acesse a aplicação no navegador ou em ferramentas como Postman, utilizando o endereço:
http://localhost:8080

## Endpoints Principais

## Curso
GET /cursos
Lista todos os cursos.

POST /cursos
Cria um novo curso.

GET /cursos/{id}
Retorna os detalhes de um curso específico.

PUT /cursos/{id}
Atualiza um curso existente.

DELETE /cursos/{id}
Exclui um curso.

## Aluno
GET /alunos
Lista todos os alunos.

POST /alunos
Cria um novo aluno.

GET /alunos/{id}
Retorna os detalhes de um aluno específico.

PUT /alunos/{id}
Atualiza um aluno existente.

DELETE /alunos/{id}
Exclui um aluno.

💡 Os endpoints refletem a estrutura básica do CRUD e podem ser complementados com endpoints específicos para matrícula de alunos em cursos, se necessário.

## Conclusão
Este projeto serve como base para entender os conceitos fundamentais do Spring Boot e como criar uma aplicação CRUD com relacionamento Many-to-Many entre entidades, utilizando o Spring Data JPA.
Ele pode ser expandido para incluir autenticação, validações, paginação, filtros e outras funcionalidades conforme a evolução da aplicação.


