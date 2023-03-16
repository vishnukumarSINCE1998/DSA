package Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCount {
public static void main(String args[]) {
    int a[] = {1, 0, 1, 0, 1, 2, 2, 2,};
    int n = a.length;

    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<n;i++){
        int nums=a[i];
        if(map.containsKey(nums)==false){
            map.put(nums, 1);
        }
        else{
            int count=map.get(nums);
            map.put(nums,count+1);
        }
    }
    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
    System.out.println(entry.getKey()+" =====>>>"+ entry.getValue());
    }

}}
