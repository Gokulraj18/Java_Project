import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print(Counting(n,0));
    }
    public static int Counting(int n,int count){
        if(n==0)
        return count;
        else{
        int rem=n%10;
        if(rem==0)
        count++;
        return Counting(n/10,count);
        }
    }
}
