import java.util.Scanner;

public class Palindrom{
    private static boolean isPalindrome(String str) {

        int i = 0;

        int j = str.length() - 1;

        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");

        String word = scanner.nextLine();

        word = word.toLowerCase();

        boolean isPalindrome = isPalindrome(word);


        if (isPalindrome)
        {
            System.out.println("The word is a palindrome.");

        }
        else
        {
            System.out.println("The word is not a palindrome.");
        }
    }


}
