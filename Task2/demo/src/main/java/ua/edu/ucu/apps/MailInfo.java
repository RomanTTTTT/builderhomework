package ua.edu.ucu.apps;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class MailInfo {
    private final Client client;
    private final MailCode mailCode;
    public String generate() {
        return mailCode.generate(client);
    }
}
