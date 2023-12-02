package homework;

import java.time.LocalDate;

public class Staff {
    protected String name;
    protected String position;
    protected Integer salary;
    protected LocalDate birthday;
    public Staff(String name, String position, Integer salary, LocalDate birthday) {
        this.name = name;
        this.position = getClass().getSimpleName();
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " name= '" + name + '\'' +
                ", position= '" + position + '\'' +
                ", salary= " + salary +
                ", birthday= " + birthday + '\n';
    }
}
