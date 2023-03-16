package oops;

import java.util.Scanner;

class Bird{
    String name;
    String colour;
    int size;

    void msg(){
        System.out.println("hello every one ");
    }
    void printdetails(){
        System.out.println("Details of birds");
        System.out.println("NAME :"+name);
        System.out.println("COLOUR :"+colour);
        System.out.println("SIZE :"+size);


    }

}

public class Details {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String colour=sc.nextLine();
        int size=sc.nextInt();

        Bird b1=new Bird();
        b1.name=name;
        b1.colour=colour;
        b1.size=size;

        b1.printdetails();


    }
}
