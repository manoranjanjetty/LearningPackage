import java.util.Random;
import java.util.Scanner;

public class Funwith2Darray {
    public static void main(String[] args) {
        int[][] array = new int[2][4];

    fillArray(array);
    printarray(array);
    }//end main
// getting the values to the array
    public static void fillArray(int [][] twodarray){
        Random rand = new Random();
      //  Scanner key = new Scanner(System.in);
        for(int i = 0; i < twodarray.length; i++){
            for(int j=0; j< twodarray[i].length; j++){
                //via random number generator
                twodarray[i][j] = rand.nextInt(100);
            //via userinput    twodarray[i][j] = key.nextInt();
            }
        }
    }

//Print method
    public static void printarray(int[][] twodarray){
     for(int[] arr : twodarray){
         for (int num : arr){
             System.out.print(num +"\t");
         }//end of inner for loop
         System.out.println();
     }//end of outer for loop
    }//end of print array
}
