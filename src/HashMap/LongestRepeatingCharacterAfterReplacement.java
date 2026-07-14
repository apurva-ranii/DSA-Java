package HashMap;

import java.util.Scanner;
import java.util.HashMap;

public class LongestRepeatingCharacterAfterReplacement {
    public static int NoOfReplacement(String s, int k){
        HashMap<Character,Integer> map =new HashMap<Character,Integer>();
        int maxfreq=0;
        int windowsize=0;
        int ans=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
            while((right-left+1)-maxfreq>k){
                char ch1=s.charAt(left);
                map.put(ch1,map.getOrDefault(ch1,0)-1);
                left++;
            }

            ans=right-left+1;
        }

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        System.out.println("Enter the maximum num of replacement:");
        int k=sc.nextInt();
        System.out.println("No of charecter with repeating letters:");
        System.out.println(NoOfReplacement( s,  k));
        return;
    }
}
