package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String args[]){
//        HashMap<Integer,Integer>myMap=new HashMap<>();
//        myMap.put(1,10);
//        myMap.put(10,20);
//        myMap.put(2,30);
//        System.out.println(myMap.get(10));

//        HashMap<Integer,String>myMap=new HashMap<>();
//        myMap.put(1,"vishnu");
//        myMap.put(2,"chinna");
//        myMap.put(4,"Ramcharan");
//        System.out.println(myMap.get(4));


        HashMap<Character,String>myMap=new HashMap<>();
        myMap.put('R',"ram");
        myMap.put('s',"siva");
        myMap.put('v',"vishnu");
        System.out.println(myMap.get('s'));

        for (Map.Entry<Character,String>entry:myMap.entrySet()){
            System.out.println(entry.getKey()+"==>"+entry.getValue());
        }

    }
}
