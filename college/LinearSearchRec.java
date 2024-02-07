import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        int target=in.nextInt();
        System.out.print(LinearSearch(a,0,target));
    }
    public static int LinearSearch(int a[],int index,int target){
        if(index==a.length)
        return -1;
        if(a[index]==target)
        return index+1;
        else
        return LinearSearch(a,index+1,target);
    }
}