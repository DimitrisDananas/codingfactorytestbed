package gr.aueb.cf.Askisi12;

/**
 * Creates three PointXYZ instances and then
 * calls the class method.
 * {@link PointXYZ}
 *
 * @author DimitrisDananas
 */
public class PointXYZApp {
    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ(0,0,0);
        PointXYZ p2 = new PointXYZ(1,3,5);
        PointXYZ p3 = new PointXYZ(4,6,8);

        getterPoint(p1,p2,p3);
        stringConvert(p1,p2,p3);

        setterPoint(p1, 5,10,12);
        setterPoint(p2,7,9,13);
        setterPoint(p3,3,22,14);

        getterPoint(p1,p2,p3);
        stringConvert(p1,p2,p3);
    }

    /**
     * Prints the current values of the points.
     * @param p1
     *         First point.
     * @param p2
     *         Second point.
     * @param p3
     *         Third point.
     */
    public static void stringConvert(PointXYZ p1, PointXYZ p2, PointXYZ p3){
        System.out.println(p1.convertToString());
        System.out.println(p2.convertToString());
        System.out.println(p3.convertToString());
    }

    /**
     * Gets the current values of the points.
     * @param p1
     *         First Point.
     * @param p2
     *         Second Point.
     * @param p3
     *         Third Point.
     */
    public static void getterPoint(PointXYZ p1, PointXYZ p2, PointXYZ p3){
        System.out.print(p1.getX() + ", ");
        System.out.print(p1.getY() + ", ");
        System.out.print(p1.getZ());
        System.out.println();

        System.out.print(p2.getX() + ", ");
        System.out.print(p2.getY() + ", ");
        System.out.print(p2.getZ());
        System.out.println();

        System.out.print(p3.getX() + ", ");
        System.out.print(p3.getY() + ", ");
        System.out.print(p3.getZ());
        System.out.println();
    }

    /**
     * Sets the value of the Point instances
     * @param p
     *        The point that we want to set.
     * @param x
     *        x axis
     * @param y
     *        y axis
     * @param z
     *        z axis
     */
    public static void setterPoint(PointXYZ p, int x, int y, int z){
        p.setX(x);
        p.setY(y);
        p.setZ(z);
    }
}
