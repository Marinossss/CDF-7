package gr.aueb.cf.ch1;

/**
 * calculates th sum of two integers
 * and the result is printed at console
 * (standard output)
 */


public class AddApp {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 12;
        int result = 0;
// απλα διλωνω το result οτιδηποτε για να το κτλβαινει ο κωδικας
        //εντολες
        result = num1 + num2;

        //εκτυπωση του αποτελεσματος
        System.out.println("Το αποτελεσμα ειναι: " + result);
        System.out.println("Το αθροισμα των " + num1 + ", " + num2 + " ειναι ισο με: " + result );
        System.out.printf("Το αθροισμα των %d, %d ειναι ισο με: %d\n" , num1, num2, result);
    }
}
