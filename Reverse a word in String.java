import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a string to be reversed: ");
                String inputString = scanner.nextLine();

                inputString = inputString.toUpperCase();
                StringBuffer sb = new StringBuffer(inputString);
                sb.reverse(); //reverse() method to reverse the string
                System.out.println("The reversed string is: " + sb);
            }
        }