package gr.aueb.cf.ch14.immutable;

/**
 * αυτη η λογικη λεγεται defensive copying
 */
public class Point3D {
    private final Point point;
    private final int z;

    public Point3D() {
        point = new Point(); // δημιουργουμε ενα point
        z = 0; // default τιμη και να μην το διναμε θα ηταν οκει
    }

    public Point3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

//    public Point getPoint() {
//        return new Point(point.getX(), point.getY());
//    }
    

    public int getZ() {
        return z;
    }
}
