package kata.pkg2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int [] data;

    public Histogram(int [] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    public Map<Integer,Integer> getHistogram(){
        Map <Integer, Integer> histogram = new HashMap<>();
        for (int i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        return histogram;
    }
}