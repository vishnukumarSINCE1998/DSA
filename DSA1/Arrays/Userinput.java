package Arrays;
import java.util.*;
public class Userinput {
    public static void main(String args[]){
        System.out.println("enter your size of list:");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a[]=new int[N];
        System.out.println("enter your list of numbers:");
        for(int i=0;i<N;i++)
            a[i] = sc.nextInt();
            System.out.println("your values are:");
            for (int i = 0; i < N; i++)
            System.out.print(a[i]+" ");


    }
}
