package oops.Inheritance.singlelevel;
class Animal{
    int tail;

    void walk(){
        System.out.println("WALKINGGG!!!");
    }
}
class Dog extends Animal{
    int legs;
     void sleep(){
         System.out.println("SLEEPING!!!");
     }
}
public class Inheritance {
    public static void main(String args[]){
        Dog c=new Dog();

        c.sleep();
        c.walk();

    }

}
