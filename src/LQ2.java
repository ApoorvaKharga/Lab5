import java.util.Scanner;

public class LQ2 {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("The string after changing the case is " + str.toUpperCase());
        System.out.println("The string after reversing is " +
                new StringBuilder(str).reverse());

        System.out.print("Enter the second string for comparision: ");
        String str2 = sc.nextLine();
        System.out.println("The difference between ASCII value is " +
                Math.abs(str.compareTo(str2)));

        System.out.print("Enter the string to be inserted into first string: ");
        String insert = sc.nextLine();
        System.out.println("The string after insertion is: " + str + " " + insert);

        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        System.out.print("Enter a String: ");
        String s3 = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int pos = s3.indexOf(ch);
        if (pos != -1)
            System.out.println("Position of entered character: " + pos);
        else
            System.out.println("Entered character is not present");

        sc.nextLine();

        System.out.print("Enter a String: ");
        String pal = sc.nextLine();
        String rev = new StringBuilder(pal).reverse().toString();
        if (pal.equalsIgnoreCase(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");

        System.out.print("Enter a String: ");
        String sentence = sc.nextLine();

        int vowels = 0, consonants = 0;
        String[] words = sentence.split("\\s+");

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) vowels++;
                else consonants++;
            }
        }

        System.out.println("No. of words: " + words.length);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}

