package Array;
import java.util.Scanner;
public class RotateTheArrayNtimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];
        System.out.print("enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("No. of times you want to rotate the array: ");
        int rotate=sc.nextInt();
        rotate=rotate%n;
        for(int i=1;i<=rotate;i++){
            int temp=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        return ;
    }

}
