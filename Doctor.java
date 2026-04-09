
public class Doctor {
    private int doctorID;
    private Patient currentPatient;
    private int leaveTime;
    
    public Doctor(int id){
        this.doctorID = id;
        this.currentPatient = null;
        this.leaveTime = 0;
    }
    
    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }

    public void setLeaveTime(int leaveTime) {
        this.leaveTime = leaveTime;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public Patient getCurrentPatient() {
        return currentPatient;
    }

    public int getLeaveTime() {
        return leaveTime;
    }
    
    public void assignPatient(Patient p, int currentMinute){
        this.currentPatient = p;
        this.leaveTime = currentMinute + p.getTreatmentTime();
    }
    
    public boolean isIdle(){
        return leaveTime == 0;
    }
    
    public void updateStatus(int currentMinute){
        if(currentMinute >= leaveTime){
           this.setLeaveTime(0);
           this.currentPatient = null;
        }
    }
}
