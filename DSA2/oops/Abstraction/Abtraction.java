package src.oops.Abstraction;
abstract class vehicle{
    void horn(){
        System.out.println("popoppopopo");
    }
    abstract void brakes();
}
class Bike extends vehicle {
    void brakes() {
        System.out.println("Basic breakes");
    }
}
public class Abtraction {
    public static void main(String args[]){
        vehicle v=new vehicle(){
            void brakes(){
                System.out.println("Basic breakes");
            }
        };
        v.brakes();

    }
}
