package job4j.area;
/**
 * Area triangle
 *
 * @author Vitaly Berstenev (mailto: sm_plus82@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     *Area triangle
     *@return result
     */
    public double area() {
        double s = 0;
        double a1 = a.oneSize(a.getX(), b.getX(), a.getY(), b.getY());
        double b1 = b.oneSize(b.getX(), c.getX(), b.getY(), c.getY());
        double c1 = c.oneSize(c.getX(), a.getX(), c.getY(), a.getY());
        if (a1 + b1 <= c1 || a1 + c1 <= b1 || b1 + c1 <= a1){
            System.out.println("Triangle no");
        }else{
            double p = (a1 + b1 + c1) / 2;
            s = Math.sqrt(p * (p - a1) * (p - b1) * (p - c1));}
        return s;
    }
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(1.5, 3);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        System.out.println(result);
    }
    public static class Point {
        private double x;
        private double y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return this.x;
        }
        public double getY() {
            return this.y;
        }
        /**
         *size side
        * @ Param x coordinate of the first point
          * @ Param y coordinate of the first point
          * @ Param x1 coordinate of the second point
          * @ Param y1 coordinate of the second point
         *@return result
         */
        public double oneSize(double x, double x1, double y, double y1) {
            double resultOneSize = Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
            return resultOneSize;
        }
    }
}