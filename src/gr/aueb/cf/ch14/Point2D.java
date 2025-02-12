package gr.aueb.cf.ch14;

public class Point2D extends Point {
    private double y;

    public Point2D () {
        // super();     // Ως 1η εντολη καλει τον default constractor της superclass,και τιποτα να μην γραψουμε παλι υπαρχει
        // y = 0;
    }


    public Point2D(double x, double y) {
        super(x); //Καλεί τον overloaded constructor της Point(superclass) οπου ειχαμε γραψει το x
        // setX(x); //αλλιως ετσι.
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }
    // Liskov substitution principle: Πρεπει οπως ειναι στην superclass να ειναι και εδω(Public,protect, etc...)
    // θα μπορουμε απο protected πχ που εχουμε την movePlusOne να την καναμε public αλλα οχι private, ας το αφησουμε ετσι πως ειναι καλυτερα
    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

//    @Override
//    public String toString() {
//        return "Point2D{" +
//                "y=" + y +
//                '}';
//    }

        @Override
    public String pointToString() {
        return super.pointToString() + "(" + y + ")";
    }
}
