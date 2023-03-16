package sorting;

public class Insertion {
    public static void main(String args[]) {
    int a[] = {1, 2, 3, 10, 12, 14,15,19,4};
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
        System.out.print(a[i]+" ");
    }

}

}
