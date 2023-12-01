package home01;

import java.time.LocalDate;

public class Dug extends Animal{
    public Dug(){
        super();
    }

    public Dug(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}
