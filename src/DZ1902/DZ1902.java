package DZ1902;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DZ1902 {
    static void main(String[] args) {
        Integer nums[] = {2, 5, 2, 7, 8, 8, 10};
        for (Integer n : nums) System.out.print(n + " ");
        System.out.println("\n");
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(nums));
   //     System.out.println(a);
        int arr[] = new int[a.size()];
        Iterator<Integer> it = a.iterator();
        int i=0;
        int elt = 0;
        for(int n: a) {
            elt = it.next();
            arr[i] =elt;
             i++;
        }
        for(int j =0;j <= arr.length-1; j++ ){
            System.out.print(arr[j]+" ");}
    }
}

