package zzzz;

import Test.Arrays;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Uncommon {

            static void getUnion(int a[], int n, int b[], int m)
            {

                // Defining set container s
                HashSet<Integer> s = new HashSet<>();

                // Inserting array elements in s
                for (int i = 0; i < n; i++)
                    s.add(a[i]);

                for (int i = 0; i < m; i++)
                    s.add(b[i]);
                System.out.print(
                        "Number of elements after union operation: "
                                + s.size() + "\n");
                System.out.print("The union set of both arrays is :"
                        + "\n");

                System.out.print(
                        s.toString()
                                + " "); // s will contain only distinct
                // elements from array a and b
            }

            // Driver Code
            public static void main(String[] args)
            {
                int a[] = { 1, 45, 5, 7, 9, 5};
                int b[] = { 2, 1, 5, 6, 1, 9};

                getUnion(a, 6, b, 6);
            }
        }

// This code is contributed by gauravrajput1
