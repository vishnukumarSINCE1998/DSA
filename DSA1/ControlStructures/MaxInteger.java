package ControlStructures;
import java.util.*;
public class MaxInteger {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if (a>=b&&a>=c){
            System.out.println("the maxinterger among these three inputs:"+a);
        }
        else if(b>=a&&b>=c){
            System.out.println("the maxinterger among these three inputs:"+b);
        }
        else{
            System.out.println("the maxinterger among these three inputs:"+c);
        }
    }
}
