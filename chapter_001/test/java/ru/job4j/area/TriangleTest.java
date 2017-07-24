package job4j.area;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;


public class TriangleTest {
    @Test
    public void areaTriangle(){
        Triangle.Point a = new Triangle.Point(0, 0);
        Triangle.Point b = new Triangle.Point(0, 2);
        Triangle.Point c = new Triangle.Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected,0.1));
        /**
         ????????????????????????????????
         */
        
    }

    private void closeTo(double expected, double v) {
    }
}