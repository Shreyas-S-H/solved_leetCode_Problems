
public class Longest_Common_Subsequence {

    public static int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        // DP table
        int[][] dp = new int[m + 1][n + 1];

        // Fill DP table
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                // If characters match
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }

                // If characters do not match
                else {

                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {

        String text1 = "abcde";
        String text2 = "ace";

        int result = longestCommonSubsequence(text1, text2);

        System.out.println("Longest Common Subsequence Length: " + result);
    }
}