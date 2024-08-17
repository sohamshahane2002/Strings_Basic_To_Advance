
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println("Old String is : " + str);
        System.out.println(("New String is : " + removeDuplicate(str)));

    }
    public static String removeDuplicate(String str){
        String newStr = "";
        for(int i = 0 ; i  < str.length() ; i++){
            char ch = str.charAt(i);
            if(newStr.indexOf(ch)== -1){
                newStr = newStr  + ch;
            }
        }
        
        return newStr;
    }
}
