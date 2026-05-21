import java.util.HashMap;

class Minimum_window_substring {

    public String minWindow(String s, String t) {

        if (t.equals(""))
            return "";

        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            countT.put(c, 1 + countT.getOrDefault(c, 0));
        }

        int have = 0;
        int need = countT.size();

        int[] res = { -1, -1 };
        int resLen = Integer.MAX_VALUE;

        int left = 0;

        // Sliding window
        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            window.put(c, 1 + window.getOrDefault(c, 0));

            if (countT.containsKey(c) &&
                    window.get(c).intValue() == countT.get(c).intValue()) {
                have++;
            }

            // Shrink window
            while (have == need) {

                // Update result
                if ((right - left + 1) < resLen) {
                    res[0] = left;
                    res[1] = right;
                    resLen = right - left + 1;
                }

                // Remove from left
                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar) - 1);

                if (countT.containsKey(leftChar) &&
                        window.get(leftChar) < countT.get(leftChar)) {
                    have--;
                }

                left++;
            }
        }

        int l = res[0];
        int r = res[1];

        return resLen != Integer.MAX_VALUE
                ? s.substring(l, r + 1)
                : "";
    }

    public static void main(String[] args) {

        Minimum_window_substring obj = new Minimum_window_substring();

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String ans = obj.minWindow(s, t);

        System.out.println("Minimum Window Substring: " + ans);
    }
}
