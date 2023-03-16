package src.oops.Abstraction.OneMoreEx;
abstract class bird {
    void fly(){
        System.out.println("its is flying in the sky");
    }
    abstract void eat();
}
public class Abstract {
    public static void main (String args[]){
        bird b=new bird() {
            @Override
            void eat() {
                System.out.println("eating food ");
            }
        };

        b.eat();
        b.fly();
    }
}
