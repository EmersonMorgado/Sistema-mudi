# Mudi

O projeto tem como finalidade implementar uma aplicação web com os padrões MVC e Rest, verificar o funcionamento das tecnologias e estudar suas aplicabilidades. 

A aplicação web utiliza o padrão MVC com Framework Spring e Thymeleaf + Expression Language para renderizar as páginas relacionadas ao login, home e formulario de pedidos. 

Para a função de envio de ofertas, foi utilizado padrão Rest para renderização da lista de ofertas, no lado do cliente, utilizando axios com Vue.js. Nesta etapa, a aplicação web consome recursos Rest e renderiza a página html utilizando Vue.js de forma prograsiva e dinâmica. 

O controles de autenticação e validação dos usuários utilizam os recursos do projeto Spting Security com autenticação por sessão e armazenamento de senha com bcrypt, na base de dados.

Utilizamos o Spring Data na camada de persistência com Mariadb.

# Tecnologias utilizadas no projeto:
 -> Spring Boot;
 
 -> Spring Data JPA para consultas, filtros e registros em Banco de Dados;
 
 -> Spring Security
 
 -> MariaDb;
 
 -> Bootstrap para estilos de CSS;
 
 -> Thymeleaf na rendização de páginas HTML utilizando expression language;
 
 -> Formulários com tratativas de erros e apresentação ao usuário com validação de dados utilizando validation e regex;
 
 -> Cache para as consultas rápida dos pedidos.
  
# Descrição resumida da aplicação:

A aplicação permite que um viajante compre produtos, em suas viagens, para as pessoas interessadas. O viajante cadastra os produtos que pode levar (descrição, foto e preço) e as pessoas interessadas fazem ofetas de aquisição destes produtos. Se o viajante gostar da oferta ele marca como aceita, compra o produto e o entrega ao solicitante pelo valor negociado.

# Dinâmica da aplicação:

 O Viajante cadastra os produtos (foto, descrição e preço) que pode trazer da viagem realizada.
 
 A pessoa interessada no produto faz um lance de oferta para o vendedor. 
 
 O vendedor por sua vez aceita ou recusa a oferta dada para o produto que ele cadastrou. 
  
 # Fonte de estudo. 
 Aplicação tem como base o curso de Spring MVC realizado na plataforma alura.com.br.
