import java.util.HashMap;

public class First_Unique_Character_in_a_String {

    public int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        First_Unique_Character_in_a_String obj = new First_Unique_Character_in_a_String();

        System.out.println(obj.firstUniqChar("leetcode"));
        System.out.println(obj.firstUniqChar("loveleetcode"));
        System.out.println(obj.firstUniqChar("aabb"));
    }
}