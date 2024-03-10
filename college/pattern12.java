import java.util.*;
class pattern1{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                if(j==i || j){
                    System.out.print("X");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}