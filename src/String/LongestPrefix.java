package String;
import java.util.Scanner;

public class LongestPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        sc.nextLine();
        String[] fruits=new String[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            fruits[i]=sc.nextLine();
        }
        String ans=LongestPrefixFinder( fruits);
        System.out.print("The longest prefix of the elements in array is : ");
        System.out.println(ans);

    }
    public static String LongestPrefixFinder(String[] fruits){
        if(fruits==null||fruits.length==0){
            return "";
        }
        String first=fruits[0];
        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);
            for(int j=1;j<fruits.length;j++){
                if(i==fruits[j].length()||ch!=fruits[j].charAt(i)){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}
