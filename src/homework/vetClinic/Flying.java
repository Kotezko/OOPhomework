package homework.vetClinic;

public interface Flying {
    void fly();
    default double getFlyingSpeed(){
        return 10.1;
    }
}
