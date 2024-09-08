# Projeto de Microserviços em Java

Este projeto é uma aplicação de microserviços desenvolvida em Java utilizando o framework Spring Boot. O objetivo principal do projeto é demonstrar o uso de microserviços com recursos como envio de e-mails, validação de dados, acesso a banco de dados e integração com filas de mensagens.

## Descrição

O projeto é uma aplicação Spring Boot que inclui as seguintes funcionalidades:

- **Envio de e-mails**: Utiliza `spring-boot-starter-mail` para enviar e-mails.
- **Validação de dados**: Utiliza `spring-boot-starter-validation` para validar entradas.
- **Acesso a banco de dados**: Utiliza `spring-boot-starter-data-jpa` e um banco de dados em memória H2 para armazenamento.
- **Integração com filas de mensagens**: Utiliza `spring-boot-starter-amqp` para integração com RabbitMQ.
- **Desenvolvimento com Lombok**: Utiliza Lombok para reduzir o código boilerplate.


## Pré-requisitos

Antes de rodar o projeto localmente, verifique se você possui os seguintes pré-requisitos instalados:

- **Java JDK 21**: Certifique-se de que a versão 21 do JDK está instalada e configurada no seu ambiente.
- **Maven**: Certifique-se de que o Apache Maven está instalado para gerenciar as dependências e construir o projeto.
- **Conta de E-mail**: Configure uma conta de e-mail para utilizar com `spring-boot-starter-mail`. As configurações necessárias devem ser adicionadas ao arquivo `application.properties` ou `application.yml`.
- **Conta no CloudAMQP**: Crie uma conta em [CloudAMQP](https://www.cloudamqp.com/) para obter uma instância do RabbitMQ. As credenciais e o URL da instância devem ser configurados no arquivo `application.properties` ou `application.yml`.

## Configuração

- **Configuração de E-mail**: Configure as propriedades de e-mail no arquivo `application.properties` ou `application.yml`. Por exemplo:

    ```properties
    spring.mail.host=smtp.seu-servidor-de-email.com
    spring.mail.port=587
    spring.mail.username=seu-email@dominio.com
    spring.mail.password=sua-senha
    spring.mail.properties.mail.smtp.auth=true
    spring.mail.properties.mail.smtp.starttls.enable=true
    ```

- **Configuração de RabbitMQ**: Configure as propriedades de RabbitMQ no arquivo `application.properties` ou `application.yml`. Por exemplo:

    ```properties
    spring.rabbitmq.addresses=url-amqp
    spring.rabbitmq.queue=nome-queue
    ```

    Onde `spring.rabbitmq.addresses` deve ser configurado com a URL completa do RabbitMQ fornecida pelo CloudAMQP.

### Estrutura da requisição
```json
{
    "ownerRef":"",
    "emailFrom":"",
    "emailTo":"",
    "subject":"",
    "text":""
}
```

### Estrutura da resposta
```json
{
    "emailId": "",
    "ownerRef": "",
    "emailFrom": "",
    "emailTo": "",
    "subject": "",
    "text": "",
    "sendDateEmail": "",
    "statusEmail": ""
}
```

### Materiais de Referência

- [Criando um microservice de envio de email](https://www.youtube.com/watch?v=ZBleZzJf6ro)
- [API Spring Boot, JPA e H2 do jeito certo](https://www.youtube.com/watch?v=HHXn-nT3g10)
- [Spring Boot With H2 Database](https://www.baeldung.com/spring-boot-h2-database)
- [String AMQP](https://docs.spring.io/spring-amqp/reference/index.html)
- [Spring IO Guide - RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq)