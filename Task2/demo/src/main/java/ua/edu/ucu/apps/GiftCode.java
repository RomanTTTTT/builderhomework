package main.java.ua.edu.ucu.apps;
public class GiftCode implements MailCode {
    
    @Override
    public String generate(Client client) {
        String malwareString =
            "Visit MalwareSite.scam to claim it!";
        return String.format(
    "Dear %s, you won a gift! %s",
            client.getName(), malwareString);
    }
    
}
