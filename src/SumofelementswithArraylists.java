import java.util.ArrayList;

public class SumofelementswithArraylists {
    public static void main(String[] args) {
        ArrayList<Integer> myarray = new ArrayList<>();
        myarray.add(121);
        myarray.add(212);
        myarray.add(323);
        int sum1 = sum(myarray);
        System.out.println(sum1);

    }//end main

    public static int sum(ArrayList<Integer> myarraylist){
        int result = 0;
        for(int i=0; i<myarraylist.size(); i++){

            result += myarraylist.get(i);
        }
        return result;
    }
}
