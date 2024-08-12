package Strings2;
import java.util.*;

public class LongestPrefixElement {
    public static String longestCommonPrefix(String []strs){
        if(strs == null || strs.length==0){
            return " ";
        }
        Arrays.sort(strs);
        String firstWord = strs[0];
        String lastWord = strs[strs.length-1];

        int i = 0;
        while (i < firstWord.length() && firstWord.charAt(i) == lastWord.charAt(i)) {
            i++;
        }

        return firstWord.substring(0, i);
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "float"};
        String lcp = longestCommonPrefix(strs);
        System.out.println(lcp);
    }
}
