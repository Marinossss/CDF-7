package gr.aueb.cf.ch10;

/**
 * Transform to Uppercase-lowercase.
 * for instance, ATHENS becomes AtHeNs
 */
public class UpperLowerCaseApp {

    public static void main(String[] args) {

        String massage = "Athens";
        StringBuilder sb = new StringBuilder();
        String subStr;
        String s;

        for (int i = 0; i < massage.length(); i++) {
            subStr = massage.substring(i, i + 1);
            s = (i % 2 == 0) ? subStr.toUpperCase() : subStr.toLowerCase();
            sb.append(s);


        }

        System.out.println(sb);


    }
}
