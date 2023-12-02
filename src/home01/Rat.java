package home01;

import java.time.LocalDate;

public class Rat extends Animal implements Swimable, Goable, Speakable{
    public Rat() {
        super();
    }

    public Rat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {

    }

    @Override
    public double getRunSpeed() {
        return 2;
    }

    @Override
    public void speak() {
        System.out.println("squeaking");

    }

    @Override
    public void swim() {

    }

    @Override
    public double getSwimSpeed() {
        return 1;
    }
}
