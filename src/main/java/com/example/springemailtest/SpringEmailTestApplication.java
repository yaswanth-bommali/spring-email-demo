package com.example.springemailtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class SpringEmailTestApplication {

    @Autowired
    private EmailSenderService mailSender;

    public static void main(String[] args) {
        SpringApplication.run(SpringEmailTestApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void sendMail(){
        mailSender.sendEmail("yaswanth.9980@gmail.com","Test Subject","This is a test message");
    }

}
