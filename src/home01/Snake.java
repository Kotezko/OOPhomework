package home01;

import java.time.LocalDate;

public class Snake extends Animal{
    public Snake() {
        super();
    }

    public Snake(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}
