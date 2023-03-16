package src.oops.Interface.Normal;
interface animal{
    
    void eat();
    void walk();
    void sleep();
}
class Dog implements animal{
    public void eat(){
        System.out.println("EATING");
    }
    public void walk(){
        System.out.println("WALKIMG");
    }
    public void sleep(){
        System.out.println("SLEEPING");
    }
}
public class Interface {
    public static void main(String args[]){
        animal a=new animal() {
            @Override
            public void eat() {
                System.out.println("EATING");

            }

            @Override
            public void walk() {

            }

            @Override
            public void sleep() {

            }
        };
        a.eat();



    }
}
