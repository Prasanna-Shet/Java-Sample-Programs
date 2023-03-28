import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the string: ");
                String str = scanner.nextLine();

                System.out.print("Enter the substring to count: ");
                String substring = scanner.nextLine();

                int count = countSubstringOccurance(str, substring);
                System.out.println("Number of occurances" +count);
            }

            public static int countSubstringOccurance(String str, String substring) {
                int count = 0;
                int index = str.indexOf(substring);

                while (index != -1) {
                    count++;
                    str = str.substring(index + substring.length());
                    index = str.indexOf(substring);
                }
                return count;
            }
        }