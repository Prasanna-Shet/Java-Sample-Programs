import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String resultStr = str.trim();

        System.out.println("Original string:" + str);
        System.out.println("Resulted string:" + resultStr);
    }
}