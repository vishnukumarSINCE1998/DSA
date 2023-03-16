package oops.Inheritance.Area;

class Area{
    private int length;
    private int breadth;

    Area(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public  int clacarea(){
        return length*breadth;
    }
}
public class test {
    public static void main(String args[]){
        Area a=new Area(10,2);
        System.out.println(a.clacarea());
    }


}
