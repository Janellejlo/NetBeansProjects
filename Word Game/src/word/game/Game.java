package word.game;

import java.util.Random;
import java.util.Scanner;

/**
 * @author janellejlo
 */
public abstract class Game {

    protected static final int MAX_TRIES = 8;
    protected static String[][] Wordlist;
    protected static String Word;
    protected static String WordD; //definition
    protected static char Letter; //probably not needed
    protected static int num_of_wrong_guesses;
    protected static char Ans;
    protected static String unknown;
    
    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[0;34m";
    public static final String RED = "\u001B[0;31m";
    public static final String MAGENTA = "\u001B[0;35m";
    public static final String GREEN = "\u001B[0;32m";

    // Get unknown
    public static String getunknown() {
        return unknown;
    }

    public static void setunknown(String UWord) {
        String temp = "";
        for (int i = 0; i < UWord.length(); i++) {
//            unknown = unknown.substring(0, i) + "*";
            temp += "*";
        }
        unknown = temp;
    }
    
    public static void updateUnknown(String ans, char letter){
        if(unknown.length() != ans.length()){
            System.out.println(RED + "Answer is not the same length as unknown" + RESET);
            System.exit(0);
        }
        
        char[] unknownChars = unknown.toCharArray();
        for (int i = 0; i < ans.length(); i++) {
            if(ans.charAt(i)==letter){
                unknownChars[i] = letter;
            }
        }
        unknown = String.valueOf(unknownChars);
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
        secretword = secretword.toLowerCase();
        guess = Character.toLowerCase(guess);

        for (i = 0; i < len; i++) {
            if (guess == guessword.charAt(i)) {
                return 0;
            }
            if (guess == secretword.charAt(i)) {
                guessword = guessword.substring(0, i) + guess + guessword.substring(i + 1);
                matches++;
            }
        }
        updateUnknown(secretword, guess);
        return matches;

    }

    public static boolean play() {
        
        Random randomGenerator = new Random();
        int n = 0;
        char Letter;
        //System.out.println("Getting a random number");
        if(Wordlist!=null)
            n = randomGenerator.nextInt(Wordlist.length);
        else{
            System.out.println(RED + "Wordlist not set up, aborting" + RESET);
            System.exit(0);
        }
        String def = Wordlist[n][1];
        String ans = Wordlist[n][0];
        setunknown(ans);
        Scanner keyboard = new Scanner(System.in);

        System.out.println(BLUE + "\nEach letter is represented by an asterisk." + RESET);
        System.out.println(BLUE + "\nYou have to type only one letter in one try." + RESET);
        System.out.println(BLUE + "\nYou have " + MAX_TRIES + " tries to try." + RESET);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Loop until the guesses are used up
        while (num_of_wrong_guesses < MAX_TRIES) {
            System.out.println("\n" + def);//This displays the hint of the secret word.
            System.out.println("\n" + unknown);
            System.out.println("\nGuess a letter: ");
            Letter = keyboard.nextLine().charAt(0);

            //Comparing the letter to the word.
            // Fill secret word with letter if the guess is correct,
            // otherwise increment the number of wrong guesses.
            if (CharFill(Letter, ans, unknown) == 0) {
                System.out.println(RED + "Whoops! That letter is not in the word." + RESET);
                num_of_wrong_guesses++;
            } else {
                System.out.println(MAGENTA + "You found a letter!" + RESET);
            }
            
            // Tell user how many guesses has left.
            System.out.println(BLUE + "You have " + (MAX_TRIES - num_of_wrong_guesses) + RESET);
            System.out.println(BLUE +" guesses left." + RESET);
            // Check if user guessed the word.
            if (ans.toLowerCase().equals(unknown.toLowerCase())) {
                System.out.println(ans);
                System.out.println(MAGENTA + "\nCongratulations!!! You guessed the word!!"  + RESET);
                return true;
            }
        }
            System.out.println(RED + "\nSorry, you lose..., You can try again..." + RESET);
            System.out.println("The word was : " + ans);
        return false;
    }
}
