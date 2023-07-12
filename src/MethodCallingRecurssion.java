public class MethodCallingRecurssion {
    public static void main(String[] args){
    multiply();

    //recurssion method
        recursion(100);
        //count upto
        countupto(0,10);
    }//end main

    public static void multiply(){
        int result = getsomevalue() * 3;
        System.out.println("Multilplication of a given number with 3 : Result is :" + result);

    }//end add

    public static int getsomevalue(){
        return(140);
    }

    public static void recursion(int num) {
if(num >= 0){
    System.out.print(num +" ");
    recursion(num-1);

}
    }
    public static void countupto(int num1, int num2){
        System.out.println();
        if (num1 <= num2){
            System.out.println(num1);
            countupto(num1 + 1 , num2);
        }
    }
}
