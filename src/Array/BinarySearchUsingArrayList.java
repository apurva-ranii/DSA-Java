package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class BinarySearchUsingArrayList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>(n);
        System.out.print("Enter the elements of array");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.print("Enter the key: ");
        int target=sc.nextInt();
        int index=Binary( list,target);
        if(index==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element at index: "+ index);
        }


    }
    public static int Binary(ArrayList<Integer> list,int target){
        int st=0;
        int end=list.size()-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(list.get(mid)==target){
                return mid;
            }
            else if(list.get(mid)<target){
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
