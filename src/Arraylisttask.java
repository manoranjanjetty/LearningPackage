import java.util.ArrayList;
import java.util.Scanner;
public class Arraylisttask {
    public static void main(String[] args){
       // boolean cond=false;
        double value;
        Scanner key = new Scanner(System.in);
        ArrayList<Double> myarray = new ArrayList<>();
        System.out.println("Please end the values or -value to exit :");
        value = key.nextDouble();
        while(value >= 0){
            myarray.add(value);
            System.out.println("Please enter the values or -value to exit :");
           // double inputvalue = Double.parseDouble();
            value = key.nextDouble();
        }//end while
        for(int i= myarray.size() -1; i>=0 ; i--){
            System.out.println("Please find the entered num in reverse order " + myarray.get(i));
        }//end for

    }//end main
}
