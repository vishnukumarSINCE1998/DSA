package src.oops.Inheritance.animal;
class Animal{
    int leg;
     int ears;

    void eat(){
System.out.println("EATINGGG!!!");
    }
}
class Dog extends Animal {
 int tail;

    void run() {
        System.out.println("RUNINGGG!!!");
    }
}
class puppy extends Dog{
    void walk(){
        System.out.println("WALKINGGGG!!!");
    }
    void sleep(){
        System.out.println("SLEEPING!!!");
    }
}
public class Inheritance {
    public static void main(String args[]){
        puppy a=new puppy ();
         a.eat();
         a.run();
         a.sleep();
         a.walk();

    }
}
