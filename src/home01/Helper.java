package home01;

public interface Helper {
    public default void toHelp(){
        System.out.println("Дать назначенный доктором препарат");
    }
}
