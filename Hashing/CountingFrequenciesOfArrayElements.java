package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingFrequenciesOfArrayElements {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int n : arr) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            res.add(pair);
        }

        return res;
    }

}
