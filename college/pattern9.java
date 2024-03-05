import java.util.*;
class pattern1{
    public static void main(String args[]){
        int i,j,n=1;
        for(i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
// 1 2 3 4 5 
// 6 7 8 9 
// 10 11 12 
// 13 14 
// 15 