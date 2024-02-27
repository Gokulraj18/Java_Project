import java.util.*;
class SkipARec{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(SkipAppNotApple(s));
    }
    static String SkipAppNotApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app")&&!s.startsWith("apple"))
            return SkipAppNotApple(s.substring(3));
        else
            return s.charAt(0)+SkipAppNotApple(s.substring(1));
    }
}