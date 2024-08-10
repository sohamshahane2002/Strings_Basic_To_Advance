package Strings1;
import java.util.*;
public class ReverseWordsStrings {
    public static void main(String[]args){
      String s = "This is DSA";
      System.out.println("Before Reversing : " + s);
    
      s = s + " ";
      Stack <String> st = new Stack<String>();
      String str = "";
      for(int i = 0 ; i < s.length() ; i++){
          
        if(s.charAt(i)==' '){
            st.push(str);
            str ="";
        }
        else{
            str = str + s.charAt(i);
        }
      }
      String ans = "";
      while (st.size() != 1){
          ans = ans + st.peek() + " ";
          st.pop();
      }
      ans = ans + st.peek();
      System.out.println("AFter Reversing : ");
      System.out.println(ans);
    }
}
