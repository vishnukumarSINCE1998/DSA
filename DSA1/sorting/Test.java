package sorting;

public class Test {
    public static void main(String args[]) {
        int a[] = {4, 7, 9, 15, 21, 11};
        int n = a.length;
        int key = a[n - 1];

        for (int j = n - 2; j >= 0; j--) {
            if (a[j] >= key) {
                a[j + 1] = a[j];
            } else {
                a[j + 1] = key;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
