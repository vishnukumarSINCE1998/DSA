package Arrays;

public class MaxValue {
    public static void main(String args[]){
        int a[]={10,5,30,200,9};
        int n=a.length;
        int max=0;
        for (int i=0;i<n;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);

    }
}
