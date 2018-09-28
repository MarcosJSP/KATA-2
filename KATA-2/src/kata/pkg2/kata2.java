package kata.pkg2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class kata2 {
    private final Random rand = new Random(System.currentTimeMillis());
    private Histogram histo;
    private final Integer [] data = new Integer[15];
    
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
        histo = new Histogram(data);
    }
    
    public void showingContent(){        
        System.out.println("-Array-");
        for (int i : data) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n-Histogram-");
        Map<Integer,Integer> histogr = histo.getHistogram();
        Iterator it = histogr.entrySet().iterator();
        
        for(Map.Entry<Integer,Integer> entry: histogr.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}