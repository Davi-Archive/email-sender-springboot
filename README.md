# Email Sender Spring Boot

Este é um aplicativo simples de envio de email feito em Spring Boot usando JDK8 ou superior com JavaMail. Com este aplicativo, você pode facilmente enviar emails para seus contatos.

## Pré-requisitos

Antes de executar o aplicativo, certifique-se de ter os seguintes requisitos instalados em seu sistema:

- JDK8 ou superior
- Maven

## Instalação e Execução

1. Clone este repositório em sua máquina local usando o git:

```
git clone https://github.com/d1av/email-sender-springboot.git
```

2. Navegue até o diretório raiz do projeto:

```
cd email-sender-springboot
```

3. Construa o aplicativo usando o Maven:

```
mvn clean install
```

4. Execute o aplicativo usando o comando abaixo:

```
java -jar target/email-sender-springboot.jar
```

5. Acesse o aplicativo em `http://localhost:8080`.

## Configuração

Antes de usar o aplicativo, você precisa configurar suas credenciais do Gmail no arquivo `application.properties`:

```
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=seu-email@gmail.com
spring.mail.password=sua-senha
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

Substitua `seu-email@gmail.com` pelo seu endereço de email do Gmail e `sua-senha` pela sua senha. 

Você também pode personalizar o assunto e o corpo do email editando o arquivo `EmailService.java`:

```java
public void sendEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject); // Assunto customizável
        message.setText(text); // Corpo do email customizável
        javaMailSender.send(message);
    }
```

## Como Usar

Após executar o aplicativo, acesse-o em `http://localhost:8080`. Na página inicial, preencha os campos de destinatário, assunto e corpo do email e clique no botão "Enviar". Se tudo estiver configurado corretamente, o aplicativo enviará o email para o endereço especificado.

## Contribuição

Se você quiser contribuir para este projeto, sinta-se à vontade para criar um pull request ou entrar em contato comigo através do meu perfil GitHub.
