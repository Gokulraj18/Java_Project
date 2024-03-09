import java.util.*;
class pattern1{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=5;i++){
            if(i%2==0){
                for(j=i;j>=1;j--){
                    System.out.print(j);
                }
                System.out.println();
            }
            else{
                for(j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
// 1
// 21
// 123
// 4321
// 12345