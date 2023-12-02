package homework;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat(); //экземпляр класса
//        cat.setName("barsic");
        VeterinaryClinic clinic = new VeterinaryClinic();
        Cat cat = new Cat("barsik", null, "Anna",
                LocalDate.of(2004,6,20));
        Dog dog = new Dog("max",new Chumka("chumka"), "petr",
                LocalDate.of(2003,12,21));
        Dug dug = new Dug("buba",null,"David",
                LocalDate.of(2021,11,20));
        Fish fish = new Fish("boat", null, "andrey",
                LocalDate.of(2023,9,20));
        Rat rat = new Rat("Floid", null, "ivan",
                LocalDate.of(2022,3,12));
        Snake snake = new Snake("shush", null, "anton",
                LocalDate.of(2012,3,5));
        Sparrow sparrow = new Sparrow("blob", null, "max",
                LocalDate.of(2022,1,2));

//        System.out.println(cat.getName());
//        System.out.println(dog.getName());
//        System.out.println(dog.getIllness());
//        System.out.println(dug.getName());
//        System.out.println(dug.getIllness());

//        clinic.addPatient(cat).addPatient(dog).addPatient(dug).addPatient(fish).addPatient(rat).addPatient(snake).addPatient(sparrow);
//        System.out.printf("%nВсе пациенты:%n");
//        System.out.println(clinic.getPatients());
//        System.out.printf("%nВсе бегающие:%n");
//        System.out.println(clinic.getGoable());
//        System.out.printf("%nВсе ползающие:%n");
//        System.out.println(clinic.getCrawling());
//        System.out.printf("%nВсе летающие:%n");
//        System.out.println(clinic.getFlying());
//        System.out.printf("%nВсе издающие звуки:%n");
//        System.out.println(clinic.getSpeakable());
//        System.out.printf("%nВсе плавающие:%n");
//        System.out.println(clinic.getSwimable());

        Nurse nurse = new Nurse("Anna","nurse",30000,LocalDate.of(1995,7,12));
        Doctor doctor = new Doctor("Ivan","doctor",50000,LocalDate.of(1993,2,12), nurse);
        clinic.addStaff(doctor).addStaff(nurse);

        System.out.printf("%nВесь персонал:%n");
        System.out.println(clinic.getStaff());
        System.out.printf("%nВсе врачи:%n");
        System.out.println(clinic.getDoctors());
        System.out.printf("%nВсе медсестры:%n");
        System.out.println(clinic.getNurses());


//        rat.speak();
//        System.out.println(dog.getRunSpeed());
//        System.out.println(rat.getSwimSpeed());



    }
}
