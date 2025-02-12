package gr.aueb.cf.ch4;

public class Eksigisi {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int epi = 1;
        int y = 1;

        while (i <= 10) {
            System.out.println(sum + " + " + i);
            sum +=  i;// ειναι σαν να λεμε Λεμε sum = 0+ 1 οποτε θα γινει sum = 1+2 μετα sum=3+3 μετα sum=6+4
            i ++;
        }

        System.out.println("Sum= " + sum);


        while (y <= 10) {
            System.out.println(epi + " * " + y);
            epi *= y;
            y++;
        }
        System.out.println("Sum= " + epi);
    }
}
