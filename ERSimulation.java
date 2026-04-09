
import java.util.Scanner;


public class ERSimulation {
    private static int simulationLength;
    private static int maxDoctors;
    private static Doctor[] doctors;
    
    private static PriorityQueue waitLine = new PriorityQueue();
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        try{
            
            
            
        }
        catch(RuntimeException e){}
        catch(Exception e){}
        finally{}
    }
    
    private static void setup()throws SimulationTimeException, DoctorCountException{
        
            System.out.println("-------------SETUP SIMULATION ENVIRONMENT-------------");
            System.out.println("Input simulation length (min): ");
            simulationLength = input.nextInt();
            if(simulationLength <= 0){
                throw new SimulationTimeException();
            }
            
            System.out.println("Input number of doctors: ");
            maxDoctors = input.nextInt();
            if(maxDoctors <= 0){
                throw new DoctorCountException();
            }
            
            doctors = new Doctor[maxDoctors];
            for(int i=0;i<=doctors.length;i++){
                doctors[i] = new Doctor(i);
            }
            
    }
    
    private static void startSimulation() {
        System.out.println("-------------START SIMULATION-------------");
        System.out.println("");
        for (int currentMin = 0; currentMin <= simulationLength; currentMin++) {
            System.out.printf("At the beginning of iteration %d ...\n", currentMin);
            
            //检查是否有空闲医生并匹配患者
            
            
            System.out.printf("After %d minute ## ", currentMin);
            //Doctor_x[leave time]..  Waiting Queue: [...]
        }
        
        
    }
    
    
    private static void printFinalResult(){}
    private static void updateAllDoctorsStatus(int currentMin){
        for(int j = 0; j<=maxDoctors; j++){
                doctors[j].updateStatus(currentMin);
            }
    }
    private static void addPatient(int currentMin) {
        System.out.println("Input triage level for a new patient [1-Critical,2-Urgent,3-Normal,0-None]: ");
        //排队紧急程度
        int plevel = input.nextInt();
        if(plevel==0){
            return;
        }
        if(plevel < 0 || plevel > 3){
            throw new TriageLevelException();
        }

        System.out.println("Input patient name: ");
        //实例患者类
        String pname = input.nextLine();
        if(pname == null){
            throw new EmptyNameException();
        }

        System.out.println("Input treatment time (min): ");
        int pTime = input.nextInt();
        if(pTime <= 0){
            throw new EmptyNameException();
        }
        

        Patient patient = new Patient(pname, plevel, pTime);

        for (int j = 0; j <= maxDoctors; j++) {
            doctors[j].updateStatus(currentMin);
            if (doctors[j].isIdle()) {
                doctors[j].assignPatient(patient, plevel);
            }
        }
    }
    
}