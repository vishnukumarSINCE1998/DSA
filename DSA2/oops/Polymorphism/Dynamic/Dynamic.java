package src.oops.Polymorphism.Dynamic;
class vehicle {
    void breakes() {
        System.out.println("Brakes applied");
    }
}
    class Bike extends vehicle {
        void breakes() {
            System.out.println("disc brakes");
        }
    }
    class arepolane extends vehicle{
    void breakes(){
        System.out.println("hydralic brakes");
    }
    }

public class Dynamic {
    public static void main(String args[]){
//
//        vehicle a =new vehicle();
//        a.breakes();
//
//    Bike b=new Bike();
//    b.breakes();

//        vehicle v1=new Bike();
//        v1.breakes();

//

        vehicle x;
        x=new arepolane();
        x=new Bike();
        x=new vehicle();
    }
}
