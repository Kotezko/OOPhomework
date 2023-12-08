package homework.pharm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


//лекарства
public class Pharmacy implements Iterable<PharmacyComponent>, Comparable<Pharmacy>{
    private List<PharmacyComponent> components = new ArrayList<>();
    private int index;


    public void setComponents(List<PharmacyComponent> components) {
        this.components = components;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public List<PharmacyComponent> getComponents() {
        return components;
    }

    public int getIndex() {
        return index;
    }

    public Pharmacy addComponent(PharmacyComponent component){
        components.add(component);
        return this;
    }

    @Override
    public Iterator<PharmacyComponent> iterator() {
        return new IteratorComponent(this);
    }
    public int getPower(Pharmacy o){
        int power = 0;
        for (PharmacyComponent component : o) {
            power += component.getPower();
        }
        return power;
    }
    @Override
    public int compareTo(Pharmacy o) {
        if (getPower(this) < getPower(o)) {
            return -1;
        } else if (getPower(this) > getPower(o)) {
            return 1;
        }return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return index == pharmacy.index && Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, index);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "components=" + components + '}';
    }
}
