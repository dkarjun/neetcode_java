package array_hashing;

import java.util.Arrays;

/**
 * Problem - <a href="https://leetcode.com/problems/valid-anagram/">Valid Anagram</a>
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length()!= t.length())
            return false;

        char[] array = s.toCharArray();
        Arrays.sort(array);
        s = new String(array);

        array = t.toCharArray();
        Arrays.sort(array);
        t = new String(array);

        return s.equals(t);
    }
}
