package homework.pharm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PharmacyComponent azitronit = new Azitronit("Azitronit", "10 mg", 50);
        PharmacyComponent penicilin = new Penicilin("Penicilin", "10 mg", 120);
        PharmacyComponent penicilinZero = new Penicilin("Penicilin", "10 mg", 10);
        PharmacyComponent water = new Water("Water", "10 mg", 20);
        PharmacyComponent waterZero = new Water("Water", "10 mg", 1);
        PharmacyComponent holyWater = new Water("Water", "10 mg", 200);

        List<PharmacyComponent> pharmacyComponents = new ArrayList<>();
        pharmacyComponents.add(azitronit);
        pharmacyComponents.add(penicilin);
        pharmacyComponents.add(water);
        pharmacyComponents.add(holyWater);
        pharmacyComponents.add(penicilinZero);
        pharmacyComponents.add(waterZero);

        System.out.println(pharmacyComponents);
        Collections.sort(pharmacyComponents);
        System.out.println(pharmacyComponents);
        System.out.println();


        Pharmacy azitron = new Pharmacy().addComponent(azitronit).addComponent(water);
        Pharmacy ambrozia = new Pharmacy().addComponent(penicilin).addComponent(holyWater);
        Pharmacy pharmacy3 = new Pharmacy().addComponent(penicilin).addComponent(holyWater);
        Pharmacy holyAzitronit = new Pharmacy().addComponent(azitronit).addComponent(holyWater);
        Pharmacy pharmacy5 = new Pharmacy().addComponent(azitronit).addComponent(holyWater);
        Pharmacy zeroPowerPenic = new Pharmacy().addComponent(penicilinZero).addComponent(waterZero);

        Set<Pharmacy> result = new HashSet<>();
        result.add(ambrozia);
        result.add(pharmacy3);
        result.add(holyAzitronit);
        result.add(azitron);
        result.add(pharmacy5);

        System.out.println(result.size());// выводит 3, т.к.добавили только уникальные.
        System.out.println();

        List<Pharmacy> pharmacies2= new ArrayList<>();

        pharmacies2.add(holyAzitronit);//средний
        pharmacies2.add(ambrozia);//самый сильный
        pharmacies2.add(azitron);//самый слабый
        pharmacies2.add(zeroPowerPenic);//адски слабый

        Collections.sort(pharmacies2);// сортирует по суммарной силе компонентов от меньшего к большему
        System.out.println(pharmacies2);
        System.out.println();

        for (PharmacyComponent comp : azitron){
            System.out.println(comp.getName());
        }

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(azitron);
        pharmacies.add(ambrozia);

    }
}
