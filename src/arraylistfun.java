import java.util.ArrayList;
public class arraylistfun {
    public static void main(String[] args){
        ArrayList<String> namelist = new ArrayList<>();
        namelist.add("Mano");
        namelist.add("ran");
        namelist.add("jan");

        for(int i=0; i< namelist.size(); i++){
            System.out.print(namelist.get(i));
        }//end of for

    }//end mail
}
