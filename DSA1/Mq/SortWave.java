package Mq;

import java.util.Arrays;

public class SortWave {
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void sortInwave(int arr[],int n){
        Arrays.sort(arr);

        for(int i=0;i<n-1;i+=2)
            swap(arr,i,i+1);
    }
    public static void main(String args[]){
        SortWave ob=new SortWave();
        int arr[]={1,2,3,4};
        int n=arr.length;
        ob.sortInwave(arr,n);

        for(int i:arr)
            System.out.print(i+" ");
    }
}
