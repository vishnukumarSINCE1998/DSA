package ControlStructures;
import java.util.*;

public class EvenOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("your number is EVEN");
        }
        else if (a%2!=0){
            System.out.println("your number is ODD");
        }
    }
}
