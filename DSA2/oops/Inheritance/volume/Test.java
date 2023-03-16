package oops.Inheritance.volume;
class Area {
    private int length;
    private int breadth;
    private int height;

    Area() {

    }

    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    public int calarea() {
        return length * breadth;
    }
}
class volume extends Area {
    private int height;

    volume(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;

    }

    public int calcvolume() {
        return height * super.calarea();
    }
}
    public class Test {
        public static void main(String args[]) {
            volume a = new volume(2,4,6);
            System.out.println(a.calcvolume());

        }
    }

