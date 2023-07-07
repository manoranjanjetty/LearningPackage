import java.util.Scanner;
public class Learning_Package {
    public static void main(String[] args){
        System.out.print("Please select your Package : 1, 2 & 3? \n");
        Scanner keyboard = new Scanner(System.in);
        int package_option;
        int cost = 0;
        package_option=keyboard.nextInt();
        keyboard.nextLine();
        switch(package_option){
            case 1:
               cost = 10;
                System.out.println("Please enter the no of courses :");
                int courses=keyboard.nextInt();
                if (courses <= 2){
                    cost =10;
                }else {
                    cost = cost + (courses-2) * 6;
                }
                System.out.println("Total cost of the course is : " + cost + "$");
               break;
            case 2:
                cost = 12;
                System.out.println("Please enter the no of courses : ");
                courses=keyboard.nextInt();
                if (courses <= 4){
                    cost =12;
                }else {
                    cost = cost + (courses-4) * 4;
                }
                System.out.println("Total cost of the course is : " + cost + "$");
                break;
            case 3:
                cost =15;
                System.out.println("Please enter the no of courses : ");
                courses=keyboard.nextInt();
                if (courses <= 6){
                    cost =15;
                }else {
                    cost = cost + (courses-6) * 3;
                }
                System.out.println("Total cost of the course is : " + cost+ "$");
                break;
            default:
                System.out.println("Please enter the correct option between 1,2 or 3?");
        }

    }//end main
}
