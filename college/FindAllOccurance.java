import java.util.*;
class FindAllOccurance{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        int target=in.nextInt();
        FindAll(a,0,target);
        System.out.print(list);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    public static void FindAll(int a[],int index,int target){
        if(index==a.length){
        return;
        }
        if(a[index]==target){
        list.add(index);
        }
        FindAll(a,index+1,target);
    }
}
