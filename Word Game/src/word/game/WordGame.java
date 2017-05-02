package word.game;

/**
 * @author janellejlo
 */
import java.util.Scanner;

public class WordGame {

    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[0;34m";
    public static final String RED = "\u001B[0;31m";
    public static final String MAGENTA = "\u001B[0;35m";

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        //Welcome screen
        System.out.println(BLUE + "Welcome to 'Guess the Word'!!!" + RESET);
        System.out.println("The rules are simple.");
        System.out.println("Guess what the word is, by looking at the hint.\n");
        
        char Round;
        char Difficulties;
        Game newGame;

        do {
            newGame = null;
            //prompt user for difficulty
            // user input difficulty
            System.out.println(BLUE + "Select a level of difficulty...." + RESET);
            System.out.println(BLUE + "Easy? Average? Hard? (Enter E, A, or H)" + RESET);
            Difficulties = keyboard.next().charAt(0);

            switch (Difficulties) {
                case 'e':
                case 'E':
                    System.out.println(MAGENTA + "You selected easy." + RESET);
                    newGame = new Easy();
                    break;
                case 'a':
                case 'A':
                    System.out.println(MAGENTA + "You selected average." + RESET);
                    newGame = new Average();
                    break;
                case 'h':
                case 'H':
                    System.out.println(MAGENTA + "You selected hard." + RESET);
                    newGame = new Hard();
                    break;
                default:
                    System.out.println(RED + "Wrong input, aborting" + RESET); //change to get input again
                    System.exit(0);
                    break;
            }
            newGame.play();

            //prompt user to play another round
            // user input into Round
            System.out.println("Thank you for playing the game!!!\n");
            System.out.println("Press y if you want to play again, or press any key to quit.\n");
            Round = keyboard.next().charAt(0);
        } while (Round == 'y');
    }
}

