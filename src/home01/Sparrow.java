package home01;

import java.time.LocalDate;

public class Sparrow extends Animal{
    public Sparrow() {
        super();
    }

    public Sparrow(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}
