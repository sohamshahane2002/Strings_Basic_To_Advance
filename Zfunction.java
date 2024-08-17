public class Zfunction{
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) {
            return 0;
        }

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "happyandsad";
        String needle = "th";

        Zfunction obj = new Zfunction();
        int index = obj.strStr(haystack, needle);

        System.out.println("The index for "+ haystack + " is "+index); 
}
}