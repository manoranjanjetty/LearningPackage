public class methodoverloading {
    public static void main(String[] args) {
        int result = add(3,4);
        System.out.println(result);
        System.out.println(add(3));
        System.out.println(add(3,"13"));
        System.out.println("Concatination of 2 strings is " + add("mano", "Ranjan"));
    }//END MAIN

    public static int add(int num1, int num2){
        return num1 + num2;
    }//end add
    public static int add(int num3){
        return num3 * 2;

    }//end add
    public static int add(int num, String value ){
        return num * Integer.parseInt(value);
    }//end add

    public static String add(String str1, String str2){
        return str1 + " " + str2;
    }
}
