import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        
        System.out.println(SkipApple(s));
    }
    static String SkipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple"))
            return SkipApple(s.substring(5));
        else
            return s.charAt(0)+SkipApple(s.substring(1));
    }
}