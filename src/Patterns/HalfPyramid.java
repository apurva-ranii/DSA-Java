package Patterns;
import java.util.Scanner;
public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. for pattern: ");
        int n=sc.nextInt();
        // Pattern 1: Half Star Pyramid
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Pattern 2: Number Half Pyramid
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        // Pattern 3: Alphabet Half Pyramid
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int ascii=65+j;
                System.out.print((char)ascii);
            }
            System.out.println();

        }

        return;

    }
}
