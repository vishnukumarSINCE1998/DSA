package Hashing;

import java.util.HashMap;
import java.util.Map;

public class NewHash {
    public static void main(String args[]) {
        String str = "abcdabcabaa";
        char c[] = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < c.length; i++) {

            char num = c[i];
            if (map.containsKey(num) == false) {
                map.put(num, 1);
            } else {
                int count = map.get(num);
                map.put(num, count+1);
            }

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=====>>" + entry.getValue());
        }
    }
}