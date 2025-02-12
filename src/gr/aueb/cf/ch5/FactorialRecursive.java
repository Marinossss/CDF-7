package gr.aueb.cf.ch5;

public class FactorialRecursive {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(factod(i));
        }
    }

    public static long factod(int n) {
//        if (n <= 1) return 1;
//        return factod(n-1) * n;

        return (n <= 1) ? 1L : n * factod(n-1);
    }
}
