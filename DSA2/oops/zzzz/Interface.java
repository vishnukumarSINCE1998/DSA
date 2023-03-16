package src.oops.zzzz;
interface animal{
    void walk();
    void eat();
}
class Dog implements animal{
    public void walk(){
        System.out.println("walking");
    }
    public void eat(){
        System.out.println("eat");
    }
}
public class Interface{
    public static void main(String args[]) {
        animal a = new animal() {
            public void walk() {
                System.out.println("walking");
            }

            public void eat() {
                System.out.println("eat");
            }

        };

    a.eat();
    a.walk();
    }

}
