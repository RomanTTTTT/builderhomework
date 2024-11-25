package ua.edu.ucu.apps;

import java.time.LocalDate;
import main.java.ua.edu.ucu.apps.*;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                    .name("Roman")
                    .age(18)
                    .height(180)
                    .build();
        System.out.println(user);

        Client client = new Client("Roman",
                                    LocalDate.of(2222, 
                                                2, 
                                                22),
                                    "M",
                                    "mail@mail.com");

        MailInfo mailInfo = new MailInfo(client, new GiftCode());
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo);
        mailBox.sendAll();

        ProxyImage proxyImage = 
                        new ProxyImage("./image.jpeg");
        
        proxyImage.display();
    }
}