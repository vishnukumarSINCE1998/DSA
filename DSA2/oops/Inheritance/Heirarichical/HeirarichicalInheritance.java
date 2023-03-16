package oops.Inheritance.Heirarichical;
class Animal{

    void walk(){
        System.out.println("WALKING!!!");
    }
}
class Dog extends Animal{

    void run(){
        System.out.println("RUNNING!!!");
    }
}
class cat extends Animal{
    void eat(){
        System.out.println("EATING!!!");
    }
}

public class HeirarichicalInheritance {
    public static void main(String args[]){
        Dog d= new Dog ();
        d.run();
        d.walk();
        cat c= new cat();
        c.walk();
        c.eat();
    }
}
