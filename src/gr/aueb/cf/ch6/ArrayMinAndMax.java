package gr.aueb.cf.ch6;

/**
 * Finds the min and max of an array.
 */
public class ArrayMinAndMax {

    public static void main(String[] args) {

        int[] arr;
        arr = new int[] {10, 2, 3, 4};
        getMinPosition(arr);
        System.out.println("Minposition is: " + getMinPosition(arr));
        getMaxPosition(arr);
        System.out.println("Maxposition is:" + getMaxPosition(arr));

    }

    public static int getMinPosition(int[] arr1) {

        if (arr1 == null || arr1.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr1[minPosition];

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < minValue) {
                minPosition = i;
                minValue = arr1[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr) {

        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
