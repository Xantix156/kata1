package software.ulpgc.katas;

import java.time.LocalDate;

public class Person {
    private static final int DAYS_PER_YEAR = 365;
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int age(){
        return (int) ((LocalDate.now().toEpochDay() - birthday.toEpochDay()) / DAYS_PER_YEAR);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

}
