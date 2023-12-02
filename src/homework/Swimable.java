package homework;

public interface Swimable {
    void swim();
    default double getSwimSpeed(){
        return 5.5;
    }

}
