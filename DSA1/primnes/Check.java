package primnes;

import java.util.Scanner;

public class Check {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n =sc.nextInt();
            int count=0;
            for (int i=1;i<=n;i++){
                if (n%i==0){
                    System.out.println("factors :"+i);
                    count++;
                }
            }
            System.out.println("\n no.of factors of "+n+" number : "+ count);
            if(count ==2){
                System.out.println("It is a PRIME NUMBER");
            }
            else{
                System.out.println("It is NOT A PRIME NUMBER");
            }
        }
    }



