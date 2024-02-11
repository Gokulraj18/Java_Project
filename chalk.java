import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n,ans=0,ans2=0;
        n=in.nextInt();
        ans=(n/(int)Math.sqrt(n));
        ans2=ans/(int)Math.sqrt(n);
        ans+=ans2+n;
        System.out.print(ans);
    }
}
