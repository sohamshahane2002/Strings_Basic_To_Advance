//Brute Force
package Strings3;
import java.util.*;
public class AnagramCheck {
    public static boolean isAnagram(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char charArr1[] = s1.toCharArray();
        char charArr2[] = s2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1, charArr2);
    }
    public static void main(String[]args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams"); 
        }
    }
}
