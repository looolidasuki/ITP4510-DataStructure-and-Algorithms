import java.io.*;
import java.util.*;

public class LinkedListTiming {
    private LinkedList<String> list;
    
    public LinkedListTiming() {
        list = new LinkedList<String>();
    }
    
    // Add a word to the linked list
    public void addNode(String data) {
        list.add(data);
    }
    
    // Search for a word in the linked list
    public String search(String target) {
        for (String s : list) {
            if (s.equals(target)) {
                return s;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        LinkedListTiming list = new LinkedListTiming();
        
        try {
            Scanner fin = new Scanner(new File(args[0]));
            String line;
            while (fin.hasNextLine()) {
                line = fin.nextLine();
                line = line.trim();
                list.addNode(line);
            }
            fin.close();
            
            long startTime = System.nanoTime();
            String ans = list.search(args[1]);
            long endTime = System.nanoTime();
            
            if (ans == null) 
                System.out.println("Not found; Time used: " + (endTime - startTime));
            else 
                System.out.println("Found; Time used: " + (endTime - startTime));
                
        } catch (FileNotFoundException e) {
            System.out.println("Failed to open " + args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: LinkedListTiming <word_file> <search_word>");
        }
    }
}
