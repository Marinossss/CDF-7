package gr.aueb.cf.ch7;

public class TraverseWithSubstring {


    public static void main(String[] args) {
        String s = "Athens Uni of Econ and Bus";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1)); //εδω τα εκτυπωνει ολα γιατι ειναι μεσα σε for
        }

        System.out.println();
        int i = 0;
        System.out.println(s.substring(i,i+2)); //εκτυπωνει οσες θεσεις ζητησουμε πλυν την τελευται που...
        //ζηταμε
    }


}