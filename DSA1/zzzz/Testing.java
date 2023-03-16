package zzzz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Testing {
    public static void main(String[] args) {
        // Make the two lists
        List<Integer> list1 = Arrays.asList( 1, 45, 5 ,7, 9 , 5);
        List<Integer> list2 = Arrays.asList(2,1,5,6,1,9);
        // Prepare a union
        Set<Integer> union = new HashSet<Integer>(list1);
        union.addAll(list2);
        // Prepare an intersection
        Set<Integer> intersection = new HashSet<Integer>(list1);
        intersection.retainAll(list2);
        // Subtract the intersection from the union
        union.removeAll(intersection);
        // Print the result
        for (Integer n : union) {
            System.out.print(" " +n);
        }
    }
}
