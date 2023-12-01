package home01;

import java.time.LocalDate;

public class Rat extends Animal{
    public Rat() {
        super(
        );
    }

    public Rat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}
