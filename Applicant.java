import java.time.LocalDate;
import java.time.Period;

public class Applicant {
    private String name;
    private String position;
    private LocalDate birthDate;
    private int age;

    public Applicant(String name, String position, LocalDate birthDate) {
        this.name = name;
        this.position = position;
        this.birthDate = birthDate;
        this.age = calculateAge(birthDate, LocalDate.now());
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    private int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if (birthDate != null && currentDate != null) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}
