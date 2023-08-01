public class MethodFun {
    public static void main(String[] args){
    printhello();
    printnum(5); //argument
    int result = printnumber();
        System.out.println("number is :" +result);
        result = add(193, 134); //arguments
        System.out.println(" addition of 2 numbers : "+ result);
        double result1 = square(3.144);
        System.out.println("Square of the number" + result1);
        System.out.println("square of num : " + square(23.123));

    }//end main

    //void parameterless method
    public static void printhello(){
        System.out.println("Hello there!");
    }//end print hello

    //void parameterized method
    public static void printnum(int a){
        System.out.println("The number is" + a);
    }//end print num

    //value returning parameterless method
    public static int printnumber(){
        return 10;
    }//end Print-number

    //value returning parameterized method
    public static int add(int num1, int num2){
      //  System.out.println("Addition of 2 numbers" + (num1 + num2));
        return (num1 + num2);
    }//end add

    //square the double
    public static double square(double num1){
        return(num1 * num1);
    }
}
