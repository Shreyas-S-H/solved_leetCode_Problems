import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();

        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {

            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }

            charSet.add(s.charAt(r));

            res = Math.max(res, r - l + 1);
        }

        return res;
    }

    public static void main(String[] args) {

        Longest_Substring_Without_Repeating_Characters sol = new Longest_Substring_Without_Repeating_Characters();

        String s = "abcabcbb";

        System.out.println(sol.lengthOfLongestSubstring(s));
    }
}