package git.dave.mail.services;

import org.springframework.stereotype.Service;

import git.dave.mail.email.EmailService;
import git.dave.mail.email.messages.Register;

@Service
public class UserService {

    private static EmailService sendEmailService;

    public UserService(EmailService sendEmailService) {
	this.sendEmailService = sendEmailService;
    }

    public static String save(String text) {
	sendEmailService.enviar("davi4alves@gmail.com", text,
		Register.messageToNewUser(text));
	return text;
    }

}
