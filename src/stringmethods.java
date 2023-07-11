public class stringmethods {
    public static void main(String[] args) {
        String str1 = "Manoranjan";
        String str2 = "Manoranjan";
        String str3 = "Mannjan";
        String str4 = "Rob";

        for(int i=0; i<str1.length(); i++){
            System.out.print(str1.charAt(i) +" " );


        }//end for
        System.out.println("\n");
        if(str1.equals(str2)){
            System.out.println("Strings are equal\n");
        }else
        {
            System.out.println("String are not equal");
        }
        if(str2.compareTo(str3) > 0){
            System.out.println("string 1 is > String 2");
        }else{
            System.out.println(str2 +" <= " + str3);
        }
        if(str1.equals(str4)){
            System.out.println("Name are equal");
        }else
        {
            System.out.println("Names are not equal");
        }
        if (str1.compareTo(str4) > 0)
        {
            System.out.printf(str1 + " > " + str4);
        } else if (str1.compareTo(str4) < 0){
            System.out.println(str1 + " < " + str4);
        } else {
            System.out.println(str1 + " = " + str4);
        }
            }//end main
}
