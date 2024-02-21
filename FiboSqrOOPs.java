/** Fibonacci
Medium

NaN



Write a function to find Fibonacci numbers one by one within a limit N. Let 2 and 3 are the initial numbers in the sequence. Print the number. Pass it to another function that checks if the number is a power of 2. If so, print the number. Create a class that has these two functions and the main() function. Input Format The input consists of the value N. Output Format The output prints the Fibonacci numbers and whether the number is a power of two or not.
Example 1:
Input: 
 
5

Output:
2 is a fibonacci number 
2 is a power of two
3 is a fibonacci number 
5 is a fibonacci number
 
**/


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Fibo f = new Fibo();
        for(int i=2;i<=n;i++){
          f.fibo(i);
        }
    }
}
class Fibo{
    public void fibo(int i){
        int a=-1,b=1,c=0;
        while(c<i){
            c=a+b;
            a=b;
            b=c;
            if(i==c){
            System.out.println(c+" is a fibonacci number");
            power(c);
            }
        }
    }
    public void power(int c){
        int temp=2;
        while(temp<=c){
            if(temp==c){
            System.out.println(temp+" is a power of two");
            break;}
            temp*=2;
        }
    }
}