import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int i,j,n,d=0,r=0,c=0,a[][]=new int[100][100],count=0;
    n=in.nextInt();
    for(i=0;i<n;i++){
      for(j=0;j<n;j++){
        a[i][j]=in.nextInt();
      }
    }
    for(i=0;i<n;i++){
      d=d+a[i][i];
    }
    for(i=0;i<n;i++){
      r=0;
      for(j=0;j<n;j++){
        r=r+a[i][j];
      }
      if(d==r)
        count=1;
      else{
        count=0;
        break;
      }
    }
    if(count==1){
    for(i=0;i<n;i++){
      c=0;
      for(j=0;j<n;j++){
        c=c+a[j][i];
      }
      if(d==c)
        count=1;
      else{
        count=0;
        break;
      }
    }
    }
    if(count==1)
      System.out.print("yes");
    else
      System.out.print("no");
    
  }
}
