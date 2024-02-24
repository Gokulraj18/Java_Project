import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        Rec("",s);
    }
    static void Rec(String p,String up){
        if(up.isEmpty()){
            System.out.print(p);
            return;
        }
        char ch=up.charAt(0);
        if (ch=='a')
            Rec(p,up.substring(1));
        else
            Rec(p+ch,up.substring(1));
    }
}