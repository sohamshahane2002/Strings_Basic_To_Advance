package Strings2;

public class RemoveParanthesis {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int open = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
                if (open > 1) {
                    result.append(c);
                }
            } else {
                open--;
                if (open > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        String result = removeOuterParentheses(s);
        System.out.println(result); 
    }
}

