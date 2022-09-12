package exercises.lsn1datatypes;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");

        String name = input.nextLine();
        System.out.println("Hello " + name);

        String firstSentance = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Enter a word");
        String searchTearm = input.nextLine();
        Integer index = firstSentance.indexOf(searchTearm);
        Integer wordlength = searchTearm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + wordlength + " characters long.");
        String modifiedSentance = firstSentance.replace(searchTearm, "running");
        System.out.println(modifiedSentance);
    }
}