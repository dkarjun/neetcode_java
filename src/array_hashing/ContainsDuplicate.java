package array_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem - <a href="https://leetcode.com/problems/contains-duplicate/">...</a>
 */
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<>();

        for(int i: nums) {
            if(dict.containsKey(i)) {
                int num = dict.get(i);
                dict.put(i,num + 1);
            }
            else {
                dict.put(i,1);
            }
        }

        for(int i: dict.values()){
            if(i>1)
                return true;
        }

        return false;
    }
}