package TwoDarrys;

public class TwoD {
    public static void main(String args[]){
        int arr[][]={{1,2,3,2},{50,5,22,6}};
        int r=arr.length;
        int c=arr[0].length;

        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
