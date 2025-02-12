package gr.aueb.cf.ch5;

/**
 * Υπολογιζει το παραγοντικο του n.
 * Όταν το i = 5, υπολογίζεται το
 * 5!= 1 * 2 * 3 * 4 * 5= 120
 * Όταν το i = 10, υπολογίζεται το
 * 10!= 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800
 */
public class Factorial {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "! +" + facto(i));
        }
    }

    /**
     * Calculates n!
     * @param n     the input number
     * @return      the factorial of n.
     */


    public static int facto(int n) { //Στην 1η επανάληψη, το i = 1, άρα καλείται η facto(1), και το n = 1.//Στην 2η επανάληψη, το i = 2, άρα καλείται η facto(2), και το n = 2. κλπ κλπ
        int result = 1;

        for (int i = 1; i <= n; i++) { //παραγωγικο n
            result = result * i;
        }
        return result;
    }
}
