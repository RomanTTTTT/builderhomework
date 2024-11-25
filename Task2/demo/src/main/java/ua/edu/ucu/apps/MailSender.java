package main.java.ua.edu.ucu.apps;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mailjet.client.*;

public class MailSender {
    private static final String API_KEY = 
                                    "69b37d9b237fd68db56fea2ca33d731c";

    private static final String API_SECRET = 
                                    "03d00552d750df66bdacb44237ec1281";

    public void sendMail(MailInfo mailInfo) {
        ClientOptions options = ClientOptions.builder()
            .apiKey(API_KEY)
            .apiSecretKey(API_SECRET)
            .build();

        MailjetClient client = new MailjetClient(options);

        MailjetRequest request = new MailjetRequest(Emailv31.resource)
            .property(Emailv31.MESSAGES, new JSONArray()
                .put(new JSONObject()
                    .put(Emailv31.Message.FROM, new JSONObject()
                        .put("Email", "tyshniuk.pn@ucu.edu.ua")
                        .put("Name", "Roman"))
                    .put(Emailv31.Message.TO, new JSONArray()
                        .put(new JSONObject()
                            .put("Email", mailInfo.getClient().getEmail())
                            .put("Name", mailInfo.getClient().getName())))
                    .put(Emailv31.Message.SUBJECT, "Greetings.")
                    .put(Emailv31.Message.TEXTPART, mailInfo.generate())
                    .put(Emailv31.Message.CUSTOMID, "AppTest")));

        try {
            MailjetResponse response = client.post(request);
            System.out.println(
            "Email sent successfully. Status Code: " + response.getStatus());
        } catch (com.mailjet.client.errors.MailjetException e) {
            System.out.println("Error sending email: " + e.getMessage());
        }
    }
}