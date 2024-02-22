import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        System.out.print(Sorted(a,0));
    }
    public static boolean Sorted(int a[],int index){
        if(index==a.length-1)
        return true;
        return (a[index]<a[index+1]&&Sorted(a,index+1));
    }
}