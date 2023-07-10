import java.util.ArrayList;
public class wrapperfun {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(200);
        number.add(300);
        for(int num : number) {
            System.out.println(num);
        }
        String newnum = "300";
        int numeric = Integer.parseInt(newnum);// Wrapper class converting string to Int
        numeric += 10 + numeric;
        System.out.println(numeric);

        String pie = "3.144444";
        double pievalue = Double.parseDouble(pie);
        pievalue *= 2;
        System.out.print(pievalue);
    }//main
}
