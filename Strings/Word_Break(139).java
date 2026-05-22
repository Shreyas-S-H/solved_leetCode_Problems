
import java.util.*;

class Word_Break {

    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<>(wordDict);

        boolean[] dp = new boolean[s.length() + 1];

        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {

            for (int j = 0; j < i; j++) {

                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    // Main function
    public static void main(String[] args) {

        Word_Break obj = new Word_Break();

        String s1 = "leetcode";
        List<String> wordDict1 = Arrays.asList("leet", "code");

        String s2 = "applepenapple";
        List<String> wordDict2 = Arrays.asList("apple", "pen");

        String s3 = "catsandog";
        List<String> wordDict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");

        System.out.println(s1 + " -> " + obj.wordBreak(s1, wordDict1));
        System.out.println(s2 + " -> " + obj.wordBreak(s2, wordDict2));
        System.out.println(s3 + " -> " + obj.wordBreak(s3, wordDict3));
    }
}