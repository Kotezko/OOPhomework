package homework;


import java.time.LocalDate;

public class Cat extends Animal implements Speakable, Goable, Swimable {
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }

    @Override
    public void run() {

    }

    @Override
    public double getRunSpeed() {
        return 5;
    }

    @Override
    public void swim() {

    }

    @Override
    public double getSwimSpeed() {
        return 2;
    }
}
