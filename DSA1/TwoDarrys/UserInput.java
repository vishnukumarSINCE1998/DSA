package TwoDarrys;

import java.util.Scanner;

public class UserInput {
        public static void main(String args[]) {
            System.out.println("enter your size of rows :");
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            System.out.println("Enter your size of the coloums :");
            int c = sc.nextInt();
            int arr[][] = new int[r][c];
            System.out.println("Enter " + r * c + " values");
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    arr[i][j] = sc.nextInt();
            System.out.println("\n\n\n your enter values are :");
            for (int i=0;i<r;i++){
                for (int j=0;j<c;j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }

        }
    }


