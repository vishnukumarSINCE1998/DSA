package sorting;

public class Bubblesort {
    public static void main(String args[]) {
        int a[] = {2, 1, 3, 4, 6, 5, 9, 8};
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j<n -i-1; j++) {
                if (a[j] > a[j + 1]) {
//                    swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
