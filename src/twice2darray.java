import java.util.Random;
import java.util.SortedMap;

public class twice2darray {
    public static void main(String[] args) {
int[][] array = new int[3][3];
fillthearray(array);
printarray(array);
doublearray(array);
        System.out.println();
multiplyarray(array);



    }

    public static void fillthearray(int[][] myarray) {
        Random rand = new Random();
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                myarray[i][j] = rand.nextInt(50);
            }//end inner for
        }//end outer for
    }//end fill the array

        public static void printarray(int[][] myarray){
            for(int[] arr : myarray){
                for(int num : arr){
                    System.out.print(num +"\t");
                }//end inner for
                System.out.println();
            }//end outer for
            System.out.println();
        }//end printarray


    public static void doublearray(int[][] myarray){
        for(int[] arr : myarray){
            for (int num : arr){
                System.out.print(num*2 +"\t");
            }//end inner for
            System.out.println("");
        }//end outer for
    }//end doublearray

    public static void multiplyarray(int[][] myarray){
        for(int i=0; i< myarray.length; i++){
            for(int j=0; j<myarray[i].length; j++){
                myarray[i][j] = myarray[i][j] * 2 * 2 ;
            }//inner for close

        }
        for(int i=0; i< myarray.length; i++){
            for(int j=0; j<myarray[i].length; j++){
                System.out.print(myarray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    }

