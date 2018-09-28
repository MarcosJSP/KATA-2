package kata.pkg2;

import com.sun.prism.impl.PrismSettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class kata2 {
    private final Random rand = new Random(System.currentTimeMillis());
    private Map <Integer, Integer> histogram = new HashMap<>();
    private final int[] data = new int[15];
    
    public static void main(String[] args) {
        kata2 i = new kata2();
        i.control();     
    }
    
    public void control (){
        chargingArray();
        chargingHash();
        showingContent();
    }
    
    public void  chargingArray(){
        for(int i= 0; i < data.length; i++){
            data[i] = ThreadLocalRandom.current().nextInt(-10, 11);
        }
    }
    
    public void chargingHash(){
        for (int i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1: 1);
        }
    }
    
    public void showingContent(){        
        System.out.println("-Array-");
        for (int i : data) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n-Histogram-");
        Iterator it = histogram.entrySet().iterator();
        
        for(Map.Entry<Integer,Integer> entry: histogram.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}