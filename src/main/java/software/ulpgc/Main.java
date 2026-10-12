package software.ulpgc;

public class Main {
    static void main() {
        Person person = new Person("Santi", java.time.LocalDate.of(2006, 2, 17));
        System.out.println(person.getName() + " tiene " + person.age() + " años.");

    }
}
