import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i;
        int n=in.nextInt();
        int a[]=new int[100];
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int target=in.nextInt();
        System.out.println(BinarySearch(a,0,n,target));
    }
    public static int BinarySearch(int a[],int s,int e,int target){
        if(e>=1) {
            int mid = (s + e / 2);
            if (a[mid] == target)
                return mid;
            if (a[mid] < target)
                return BinarySearch(a, s, mid - 1, target);
            if (a[mid]>target)
                return BinarySearch(a,mid+1,e,target);
        }
        return -1;
    }
}