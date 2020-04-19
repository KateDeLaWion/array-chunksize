import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
          int[] myArray= {1,2,3,4,5};
          int chunkSize= 2;

        for(int i=0;i<myArray.length;i+=chunkSize){
            System.out.println(Arrays.toString(Arrays.copyOfRange(myArray, i, Math.min(myArray.length,i+chunkSize))));
        }

    }



}







//    public static int[][] splitArray(int[] arrayToSplit, int chunkSize){
//
//        int[] newArr= {};
//
//        for (int i=0; i<=arrayToSplit.length-1; i += chunkSize){
//            int[] slice = Arrays.copyOfRange(arrayToSplit, i, chunkSize + i);
//            newArr.add(Arrays.toString(slice));
//        }
//
//        return newArr;
//    }