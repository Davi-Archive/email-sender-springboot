package git.dave.mail.email.messages;

public class Register {
    public static String createTitle(String user) {
	return user + "seu cadastro foi recebido";
    }
    
    
    public static String messageToNewUser(String user) {
	return "Olá "+ user;
    }
}
