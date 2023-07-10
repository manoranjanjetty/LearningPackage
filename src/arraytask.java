import java.util.Scanner;

public class arraytask {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        int[] myarray = new int[5];
        int number;
        for(int i=0; i< myarray.length; i++){
            System.out.println("Please enter the Integer :");
            myarray[i] = key.nextInt(); }
        for (int i=0; i< myarray.length; i++){
            number = myarray[i] * 2;
            System.out.println(number);
        }//end for

    }//end main
}
