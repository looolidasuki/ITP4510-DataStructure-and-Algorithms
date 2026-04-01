
public class QuickVsBubble {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arrayQS = new int[n];
        int[] arrayBS = new int[n];
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * 10000);
            arrayQS[i] = x;
            arrayBS[i] = x;
        }
        long startTime, endTime;
        startTime = System.nanoTime();
        quicksort(arrayQS, 0, arrayQS.length - 1);
        endTime = System.nanoTime();
        System.out.println("Quick Sort = " + (endTime - startTime));
        startTime = System.nanoTime();
        bubbleSort(arrayBS);
        endTime = System.nanoTime();
        System.out.println("Bubble Sort = " + (endTime - startTime));
    }

    public static void quicksort(int[] array, int low, int high) { 
            int pivot = array[low];
            int storeIndex = low+1;
            
            for(int i=low+1;i<=array.length-1;i++){
                if(array[i]<pivot){
                    swap(array, i, storeIndex); 
                    storeIndex++;        
                }
            }
            swap(array, storeIndex-1, low);
        
            if((storeIndex-low)>1){
                quicksort(array,low, storeIndex-2);
            }
            if((high-storeIndex)>1){
                quicksort(array, storeIndex, high);
            }
      
    }
    public static void bubbleSort(int[] array) {
        for(int pass=0;pass<=array.length-2;pass++){
            for(int i=0;i<=array.length-pass-2;i++){
                if(array[i]>array[i+1]){
                    swap(array, i, i+1);
                }
            }
        }

   
    }
    // other methods not shown
    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    
}
