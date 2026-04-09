
public class PriorityQueue {
    private ListQueue[] waitLine = new ListQueue[3];
    private ListQueue criticalQueue = new ListQueue();
    private ListQueue UrgentQueue = new ListQueue();
    private ListQueue NormalQueue = new ListQueue();

    public PriorityQueue() {
        waitLine[0] = criticalQueue;
        waitLine[1] = UrgentQueue;
        waitLine[2] = NormalQueue;
    }
    
    public void priorityEnqueue(Patient p){
        
    }
    
    public Patient dequeue() {  
        if(waitLine[0].empty()){
            
        }
        return (Patient) waitLine[0].dequeue();
    }
    
    
    public boolean isLineEmpty(ListQueue queue){
        boolean isEmpty = true;
        for(int i=0;i<=waitLine.length;i++){
            if(!waitLine[i].empty()){
                return false;
            }
        }
        return true;
    }
    
    
    
}
