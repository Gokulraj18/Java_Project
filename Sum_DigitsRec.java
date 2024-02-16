import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        System.out.print(sum(n));
    }
    public static int sum(int n){
        if(n==0)
        return 0;
        else 
        return (n%10)+sum(n/10);
    }
}