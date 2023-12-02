package home01;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable{
    public Fish() {
        super();
    }

    public Fish(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void swim() {

    }

    @Override
    public double getSwimSpeed() {
        return 20;
    }
}
