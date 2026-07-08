package String;
import java.util.Scanner;

public class SentenceAnalysis {
    public static int wordCount(String[] words){
        int n=words.length;
        return n;
    }
    public static String LongestWord(String[] words) {
        String longest=words[0];
        for(String word: words){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
        return longest;
    }
    public static String ShortestWord(String[] words){
        String Shortest=words[0];
        for(String word:words){
            if(word.length()<Shortest.length()){
                Shortest=word;
            }
        }
        return Shortest;

    }
    public static int NoOfVowelsinInitials(String[] words){
        int initial=0;
        int n=words.length;
        for(String word:words){
            char ch=Character.toLowerCase(word.charAt(0));
            if(ch=='a' || ch=='e' ||ch =='i' ||ch=='o' ||ch=='u'){
                initial++;
            }
        }
        return initial;
    }
    public static int TotalVowels(String str){
        int vowel=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=Character.toLowerCase(str.charAt(i));
            if(ch=='a' || ch=='e' ||ch =='i' ||ch=='o' ||ch=='u'){
                vowel++;
            }
        }
        return vowel;
    }
    public static char MostFrequentlyOccuringCharecter(String str){
        int n=str.length();
        int[] freq=new int[257];
        for(int i=0;i<n;i++){
            if (str.charAt(i) == ' ') {
                continue;
            }
            freq[str.charAt(i)]++;
        }
        int max=0;
        char ans=' ';
        for(int i=0;i<257;i++){
            if(freq[i]>max){
                max=freq[i];
                ans=(char)i;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the line: ");
        String str=sc.nextLine();
        String[] words=str.trim().split("\\s+");
        System.out.println("Total Words: "+ wordCount(words));
        System.out.println("Longest word: "+ LongestWord(words));
        System.out.println("Smallest word: "+ShortestWord( words));
        System.out.println("No. of words starting with Vowels: "+NoOfVowelsinInitials( words));
        System.out.println("Total Vowels: "+TotalVowels(str));
        System.out.println("Most Frequesntly occuring charecter: "+MostFrequentlyOccuringCharecter(str));
        return;
    }

}
