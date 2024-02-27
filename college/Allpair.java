/*
All pairs
Create a class with two methods one to read the elements of an array and the other to find all pairs of elements in an array whose sum is equal to a specified number. Input Format The first line of the input consists of the value of n. The second line of the input consists of the array elements. The third line of the input consists of the sum value. Output Format The output prints the pair whose sum is equal to a specified number.
Example 1:
Input: 
 
5
1 2 3 4 5
8

Output:
3 5
4 4
5 3
*/
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        int target=in.nextInt();
        Pair p=new Pair(n,target,a);
    }
}
class Pair{
    Pair(int n,int target,int a[]){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]+a[j]==target)
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }
}
