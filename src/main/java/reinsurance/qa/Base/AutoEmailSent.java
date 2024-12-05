package reinsurance.qa.Base;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class AutoEmailSent {
	
public static void main(String[] args) throws Exception {
	
	
	System.out.println("==================================Test Started===============================");
	
	Email email=new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("sachindongare2002@gmail.com","Sachin@4467"));
	email.setSSLOnConnect(true);
	email.setFrom("sachindongare2002@gmail.com", "Sachin Dongare");
	email.setSubject("Test Automatio Report");
	email.setMsg("This mail is send for Sending Automation Test Result");
	email.addTo("sachindongare4467@gmail.com");
	email.send();
	System.out.println("==================================Test Started===============================");
}
}