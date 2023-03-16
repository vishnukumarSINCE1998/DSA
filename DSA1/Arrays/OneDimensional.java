package Arrays;

public class OneDimensional {
   public static void main(String args[]){
       int a[]={1,2,3,4,5,6,7,8,9,25,5,2};
       int n=a.length;
       System.out.println(n+"\n");
       System.out.println(a[1]);
       System.out.println(a[3]);
       System.out.println(a[6]+"\n");


       for (int i=0;i<n;i++){
           System.out.print(a[i]+" ");
       }
   }
}
