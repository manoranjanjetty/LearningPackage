import java.util.Arrays;
import java.util.Scanner;
public class arrayofemployeeage {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        int[] age = new int[5];
        String[] name = new String[5];
        for(int i=0; i<5; i++){
            System.out.println("Please enter the employee name");
            name[i] = key.nextLine();
            System.out.println("Please enter the employee age");
            age[i] = key.nextInt();
            key.nextLine();
        }//end for
        for(int i=0; i< name.length;i++ ){
            System.out.println("EmployeeName is " + name[i] + " and he is " + age[i] +" years old");
        }//end for
    }//end main
}
