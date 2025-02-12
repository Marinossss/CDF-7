package gr.aueb.cf.ch4;

public class Stars {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        System.out.println(" ");

        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        System.out.println(" ");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" ");

        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) { // j = i Δηλδη την 2η φορα που θα ξανα μπουμε στη εσωτερικη for
                System.out.print("*"); // το i=2 αρα και το J=2 οποτε 2 ως 10 εκτυπωνει 9 αστερια
            }
            System.out.println();
        }

    }
}
