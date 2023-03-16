package Test;

public class Arrays {
    public static void main(String args[]) {
        int a[][] = {{1, 23, 4, 56, 1},{2, 3, 5, 62, 5}};
        int r = a.length;
        int c = a[0].length;
        for (int i = 0; i<r; i++) {
            for (int j = 0; i<c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
