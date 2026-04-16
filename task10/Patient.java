package task10;

public class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIllness(){
        return "Undefined";        
    }

    public String getTreatment(){
        return "Undefined";        
    }
}
