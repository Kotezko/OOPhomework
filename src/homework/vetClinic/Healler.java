package homework.vetClinic;

public interface Healler {
    default void toHeal(){
        System.out.println("провести диагностику, назначить лечение");
    }
}
