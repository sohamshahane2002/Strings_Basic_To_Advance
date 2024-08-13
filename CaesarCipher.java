//CaesarCipher or Character Shifter Program

package Strings3;
import java.util.*;

public class CaesarCipher{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String");
        String str = sc.nextLine();

        String res = "";
        
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) <= 'u' ){
                res = res + (char)(str.charAt(i)+5);
            }
            else{
                res = res + (char)(str.charAt(i)-'v'+'a');
            }
        }
        System.out.println(res);
    }
}