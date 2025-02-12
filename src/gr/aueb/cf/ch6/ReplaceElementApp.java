package gr.aueb.cf.ch6;

public class ReplaceElementApp {


    public static void main(String[] args) {

        int[] pek;
        pek = new int[] {1, 2, 4, 7};

        System.out.println("Πριν την αλλαγη: ");
        printArray(pek);

        replace(pek, 7, 13);

        System.out.println("Μετα την αλλαγη: ");
        printArray(pek);

        System.out.println("Η θεση του 1 ειναι: ");
        int position = getPosition(pek, 1);
        System.out.println(position);


    }

    public static void replace(int[] arr, int oldVal, int newVal) {
        int positionToUpdate;

        positionToUpdate = getPosition(arr, oldVal);

        if (positionToUpdate == -1) {
            return;
        }

        arr[positionToUpdate] = newVal;
    }


    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();  // Νέα γραμμή στο τέλος της εκτύπωσης
    }
}
