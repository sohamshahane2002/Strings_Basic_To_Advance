package Strings2;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int m1[] = new int[256];
        int m2[] = new int[256];

        for(int i = 0 ; i < s.length() ; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(m1[ch1] != m2[ch2]){
                return false; 
            }
            m1[ch1] = i + 1;
            m2[ch2] = i + 1;  
        }return true;
    }
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        boolean ans = isIsomorphic(s1, s2);
        System.out.println(s1 + " and " + s2 + " are Isomorphic Strings : "+ ans);
    }
}
