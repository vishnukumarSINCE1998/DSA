package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashing {
    public static void main(String args[]) {
        int arr[] = {1, 1, 2, 3, 52, 2, 52, 1, 6, 1, 2, 3, 4, 1, 6, 2, 13, 5, 256, 21, 3, 1, 15, 321, 3, 54, 6};
        int n = arr.length;

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (map.containsKey(num)== false) {
                map.put(num, 1);
            } else {

                int count = map.get(num);
                map.put(num, count + 1);
            }
        }
        for(Map.Entry<Integer,Integer>entry :  map.entrySet()) {
            System.out.println(entry.getKey()+" ====>>"+entry.getValue());
            }

    }
}

