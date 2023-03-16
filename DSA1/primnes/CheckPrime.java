package primnes;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String args[]){
        System.out.println("enter any number :");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("* no.of factors of your number: "+count);

        if (count==2){
            System.out.println("* prime");
        }
        else{
            System.out.println("* not prime");
        }
    }
}
