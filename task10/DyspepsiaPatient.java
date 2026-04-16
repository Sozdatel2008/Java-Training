package task10;

public class DyspepsiaPatient extends Patient{

    public DyspepsiaPatient(String name) {
        super(name);
    }

    @Override
    public String getIllness() {
        return "dyspepsia";
    }

    @Override
    public String getTreatment() {
        return "charcoal";
    }
}
