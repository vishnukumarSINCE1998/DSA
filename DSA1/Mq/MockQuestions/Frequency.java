package MockQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {
    public static void  main(String args[]){
    int a[]={2,9,7,2,9,2};
    int n=a.length;

    LinkedHashMap<Integer,Integer> myMap=new LinkedHashMap<>();
    for (int i=0;i<n;i++){
        int num=a[i];
        if(myMap.containsKey(num)==false){
            myMap.put(num,1);
        }
        else{
            int count=myMap.get(num);
            myMap.put(num, count+1);
        }
    }
    for(Map.Entry<Integer,Integer>entry: myMap.entrySet()){
        System.out.println(entry.getKey()+"==>"+ entry.getValue());
    }
}
}


