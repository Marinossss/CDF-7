package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); //ξεκινα να ψαχνεις το πρωτο o
        int positionOfSecondo = cf.indexOf("o", 2);//ξεκινα να ψαχνεις το ο απο την 2ηθεση κ μετα.
        int lastPositionOfOfo = cf.lastIndexOf("o"); //ψαχνει το τελευταιο ο

        System.out.println("Index of first 'o': " + positionOfo); // Θα εκτυπώσει: 1
        System.out.println("Index of second 'o': " + positionOfSecondo); // Θα εκτυπώσει: 10
        System.out.println("Index of last 'o': " + lastPositionOfOfo); // Θα εκτυπώσει: 10


        String cf2 = cf.substring(1); //"oding Factory"
        String slice = cf.substring(1,3);// θα επιστρεψει od
        System.out.println(cf.substring(1));
        System.out.println(cf.substring(1,3)); // Η τρίτη θέση (endIndex) δεν περιλαμβάνεται στο αποτέλεσμα
    }
}
