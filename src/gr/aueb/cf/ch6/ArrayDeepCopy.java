package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr1 = {6, 7, 8, 9, 10};

        int[] copied;
        
        copied = arrDeep(arr1);

        copied[4] = 9;

        for (int el : arr1) {
            System.out.print(el);
        }

        System.out.println();


        for (int el : copied) {
            System.out.print(el);
        }
    }

    /**
     * it does a fresh copy of an array.
     * @param source the source array.
     * @return       the copied array.
     */
    public static int[] arrDeep(int[] source){

        int[] destination = new int[source.length];

        for(int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
//        System.out.println(source.length);

//        System.arraycopy(source, 0, destination, 0, source.length);
//        destination = Arrays.copyOf(source, source.length);
//        destination = Arrays.copyOfRange(source, 0, source.length);

        return destination;

    }
}
