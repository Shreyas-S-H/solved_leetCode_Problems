import java.util.Stack;

class Valid_Parentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // Check closing brackets
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Main function
    public static void main(String[] args) {

        Valid_Parentheses obj = new Valid_Parentheses();

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([{}])";

        System.out.println(s1 + " -> " + obj.isValid(s1));
        System.out.println(s2 + " -> " + obj.isValid(s2));
        System.out.println(s3 + " -> " + obj.isValid(s3));
        System.out.println(s4 + " -> " + obj.isValid(s4));
    }
}