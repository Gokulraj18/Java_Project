import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(Reverse2(n,n));
    } 
    public static int Reverse(int n,int ans){
        if(n==0)
        return ans;
        else{
        int rem=n%10;
        ans=ans*10+rem;
        return Reverse(n/10,ans);
        }
    }
}