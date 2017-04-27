package word.game;

import java.util.Random;
import java.util.Scanner;

/**
 * @author janellejlo
 */
public abstract class Game {

    protected static final int MAX_TRIES = 3;
    protected static String[][] Wordlist;
    protected static String Word;
    protected static String WordD;
    protected static char Letter;
    protected static int num_of_wrong_guesses;
    protected static char Ans;
    protected static String unknown;

    // Get unknown
    public static String getunknown() {
        return unknown;
    }

    public static void setunknown(String UWord) {
        for (int i = 0; i < UWord.length(); i++) {
            unknown = unknown.substring(0, i) + "*";
        }
    }

    public static void setWord(String word) {
        Word = word;
    }

    public static String getWord() {
        return Word;
    }

    public static void setWordD(String def) {
        WordD = def;
    }

    public static String getWordD() {
        return WordD;
    }

    public static int CharFill(char guess, String secretword, String guessword) {
        int i;
        int matches = 0;
        int len = secretword.length();

        for (i = 0; i < len; i++) {
            if (guess == guessword.charAt(i)) {
                return 0;
            }
            if (guess == secretword.charAt(i)) {
                guessword = guessword.substring(0, i) + guess + guessword.substring(i + 1);
                matches++;
            }
        }
        return matches;

    }

    public static boolean play() {
        Random randomGenerator = new Random();
        int n = randomGenerator.nextInt(Wordlist.length);
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\n\nEach letter is represented by an asterisk.");
        System.out.println("\n\nYou have to type only one letter in one try.");
        System.out.println("\n\nYou have " + MAX_TRIES + " tries to try.");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Loop until the guesses are used up
        while (num_of_wrong_guesses < MAX_TRIES) {
            System.out.println("\n\n" + getWordD());//This displays the hint of the secret word.
            System.out.println("\n\n" + unknown);
            System.out.println("\n\nGuess a letter: ");
            keyboard.nextLine();

            //Comparing the letter to the word.
            // Fill secret word with letter if the guess is correct,
            // otherwise increment the number of wrong guesses.
            if (CharFill(Letter, Word, unknown) == 0) {
                System.out.println("Whoops! That letter is not in the word.");
                num_of_wrong_guesses++;
            } else {
                System.out.println("You found a letter!");
            }
            
            // Tell user how many guesses has left.
            System.out.println("You have " + (MAX_TRIES - num_of_wrong_guesses));
            System.out.println(" guesses left.");
            // Check if user guessed the word.
            if (Word.equals(unknown)) {
                System.out.println(Word);
                System.out.println("Congratulations!!! You guessed the word!!");
                return true;
            }
        }
            System.out.println("\nSorry, you lose..., You can try again...");
            System.out.println("The word was : " + Word);
        return false;
    }
}
