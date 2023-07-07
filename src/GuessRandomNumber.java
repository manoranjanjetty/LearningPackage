import java.util.Scanner;
import java.util.Random;
public class GuessRandomNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int randomnumber =random.nextInt(100) +1;
        //System.out.println("Please guess the number between 0 to 100");
       // int userInput=keyboard.nextInt();
        int userInput;
        keyboard.nextLine();
        int guess =1;
        System.out.println("Please guess the number between 0 to 100");
        userInput=keyboard.nextInt();
        keyboard.nextLine();
        if(userInput == randomnumber){
            System.out.println("hurrah!!! you guessed it correctly");
        }
        while (userInput != randomnumber)
        {

            if (randomnumber > userInput)
            {
                int diff = randomnumber - userInput;
                if (diff < 5){
                    System.out.println("You're too close");
                }else{
                    System.out.println("You're too high");
                }
            } else if (randomnumber < userInput){
                int diff = userInput - randomnumber;
                if(diff <5){
                    System.out.println("You're too close");
                }else{
                    System.out.println("You're too high");
                }
            }
            guess++;
        }//end while
        System.out.println("You guessed the correct number in " +guess+ " gusess");


    }
}
