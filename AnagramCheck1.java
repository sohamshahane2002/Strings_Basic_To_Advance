//Optimal Solution
package Strings3;
public class AnagramCheck1 {
    public static boolean isAnagram( String s1 ,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int count[] = new int[256];

        for (char c : s1.toCharArray()) {
            count[c]++;
        }
        for (char c : s2.toCharArray()){
            count[c]--;
            if (count[c] < 0) {
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams"); 
        }
    }
}
