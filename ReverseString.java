package Strings1;

public class ReverseString {

    public static String reverseString(String str){
       char chararray[] = str.toCharArray();
       int left = 0;
       int right = str.length()-1;
       while(left < right){
           char temp = chararray[left];
           chararray[left] = chararray[right];
           chararray[right] = temp;   
           
           left++;
           right--;
        
       }return new String(chararray); 
    }
    public static void main(String[] args) {
        String strg = " Hello Soham";
        System.out.println("Before Reversing the String "+ strg );
        System.out.println("After Reversing the String "+ reverseString(strg));
    }
}


