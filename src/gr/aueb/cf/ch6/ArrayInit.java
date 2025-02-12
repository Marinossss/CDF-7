package gr.aueb.cf.ch6;

/**
 * Δηλωση και αρχικοποιηση ενος πινακα
 * populate ενα πινακα
 * a) new
 * β) usized init
 * γ) array initializer
 * - print τα στοιχεια ενος πινακα
 */
public class ArrayInit {
    public static void main(String[] args) {

        int[] arr = new int[3];                 //declare and initialization
        int[] arr2 = {1, 2, 3, 4, 5};// unsized initializations
        int[] arr3;
        arr3 = new int[] {1, 2, 3, 4, 5}; //array initializer

        //populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // traverse = διασχηση
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");

        for (int el : arr3) { // οτι και να βαζω στην θεση του el εκτυπωνει τα στοιχεια της λιστας
            System.out.print(el + " ");
        }
    }
}
