package home01;

public interface Goable {
    public static final String type = "Goable"; //поля для интерфейса, public static final писать не обязательно.
    void run();
    default double getRunSpeed(){
        return 5.5;
    }
}
