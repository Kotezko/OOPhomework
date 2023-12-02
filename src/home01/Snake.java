package home01;

import java.time.LocalDate;

public class Snake extends Animal implements Crawling, Speakable, Swimable{
    public Snake() {
        super();
    }

    public Snake(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void crawl() {
    }

    @Override
    public double getCrawlSpeed() {
        return 3;
    }

    @Override
    public void speak() {
        System.out.println("hisses");
    }

    @Override
    public void swim() {

    }

    @Override
    public double getSwimSpeed() {
        return 3;
    }
}
