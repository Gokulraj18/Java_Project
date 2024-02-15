import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(Product(n));
    }
    public static int Product(int n){
        if(n==0)
        return 1;
        else
        return (n%10)*Product(n/10);
    }
}