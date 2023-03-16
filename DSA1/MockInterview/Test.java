package MockInterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String args[]){
        String str="ramcharan";
        char c[]=str.toCharArray();


        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(int i=0;i< c.length;i++){

            char n=c[i];
            if(map.containsKey(n)==false){
                map.put(n,1);
            }
            else{
                int count=map.get(n);
                map.put(n,count+1);
            }

        }
        for(Map.Entry<Character,Integer>entry: map.entrySet()){
            System.out.println(entry.getKey()+" ====>"+entry.getValue());
        }
    }
}
