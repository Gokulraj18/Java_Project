import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a[]=new int[100],n,i,j,temp;
        n=in.nextInt();
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }  
    }
}