package gr.aueb.cf.ch14.services;

/**
 * Επιστρεφει ενα μονο instance και παντα αναφερομαστε στο ιδιο ,
 * δειχνει δηλαδη στο ιδιο αντικειμενο
 */
public class CodingFactorySingleton {
    // Αυτή είναι η λεγόμενη eager initialization, δηλαδή το αντικείμενο δημιουργείται αμέσως όταν φορτώνεται η κλάση στη μνήμη.
    private static final CodingFactorySingleton INSTANCE = new CodingFactorySingleton();

    private CodingFactorySingleton() {

    }

    public static CodingFactorySingleton getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
