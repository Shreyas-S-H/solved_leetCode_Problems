public class Find_the_Index_of_he_First_Occurrence_in_a_String {

    public static int strStr(String haystack, String needle) {

        if (needle.equals("")) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int ans = strStr(haystack, needle);

        System.out.println("Index = " + ans);
    }
}