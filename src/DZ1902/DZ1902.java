package DZ1902;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DZ1902 {
    static void main(String[] args) {
        Integer nums[] =  { 2,5,2,7,8,8,10 };
for(Integer n: nums)System.out.print(n+" ");

        System.out.println("\n");

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList( nums));
        System.out.println(a);
    }





}
