package src.oops.Interface.MultilevelInheritance;
class Grandfather{
    void sing(){
        System.out.println("sing a song");
    }
}
interface mom {
    void walk();
    void run();
}
interface dad{
    void walk();
    void eat();
}
class child extends Grandfather implements mom,dad{
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void walk() {
        System.out.println("walk");

    }
}
public class Inheritance {
public static void main(String args[]){
    child c=new child(){
        @Override
        public void eat() {
            super.eat();
        }

        @Override
        public void walk() {
            super.walk();
        }

        @Override
        public void run() {
            super.run();
        }
    };
    c.eat();
    c.run();
    c.walk();
    c.sing();
    c.eat();

}
}
