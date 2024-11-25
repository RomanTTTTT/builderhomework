package ua.edu.ucu.apps;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

enum Gender {
    MALE, FEMALE
}

@Getter @Setter @Builder
public class User {
    private String name;
    private Gender gender;
    private int age;
    private double height;
    private double weight;
    @Singular("grade")
    private List<Integer> grades;

    @Override
    public String toString() {
        return "User(name=" + this.getName() +
         ", age=" + this.getAge() +
         ", height=" + this.getHeight() + ")";
    }
}
