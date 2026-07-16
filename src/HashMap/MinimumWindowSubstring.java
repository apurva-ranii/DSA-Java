package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumWindowSubstring {
    public static String MinimumSubstring(String s,String t){
        HashMap<Character,Integer> freq=new HashMap<Character,Integer>();
        for(char ch: t.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        int minlen=Integer.MAX_VALUE;
        int left=0;
        int start=0;
        int required=t.length();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(freq.containsKey(ch)){
                if(freq.get(ch)>0){
                    required--;
                }
                freq.put(ch,freq.get(ch)-1);
            }
            while(required==0){

                if((right-left+1)<minlen){
                    minlen=right-left+1;
                    start=left;
                }
                char leftchar=s.charAt(left);
                if(freq.containsKey(leftchar)){
                    freq.put(leftchar,freq.get(leftchar)+1);
                    if(freq.get(leftchar)>0){
                        required++;
                    }

                }
                left++;
            }

        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter s: ");
        String s=sc.nextLine();
        System.out.println("enter t: ");
        String t=sc.nextLine();
        System.out.println("Minimum window substring:");
        System.out.println(MinimumSubstring( s, t));

        return;
    }
}
