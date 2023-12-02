package home01;

public interface Healler {
    default void toHeal(){
        System.out.println("провести диагностику, назначить лечение");
    }
}
