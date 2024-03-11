import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int n,i,j,a[]=new int[100],Min_index=0,temp=0;
    n=in.nextInt();
    for(i=0;i<n;i++)
      a[i]=in.nextInt();
    for(i=0;i<n;i++){
      Min_index=i;
      for(j=i+1;j<n;j++){
        if(a[j]<a[Min_index])
          Min_index=j;
      }
        temp=a[Min_index];
        a[Min_index]=a[i];
        a[i]=temp;
    }
    for(i=0;i<n;i++)
      System.out.print(a[i]+" ");
  }
}