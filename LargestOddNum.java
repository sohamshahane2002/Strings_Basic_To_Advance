package Strings2;
public class LargestOddNum {
      public static String maxOdd(String s)   {
        for (int i = s.length() - 1; i >= 0; i--) 
        {
          if (s.charAt(i) % 2 != 0){
            String s1 = s.substring(0, i + 1);
            return s1;
          }
        }
        return "";
      }
 
      public static void main(String[] args){
        String s = "509866";
        String s1 = "67045";
        String ans = maxOdd(s);
        String ans1 = maxOdd(s1);
        System.out.println(ans);
        System.out.println(ans1);
      }    
}

        
        
    
    

