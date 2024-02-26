package array_hashing;

/**
 * Problem - <a href="https://leetcode.com/problems/is-subsequence/">Is Subsequence</a>

 */
public class Subsequence {
    public static boolean isSubsequence(String s, String t) {
        char[] sArray = s.toCharArray();
        if(s.isEmpty()){
            return true;
        }
        int index = 0;
        for(Character ch: sArray) {
            if(!t.contains(String.valueOf(ch))) {
                return false;
            }
            index = t.indexOf(ch);
            t = t.substring(index+1);
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = isSubsequence("aaaaaa", "bbaaaa");
    }
}
