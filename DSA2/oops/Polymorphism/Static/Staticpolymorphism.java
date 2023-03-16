package src.oops.Polymorphism.Static;
class Area{

    Area(){

    }
    Area(int x){

    }
    Area(int x,int y){

    }
//    sqaure
    int calarea(int side){
        return side *side;

    }
//    rectangle
    int calarea(int length,int breadth){
        return length*breadth;
    }
//    circle
    float calarea(float radius){
        return (float)(Math.PI*radius*radius);
    }
}
public class Staticpolymorphism {
    public static void main(String args[]){
        Area a=new Area();
        System.out.println(a.calarea(5,5));
    }
}
