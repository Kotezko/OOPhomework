package homework.vetClinic;

import java.time.LocalDate;

public class Dug extends Animal implements Flying, Goable, Swimable, Speakable{
    public Dug(){
        super();
    }

    public Dug(String name, Illness illness, String ownerName, LocalDate birthday) {
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
        return 6;
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
        System.out.println("quacks");

    }

    @Override
    public void swim() {

    }

    @Override
    public double getSwimSpeed() {
        return 10;
    }
}
