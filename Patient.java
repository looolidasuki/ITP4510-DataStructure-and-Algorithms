
public class Patient {
    private String name;
    private int triageLevel;
    private int treatmentTime;
    
    public Patient() {
        this.name = null;
        this.triageLevel = 0;
        this.treatmentTime = 0;
    }

    public Patient(String name, int triageLevel, int treatmentTime) {
        this.name = name;
        this.triageLevel = triageLevel;
        this.treatmentTime = treatmentTime;
    }



    public String getName() {
        return name;
    }

    public int getTriageLevel() {
        return triageLevel;
    }

    public int getTreatmentTime() {
        return treatmentTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTriageLevel(int triageLevel) {
        this.triageLevel = triageLevel;
    }

    public void setTreatmentTime(int treatmentTime) {
        this.treatmentTime = treatmentTime;
    }

    
    
}
