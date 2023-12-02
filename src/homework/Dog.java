package homework;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Speakable, Swimable {
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("dog run");
    }

    @Override
    public double getRunSpeed() {
        return 8.2;
    }

    @Override
    public void speak() {
        System.out.println("barking");
    }

    @Override
    public void swim() {
    }

    @Override
    public double getSwimSpeed() {
        return 2;
    }
}
