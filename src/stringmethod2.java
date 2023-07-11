public class stringmethod2 {
    public static void main(String[] args){
        String myName = "Manoranjan Kumsi Lakshmiprakash";

        String substring = myName.substring(11);
        String uppercase = myName.toUpperCase();
        String lowercase = myName.toLowerCase();
        String substring1 = myName.substring(11,16);
        int index = myName.indexOf("s", 12);
        int index1 = myName.indexOf("a");

        System.out.println("Substring is " + substring);
        System.out.println("upper case conversion is " + uppercase);
        System.out.println("Lowercase conversion is " + lowercase);
        System.out.println("Substrings between 11 and 15 char " +substring1);
        System.out.println("index of char s from 11nth char " + index);
        System.out.println("Index of given sting S is " + index1);
    }
}
