import java.util.ArrayList;
import java.util.Scanner;

public class Projnamepermutations {
    public static void main(String[] args) {
       // StringBuilder name = new StringBuilder();
        String name;
        Scanner key = new Scanner(System.in);
        ArrayList<String> Fname = new ArrayList<>();
        ArrayList<String> Lname = new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.println("Please enter the "+ i + " GivenName & LastName");
          //  name = new StringBuilder(key.nextLine());
            name =key.nextLine();
            String FirstName = name.substring(0,name.indexOf(" "));
            Fname.add(FirstName);
            String LastName = name.substring(name.indexOf(" "));
            Lname.add(LastName);
        }//end For
        for(int i = 0; i< Fname.size(); i++){
            for(int j=0; j<Lname.size(); j++){
                System.out.print(Fname.get(i) +" ");
                System.out.println(Lname.get(j));
            }
       /* for (String s : Fname) {
            System.out.println(s + " " + Lname.get(0));
            System.out.println(s + " " + Lname.get(1));
            System.out.println(s + " " + Lname.get(2));
            System.out.println(s + " " + Lname.get(3));
            System.out.println(s + " " + Lname.get(4));*/
        }
    }
}
