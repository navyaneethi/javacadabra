/*You're given sentence S, and your task is to find and return a string value representing the longest word 
in S that has an even length and starts with a vowel ( case insensitive). If multiple words have the same 
maximum even length, return the first occurring one. If no such word exists, return "00".

Example 1 : input : The sun sets in the west.
output : in
Example 2 : Input : Hello World.
output : 00 */

import java.util.Scanner;

public class longestEvenVowelWord {
    public static String findLongestEvenVowelWord(String sentence){
        String longest = "00";
        int maxlength = 0;
        sentence = sentence.replaceAll("[^a-zA-Z\\s]", "");
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            if (word.length()%2==0 && startsWithVowel(word)){
                if (word.length()>maxlength) {
                    longest = word;
                    maxlength = word.length();
                }
            }
        }
        return longest;
    }
    private static boolean startsWithVowel(String word) {
        if (word.isEmpty()) return false;
        char firstChar = Character.toLowerCase(word.charAt(0));
        return "aeiou".indexOf(firstChar) != -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence :");
        String S = scan.nextLine();

        String result = findLongestEvenVowelWord(S);
        System.out.println("Output: " + result);

        scan.close();
    }
}
