package word.game;

/**
 * @author janellejlo
 */
import java.util.Scanner;

public class WordGame {
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //Welcome screen
        char Round;
        char Difficulties;
        Game newGame;

        do {
            newGame = null;
            //prompt user for difficulty
            // user input difficulty
            System.out.println("Easy? Average? Hard? (Enter E, A, or H)");
            Difficulties = keyboard.next().charAt(0);
            
            switch (Difficulties) {
                case 'E':
                    newGame = new Easy();
                    break;
                case 'A':
                    newGame = new Average();
                    break;
                case 'H':
                    newGame = new Hard();
                    break;
                default:
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

