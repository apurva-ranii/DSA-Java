package Array;
import java.util.Scanner;
public class MergeTwoSortedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array:");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("enter elements of first array:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the size of second array:");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        System.out.println("enter elements of second array:");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        MergeArray(arr1,arr2);
    }
    public static void MergeArray(int[] arr1,int[] arr2){
        int l=arr1.length+arr2.length;
        int[] merged=new int[l];
        int i=0,j=0,k=0;
        while(i<arr1.length &&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                merged[k++]=arr1[i++];
            }
            else{
                merged[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            merged[k++]=arr1[i++];
        }
        while(j<arr2.length){
            merged[k++]=arr2[j++];
        }
        System.out.println("merged array");
        for(int p=0;p<l;p++){
            System.out.print(merged[p]+"  ");
        }

    }
}
