import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check Palindrome: ");
        String str = input.nextLine();

        if (isPalindrome(str)) 
        {
            System.out.println(str + " is a palindrome");
        } 
        else 
        {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}