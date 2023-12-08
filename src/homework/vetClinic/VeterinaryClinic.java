package homework.vetClinic;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    private List<Staff> staff = new ArrayList<>();
    public List<Animal> getPatients(){
        return patients;
    }
    public List<Staff> getStaff(){
        return staff;
    }
//    public void addPatient(Animal patient){
//        patients.add(patient);
//    }
    public VeterinaryClinic addPatient(Animal patient){
        patients.add(patient);
        return this;
    }
    public VeterinaryClinic addStaff(Staff worker){
        staff.add(worker);
        return this;
    }

    public void removeWorker(Staff worker){
        staff.remove((worker));
    }
    public void removePatient(Animal patient){
        patients.remove(patient);
    }
    public List<Healler> getDoctors(){
        List<Healler> result = new ArrayList<>();
        for(Staff doctor : staff){
            if(doctor instanceof Healler){
                result.add((Healler) doctor);
            }
        }
        return result;
    }
    public List<Helper> getNurses(){
        List<Helper> result = new ArrayList<>();
        for(Staff nurse : staff){
            if(nurse instanceof Helper){
                result.add((Helper) nurse);
            }
        }
        return result;
    }

    public List<Goable> getGoable(){
        List<Goable> result = new ArrayList<>();
        for(Animal animal : patients){
            if(animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }
    public List<Flying> getFlying(){
        List<Flying> result = new ArrayList<>();
        for(Animal animal : patients){
            if(animal instanceof Flying){
                result.add((Flying) animal);
            }
        }
        return result;
    }
    public List<Crawling> getCrawling(){
        List<Crawling> result = new ArrayList<>();
        for(Animal animal : patients){
            if(animal instanceof Crawling){
                result.add((Crawling) animal);
            }
        }
        return result;
    }
    public List<Speakable> getSpeakable(){
        List<Speakable> result = new ArrayList<>();
        for(Animal animal : patients){
            if(animal instanceof Speakable){
                result.add((Speakable) animal);
            }
        }
        return result;
    }
    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for(Animal animal : patients){
            if(animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }
}
