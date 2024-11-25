package ua.edu.ucu.apps;
import java.time.LocalDate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Client {
    private static int counter = 0;
    private final int id;
    private final String name;
    private final LocalDate dob;
    private final String sex;
    private final String email;

    public Client(String name, int dob, String sex, String email) {
        this.id = counter++;
        this.name = name;
        this.dob = dob;
        this.sex = sex;
        this.email = email;
    }
}
