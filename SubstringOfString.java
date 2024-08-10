package Strings1;

public class SubstringOfString {
    public static String substr(String str , int start ,int end){
        char charArray[] = str.toCharArray();
        char subcharArray[] = new char[end - start];
        int index = 0;
        for(int i = start ; i < end ;i++){
            subcharArray[index++] = charArray[i];
        }
        return new String(subcharArray);

    }
    public static void main(String[] args) {
        String str = "Hello world";
        String ans = substr(str, 6, 11);
        System.out.println("The Substring is : " + ans);
    }
}
