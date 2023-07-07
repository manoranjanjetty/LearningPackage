import java.util.Scanner;
import java.util.Random;
public class guessrandomgame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        int RandomNumber = random.nextInt(100) + 1;
        int guess = 0;
        int userguess;

        boolean guessednum = false;
        while (!guessednum) {
            System.out.println("Please enter your guess");
            userguess = keyboard.nextInt();
            guess++;
            if (userguess >= 0 && userguess <= 100) {
                if (userguess == RandomNumber) {
                    System.out.println("you guessed it correctly in " + guess + " attempt");
                    guessednum = true;
                } else if (userguess > RandomNumber) {
                    System.out.println("your guess is too high");
                } else {
                    System.out.println("your guess is too low");
                }
            } else {
                System.out.println("wasted guess!!!");
            }
        }//end while
    }
}


