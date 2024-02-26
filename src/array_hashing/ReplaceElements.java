package array_hashing;

/**
 * Problem - <a href="https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/">Replace Elements with Greatest Element on Right Side</a>
 */
public class ReplaceElements {
    public int[] replaceElements(int[] arr) {

        int n = arr.length;
        int max = -1;
        int[] res = new int[n];

        for(int i=n-2;i>=0;i--){
            if(max > arr[i+1])
                res[i] = max;
            else {
                res[i] = arr[i+1];
                max = arr[i+1];
            }
        }
        res[n-1] = -1;
        return res;
    }
}
