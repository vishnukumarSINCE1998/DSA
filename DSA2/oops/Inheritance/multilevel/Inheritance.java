package oops.Inheritance.multilevel;
class Animal{
    int tail;

    void walk(){
        System.out.println("WALKINGGG!!!");
    }
}
class Dog extends Animal {
    int legs;
    void sleep(){
        System.out.println("SLEEPING!!!");
    }
}
class tony extends Dog{
    int mouth;

    void  eat(){
        System.out.println("EATINGGGG!!!!");
    }
}
public class Inheritance {
    public static void main(String args[]){
        tony t=new tony();

        t.eat();
        t.walk();
        t.sleep();
    }

}

