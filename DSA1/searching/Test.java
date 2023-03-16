package searching;

public class Test {
    public static void main(String arg[]){
        int a[]={2154,5,542,2,2,1,47,5,1,4,5,5,1,5,15,1,5,1,5,54,21,21,96,8,54,32,65,21,4,2,5,2};
        int n=a.length;
        int x=1;
        for (int i=0;i<n;i++){
            if (a[i]==x){
                System.out.println(i);
                break;


            }
        }
    }
}
