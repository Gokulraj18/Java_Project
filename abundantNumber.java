import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int i,n,ans=0,ans2=0;
        n=in.nextInt();
        for(i=1;i<n;i++){
            if(n%i==0)
                ans+=i;
        }
        if(ans>n)
        System.out.print("Abundant Number");
        else
        System.out.print("Not a Abundant NUmber");
    }
}
