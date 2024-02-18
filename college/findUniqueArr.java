import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int i,arr[]=new int[100],n;
        n=in.nextInt();
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        System.out.print(Find(arr));
    }
    public static int Find(int arr[]){
        int unique=0;
        for(int n:arr)
        unique^=n;
    return unique;
    }
}
// it works only for an array which contains the same element for 2 times and a single different element in it.