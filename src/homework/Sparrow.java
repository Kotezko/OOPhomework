package homework;

import java.time.LocalDate;

public class Sparrow extends Animal implements Flying, Goable, Speakable{
    public Sparrow() {
        super();
    }

    public Sparrow(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly() {

    }

    @Override
    public double getFlyingSpeed() {
        return 5;
    }

    @Override
    public void run() {

    }

    @Override
    public double getRunSpeed() {
        return 1;
    }

    @Override
    public void speak() {
        System.out.println("chirps");
    }
}
