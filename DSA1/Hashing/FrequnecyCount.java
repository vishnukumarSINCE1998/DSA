package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequnecyCount {
    public static void main(String args[]){
        int arr[]={1,2,3,4,1,2,3,1,2,1};
        int n=arr.length;

        HashMap<Integer,Integer>myMap=new HashMap<>();
        for (int i=0;i<n;i++){
        int num=arr[i];
        if(myMap.containsKey(num)==false){
            myMap.put(num,1);
        }
        else {
            int count = myMap.get(num);
            myMap.put(num, count + 1);
        }
        }
        for(Map.Entry<Integer,Integer>entry: myMap.entrySet()){
            System.out.println(entry.getKey()+"==>"+entry.getValue());
        }
    }
}

// LinkedHashMap for :insertion order
// TreeMap for  :  sorted order