package GCD;

public class Test {
    public static void main(String args[]){
        int x=12;
        int y=3;
        int count=0;
        for (int i=1;i<=x;i++){
            if (x%i==0 && y%i==0){
                count=i;
            }
        }
        System.out.println(count);
    }
}
