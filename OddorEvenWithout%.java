import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        System.out.print(isOdd(n));
    }
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
}