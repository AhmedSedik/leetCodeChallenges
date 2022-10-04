import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {


    public static void main(String[] args) {
        int[] num = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(num));

    }

    /* static boolean containsDuplicate(int[] nums) {
         if (nums == null || nums.length == 0) return false;

         for (int i = 0; i < nums.length; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                 if (nums[i] == nums[j]) {
                     return true;
                 }
             }


         }
         return false;

     }*/
    static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        Set<Integer> integers = new HashSet<>();
        for (int num : nums) {
            if (integers.contains(num)) {
                return true;
            }
            integers.add(num);
        }
        return false;
    }
}
