package src.z;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    int r = sc.nextInt();
    System.out.println("pls enter " + r* c + " matrice");
    int arr[][] = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        arr[i][j] = sc.nextInt();


      }
    }
    System.out.println("ur matrices is :");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

  }
}