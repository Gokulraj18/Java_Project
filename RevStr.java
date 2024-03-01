import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.print(str(s));
    }
    public static boolean str(String s){
        s=s.toLowerCase();
        //if it is necessary use the LowerCase.
        for(int i=0;i<s.length()/2;i++){
            char start=s.charAt(i);
            char end=s.charAt(s.length()-1-i);
            if(start != end)
            return false;
        }
        return true;
    }
}
