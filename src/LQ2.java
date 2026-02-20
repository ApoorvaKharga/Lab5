import java.util.Scanner;

public class LQ2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String changedCase = str.toUpperCase();
        System.out.println("The string after changing the case is " + changedCase);


        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("The string after reversing is " + reversed);


        System.out.print("Enter the second string for comparison: ");
        String str2 = sc.nextLine();
        int diff = Math.abs(str.compareTo(str2));
        System.out.println("The difference between ASCII value is " + diff);


        System.out.print("Enter the string to be inserted into first string: ");
        String insert = sc.nextLine();
        String combined = str + " " + insert;
        System.out.println("The string after insertion is: " + combined);

        System.out.print("Enter a String: ");
        String caseStr = sc.nextLine();
        System.out.println("Uppercase: " + caseStr.toUpperCase());
        System.out.println("Lowercase: " + caseStr.toLowerCase());


        System.out.print("Enter a String: ");
        String charStr = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int position = charStr.indexOf(ch);
        if (position != -1)
            System.out.println("Position of entered character: " + position);
        else
            System.out.println("Entered character is not present");

        sc.nextLine(); // clear buffer


        System.out.print("Enter a String: ");
        String pal = sc.nextLine();
        String revPal = new StringBuilder(pal).reverse().toString();

        if (pal.equals(revPal))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");

        System.out.print("Enter a String: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        int vowels = 0, consonants = 0;

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("No. of words: " + wordCount);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}
