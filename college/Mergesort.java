import java.util.*;
class Main{
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int i,n;
    n=in.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
        arr[i]=in.nextInt();
    mergesort(arr,0,arr.length);
    for(i=0;i<arr.length;i++)
    System.out.print(arr[i]+" ");
    }
    public static void mergesort(int arr[],int s,int e){
        int m=(e+s)/2;
        if(e-s==1)
        return;
        else{
            mergesort(arr,s,m);
            mergesort(arr,m,e);
            merge(arr,s,m,e);
        }
    }
    public static void merge(int arr[],int s,int m,int e){
        int mix[]=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++)
        arr[s+l]=mix[l];
    }
}