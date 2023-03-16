package TwoDarrys;

public class Test {
    public static void main(String args[]) {
        int arr[][]=new int [2][2];
        int r=arr.length;
        int c=arr[0].length;

        arr[0][0]=10;arr[0][1]=20;
        arr[1][0]=30;arr[1][1]=40;

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }}
}

