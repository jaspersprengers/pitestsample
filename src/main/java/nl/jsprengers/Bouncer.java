package nl.jsprengers;

public class Bouncer {
    enum Gender {
        MALE, FEMALE;
    }

    public boolean welcome(int age, Gender gender) {
        if (gender == Gender.FEMALE) {
            return age >= 18;
        } else
            return age >= 21;
    }
}
