package src.z;

public class Practice {
    public static  long bound(int a[][],int m,int n) {
        long sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    sum += a[i][j];
                else if (i == m - 1)
                    sum += a[i][j];
                else if (j == 0)
                    sum += a[i][j];
                else if (j == n - 1)
                    sum += a[i][j];


            }
        }
        return sum;
    }

    public static void main(String args[]){
        int a[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        long sum=bound(a,3,3);

        System.out.println("sum : "+sum);
        }
    }

