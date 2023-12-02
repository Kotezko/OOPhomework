package home01;

import java.time.LocalDate;

public class Doctor extends Staff implements Healler{
    private Staff nurse;
    public Doctor(String name, String position, Integer salary, LocalDate birthday,Staff nurse) {
        super(name, position, salary, birthday);
        this.nurse = nurse;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " name= '" + name + '\'' +
                ", position= '" + position + '\'' +
                ", salary= " + salary +
                ", birthday= " + birthday +
                ", Helper = " + nurse + "\n";
    }


    @Override
    public void toHeal() {
        Healler.super.toHeal();
    }
}
