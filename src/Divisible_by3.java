import java.util.Scanner;
public class Divisible_by3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("Please enter the Integer number: ");
        num = keyboard.nextInt();
        keyboard.nextLine();
        if (num % 3 == 0){
            System.out.println("The number "+num+" is divisible by 3");
        }else {
            System.out.println("The number "+num+" is not divisible by 3");
        }
    }//end main
}
