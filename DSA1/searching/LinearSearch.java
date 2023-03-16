package searching;

public class LinearSearch {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,1,6,2,85,2};
        int n=a.length;
        int x=85;
        for (int i=0;i<n;i++){
            if (a[i]==x){
                System.out.println(i);
            }
        }
    }
}
