import java.util.Random;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class arrayfun {
    public static void main(String[] args){
        int[] myarray;
        myarray = new int[6];
        myarray[0]=10;
        myarray[1]=11;
        myarray[2]=12;
        myarray[3]=14;
        myarray[4]=13;
        myarray[5]=15;

//        for(int i=0; i< myarray.length ; i++){
//            System.out.println(myarray[i]);
//        }//end of for loop
//        Scanner key = new Scanner(System.in);
//        Random randomnum = new Random();
//        int random = randomnum.nextInt(100);
//        System.out.println(random);
//        int num=key.nextInt();
//        key.nextLine();
//        System.out.println(num);
        for(int array : myarray){
            System.out.println(array);
        }
    }//end main
}
