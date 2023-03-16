package functions;

public class Test2 {
    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String args[]){
        int a=10;
        int b=200;
        System.out.println(sum(a,b));
        System.out.println(sum(20,b));
        System.out.println(sum(a,30));
        System.out.println(sum(100,200));
    }
}