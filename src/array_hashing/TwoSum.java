package array_hashing;

import java.util.Arrays;
import java.util.List;

/**
 * Problem - <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .toList();

        for(int i=0; i< nums.length; i++){
            int num1 = nums[i];
            int num2 = target - num1;
            List<Integer> temp = list.subList(i+1, nums.length);
            int index_num_2 = temp.indexOf(num2);
            if (index_num_2 == -1)
                continue;
            if(index_num_2 + i + 1 > 0){
                return new int[]{i, index_num_2 + i + 1};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] res = twoSum.twoSum(new int[]{-1,-2,-3,-4,-5}, -8);
        System.out.println(Arrays.toString(res));
    }
}
