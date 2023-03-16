package Practice;

public class Test {
    static int partition(int a[],int l,int h) {

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
            while (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        } while (i < j);
            int temp = a[l];
            a[l] = a[j];
            a[j] = temp;
            return j;
        }
    static void divide(int a[],int l,int h){
        if(l<h){
            int p=partition(a,l,h);
            divide(a,l,p-1);
            divide(a,p+1,h);
        }
    }
    public static void main(String args[]) {
        int a[] = {1, 0, 1, 0, 1};
        int n = a.length;

        divide(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}