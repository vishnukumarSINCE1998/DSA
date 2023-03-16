package ControlStructures;
import java.util.*;
public class Switchcase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        switch(N){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("thuesday");
                break;
            case 3:
                System.out.println("wendsday");
                break;
            case 4:
                System.out.println("thursday");
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("out of the range");
}
}
}