package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int n: nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                result = key;
            } else if (freq == maxFreq && key < result) {
                result = key;
            }
        }

        return result;
    }
}
