import java.security.SecureRandomParameters;
import java.util.Random;

public class SumofElements {
    public static void main(String[] args){
        int n=100;
        int[] array = new int[n];
        read(array);
        sum(array);
    }//end main
    public static void read(int[] myarray){
       Random rand = new Random();
       for(int i = 0; i<myarray.length; i++){
           myarray[i] = i;
           System.out.print(myarray[i] + " ");
       // myarray[i] = rand.nextInt(10);
       }//for

        System.out.println();
    }//end read

    public static void sum(int[] myarray){
        int sumof=0;
        for (int i=0; i<myarray.length; i++){
            sumof = sumof + myarray[i];
            System.out.print(sumof +" ");
        }
        System.out.println("");
        System.out.println(sumof);
    }

    }

