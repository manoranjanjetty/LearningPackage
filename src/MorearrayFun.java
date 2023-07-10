public class MorearrayFun {
    public static void main(String[] args){
//        int[] array;
//        array= new int[10];
        int[] array = new int[10];
//        array[0]=13;
//        array[1]=13;
//        array[2]=13;
//        array[3]=13;
//        array[4]=13;array[8]=13;
//        array[5]=13;
//        array[6]=13;
//        array[7]=13;
//        array[9]=13;

//        for(i=0; i<array.length; i++){
//            System.out.println(array[i]);
//        }


        for(int i=0; i < array.length ; i++){
            array[i] = i+1;
     //       System.out.println(array[i]);
        }//end for
        for (int num : array){
            System.out.println(num);
        }



    }//end main
}
