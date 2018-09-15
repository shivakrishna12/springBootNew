package TestClass;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

  class JavaGMail {
	public static void send(String from,String password,String to,String sub,String msg){  
        //Get properties object    
		System.out.println("==========1111111111");
        Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");    
        //get Session   
        Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {    
             
         protected PasswordAuthentication getPasswordAuthentication() {    
         return new PasswordAuthentication("shiva.java15@gmail.com","111SHiva@@@");  
         }    
        });    
        //compose message    
        try {    
        	
        	System.out.println("==========22222222222222222222======");
         MimeMessage message = new MimeMessage(session);    
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
         System.out.println("to======================"+to);    
         message.setSubject(sub);    
         message.setText(msg);    
         System.out.println("to======================"+msg);    
         
         //send message  
         Transport.send(message);    
         System.out.println("message sent successfully");    
        } catch (MessagingException e) {throw new RuntimeException(e);}    
           
  }  
}  
 public class JavaMail{    
public static void main(String[] args) {    
   //from,password,to,subject,message  
	
     
	
	JavaGMail.send("shiva@gmail.com","111SHiva@@@","shivakrishna.d16@gmail.com","hello naveen ","How r u?");  
   //change from, password and to  
}    
}
