import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a[]=new int[100],n,i,j,key;
        n=in.nextInt();
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(j=1;j<n;j++){
            key=a[j];
            i=j-1;
            while(i>=0 && a[i]>key){
                a[i+1]=a[i];
                i=i-1;
            }
            a[i+1]=key;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}