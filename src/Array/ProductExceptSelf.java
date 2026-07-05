package Array;
import java.util.Scanner;
import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] nums=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] ans=Product(nums);
        System.out.println("Product of numbers of array except self: ");
        System.out.println(Arrays.toString(ans));
        return;

    }
    public static int[]  Product(int[] nums){
        int n=nums.length;
        int[] result=new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        int suffix = 1;
        for(int i = n-1; i >= 0; i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }

}
