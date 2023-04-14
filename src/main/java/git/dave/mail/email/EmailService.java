package git.dave.mail.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private static final Logger log = LoggerFactory
	    .getLogger(EmailService.class);

    private final JavaMailSender javaMailSender;

    public EmailService(final JavaMailSender javaMailSender) {
	this.javaMailSender = javaMailSender;
    }

    public void enviar(String para, String titulo, String conteudo) {
	log.info("Enviando email para confirmação de cadastro");

	SimpleMailMessage mensagem = new SimpleMailMessage();

	mensagem.setTo(para);
	mensagem.setSubject(titulo);
	mensagem.setText(conteudo);
	javaMailSender.send(mensagem);
	
	log.info("Email enviado com sucesso!");
    }

}
