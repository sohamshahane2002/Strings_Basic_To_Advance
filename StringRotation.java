package Strings3;

public class StringRotation {
    public static boolean isrotation(String s ,String goal){
        if(s.length() != goal.length()){
            return false;
        }
        String concat = s + s;
        return concat.contains(goal);
    }
    public static void main(String[] args) {
        String s = "ABCDEF";
        String goal = "EFABCD";
        Boolean ans = isrotation(s, goal);
        System.out.println(ans);

    }
}
