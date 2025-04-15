import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String OriginalStr = sc.next();
        String cleanedStr = OriginalStr.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = "";

        for (int i=cleanedStr.length()-1; i>= 0; i--){
            reversedStr = reversedStr + cleanedStr.charAt(i);
        }
        if (reversedStr.equals(cleanedStr)){
            System.out.println("It's a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
