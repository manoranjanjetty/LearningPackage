import java.util.Scanner;

public class Nameparser {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your full name ");
        String fullname = key.nextLine();
        System.out.println("Your name is " +fullname);
        String Fname = fullname.substring(0, fullname.indexOf(" "));
        String Lname = fullname.substring(fullname.indexOf(" "));
        String Fnameup = Fname.toUpperCase();
        String Lnamelow = Lname.toLowerCase();

        System.out.println("First Name : " +Fnameup);
        System.out.println("Last name : " + Lnamelow);

        StringBuilder NewName = new StringBuilder("Manoranjan Lakshmipraksh");
        System.out.println(NewName);

        NewName.replace(11,24,"Kumsi");
        System.out.println(NewName);

        NewName.append(" is a good boy");
        System.out.println(NewName);

        NewName.insert(11, "Lakshmiprakash ");
        System.out.println(NewName);

        NewName.delete(4,10);
        System.out.println(NewName);

        NewName.insert(0, "Dr ");
        System.out.println(NewName);
    }//end main
}
