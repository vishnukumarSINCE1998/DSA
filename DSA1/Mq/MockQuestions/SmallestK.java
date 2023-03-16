package MockQuestions;

import java.util.Arrays;

public class SmallestK {
    static int kthsmallest(int a[],int k){
        Arrays.sort(a);
        int n=a.length;
        return a[n-k];
    }
    public static void main(String args[]){
        int a[]={10,40,50,20,30};

        int k=1;

        System.out.println(kthsmallest(a,k));
    }
}
