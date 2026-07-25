import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vowels = 0, consonants = 0, digits = 0, special = 0;

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {
                vowels++;
            }
            else if ((ch >= 'a' && ch <= 'z') ||
                     (ch >= 'A' && ch <= 'Z')) {
                consonants++;
            }
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            else {
                special++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);
    }
}
