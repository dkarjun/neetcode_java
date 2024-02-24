package array_hashing;

/**
 * Problem - <a href="https://leetcode.com/problems/concatenation-of-array/">Concatenation of Array</a>
 */
public class ConcatenationArray {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len*2];

        for(int i=0; i<len; i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }

        return ans;
    }
}
