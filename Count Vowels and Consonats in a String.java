import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                if( ch== 'a' || ch == 'e'  || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels : "+vowels);
        System.out.println("Number of consonants : "+consonants);
      }
  }