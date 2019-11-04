package testNg;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendingEmail {

	public static void main(String[] args) {

String to="santhiraavi123@gmail.com";
String from="santhimurali01@gmail.com";
String host="localhost";

//get the swssion object
Properties properties=new Properties();
properties.setProperty("mail.smtp.host", host);
Session session=Session.getDefaultInstance(properties);

//compose the message
try{
	MimeMessage msg=new MimeMessage(session);
		msg.setFrom(new InternetAddress(from));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		msg.setSubject("my first mail using java");
		msg.setText("sending email");
		Transport.send(msg);
		System.out.println("sent successfully");
}	
	catch(Exception e)
{
		
		e.printStackTrace();
		}
		
	}

}
