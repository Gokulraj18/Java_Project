import java.util.*;
class pattern1{
    public static void main(String args[]){
        int i,j;
        for(i=3;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(i=1;i<=3;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
// 1 2 3 
// 1 2 
// 1 
// 1 
// 1 2 
// 1 2 3 