package homework;

import java.time.LocalDate;

public class Nurse extends Staff implements Helper {

    public Nurse(String name, String position, Integer salary, LocalDate birthday) {
        super(name, position, salary, birthday);
    }

    @Override
    public void toHelp() {
        Helper.super.toHelp();
    }
}
