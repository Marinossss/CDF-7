package gr.aueb.cf.ch6;

public class SwapApp {

    public static void main(String[] args) {
        int[] arr = {1, 10};
        System.out.println("Αρχικός πίνακας: ");
        printArray(arr);
        System.out.println("Μετα την Αλλαγη: ");
        swap(arr);
        printArray(arr);
    }

    public static void swap(int[] arr) {
        if (arr.length != 2) return;

//        arr = new int[2];
        int tmp = arr[0];
        arr[0] = arr[1];
        arr [1] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.println(el + " ");
        }
    }
}
