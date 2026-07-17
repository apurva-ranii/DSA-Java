package HashMap;
import java.util.Scanner;

public class MaxNoOfVowel {
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e'){
            return true;
        }
        return false;
    }
    public static int NoOfVowel(String s,int k){
        int vowel=0;
        int maxVowel=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))
                vowel++;

        }
        maxVowel=Math.max(maxVowel,vowel);
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i)))
                vowel++;
            if(isVowel(s.charAt(i-k)))
                vowel--;
            maxVowel=Math.max(maxVowel,vowel);
        }
        return maxVowel;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        System.out.print("Enter the size of substring: ");
        int k=sc.nextInt();
        System.out.print("Maximum no. of vowel in the substring of size k: ");
        System.out.println(NoOfVowel(s,k));
        return;

    }


}
