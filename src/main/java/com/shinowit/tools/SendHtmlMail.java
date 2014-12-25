package com.shinowit.tools;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

/**
 * Created by Administrator on 2014/12/25.
 */
public class SendHtmlMail {

    private String passward;

    private String stmpServer;

    private String username;

    public void sendMessage( String to, String subject, String messageText)throws MessagingException, java.io.UnsupportedEncodingException {

        java.util.Properties props = new java.util.Properties();
        props.setProperty("mail.smtp.auth", "true");//指定是否需要SMTP验证
        props.setProperty("mail.smtp.host", stmpServer);//指定SMTP服务器
        props.put("mail.transport.protocol", "smtp");
        Session mailSession = Session.getDefaultInstance(props);
//        mailSession.setDebug(true);//是否在控制台显示debug信息

        // Step 2:  Construct the message
        InternetAddress fromAddress = new InternetAddress(username);
        InternetAddress toAddress = new InternetAddress(to);

        MimeMessage testMessage = new MimeMessage(mailSession);
        testMessage.setFrom(fromAddress);
        testMessage.addRecipient(javax.mail.Message.RecipientType.TO, toAddress);
        testMessage.setSentDate(new java.util.Date());
        testMessage.setSubject(MimeUtility.encodeText(subject, "utf-8", "B"));

        testMessage.setContent(messageText,"text/html;charset=utf-8");
//        System.out.println("Message constructed");

        // Step 3:  Now send the message
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(stmpServer, username, passward);
        transport.sendMessage(testMessage, testMessage.getAllRecipients());
        transport.close();
//
//
//        System.out.println("Message sent!");
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public String getStmpServer() {
        return stmpServer;
    }

    public void setStmpServer(String stmpServer) {
        this.stmpServer = stmpServer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}