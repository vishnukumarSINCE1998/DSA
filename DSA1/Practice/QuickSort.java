package Practice;

public class QuickSort {
    static int partition(int a[], int l, int h) {


        int pivot = a[l];
        int i = l + 1;
        int j = h;
        do {

            while (i <= h && a[i] <= pivot) {
                i++;
            }
            while (j >= l && a[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        } while (i < j) ;
            int temp = a[l];
            a[l] = a[j];
            a[j] = temp;
            return j;
        }

    static void quickSort(int a[],int l,int h){

        if(l<h){
            int p=partition(a,l,h);
            quickSort(a,l,p-1 );
            quickSort(a,p+1,h);
        }
    }

public static void main(String args[]){
    int a[]={3,2,1,6,5,4};
    int n=a.length;

    quickSort(a,0,n-1);

    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
}
}

