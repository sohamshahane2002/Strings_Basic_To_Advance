public class ImplementAtoi{
    public static int myAtoi (char []str) {
        int res = 0;
    
        int sign = 1;

        int i = 0;  //Initiate index of first digit
        if(str[0]== '-'){
            sign = -1;
            i++;
        }
        for(; i < str.length ; ++i){
            res = res * 10 + str[i] - '0';

        }
        return sign * res;

    }
    public static void main(String[] args){
        char[] str = "-123".toCharArray();
       
        int val = myAtoi(str);
        System.out.println(val);
    }
}