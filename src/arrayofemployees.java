import java.util.Scanner;
import java.util.ArrayList;
public class arrayofemployees {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        String empname;
        int empage;
        ArrayList<Integer> age = new ArrayList<>();
         int[] array = new int[5];


        for(int i=0; i<5; i++){
            System.out.println("Please enter the Name:");
            empname = key.nextLine();
            name.add(empname);
            System.out.println("Please enter the Age :");
            empage = key.nextInt();
            key.nextLine();
            age.add(empage);
        }//end for
        for(int i = 0; i < name.size() ; i++){
            System.out.println(name.get(i) + " age is " + age.get(i) );
        }
       // System.out.println("");
//        for( String empname1 : name){
//
//            System.out.println(empname1);
//        }

    }//end main
}
