import java.util.*;
class pattern1{
    public static void main(String args[]){
        int i,j;
        for(i=5;i>=1;i--){
            for(j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// 5
// 54
// 543
// 5432
// 54321