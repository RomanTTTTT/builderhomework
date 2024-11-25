package ua.edu.ucu.apps;
public class BirthdayCode implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Happy Birthday to you, dear %s!", client.getName());
    }
}
