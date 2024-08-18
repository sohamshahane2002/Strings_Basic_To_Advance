public class CountSubstrings {
    public static long atMostK (String s, int k){     
        if (k < 0) return 0;

        int i = 0, j = 0, cnt = 0;
        long res = 0;
        int[] m = new int[26];

        while (j < s.length ()){
            m[(int)(s.charAt(j) - 'a')]++;
            if (m[(int)(s.charAt(j) - 'a')] == 1) cnt++;
            
            while (cnt > k){
                m[(int)(s.charAt(i) - 'a')]--;
                if (m[(int)(s.charAt(i) - 'a')] == 0) cnt--;
                i++;
            }
            res += (j - i + 1);
            j++;
        }
        return res;
    }
    public static long substrCount (String s, int k) {
        return atMostK (s, k) - atMostK (s, k - 1);
    }
    public static void main(String[] args) {
        long ans = substrCount("aba",2);
        System.out.println("The number of substrings are : "+ ans);
    }
}
