package triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest
{

    @org.junit.jupiter.api.Test
    void checkTriangle()
    {
        //Test Equilateral
        Triangle equilateral = new Triangle(1,1,1);
        assertEquals("equilateral", equilateral.checkTriangle());

        //Test Isosceles
        Triangle isosceles1 = new Triangle(2,2,1);
        assertEquals("isosceles", isosceles1.checkTriangle());

        Triangle isosceles2 = new Triangle(3,3,2);
        assertEquals("isosceles", isosceles2.checkTriangle());

        //Test Scalene
        Triangle scalene1 = new Triangle(7, 6, 4);
        assertEquals("scalene", scalene1.checkTriangle());

        Triangle scalene2 = new Triangle(8, 7, 3);
        assertEquals("scalene", scalene2.checkTriangle());


        //Check invalid triangle
        Triangle invalid1 = new Triangle(8, 7, 4443);
        assertEquals("invalid", invalid1.checkTriangle());

        Triangle invalid2 = new Triangle(83232323, 7, 3);
        assertEquals("invalid", invalid2.checkTriangle());
    }

    @Test
    void TestFail()
    {
        //Check Invalid while expecting scalene
        Triangle invalid = new Triangle(833333, 7, 4443);
        assertEquals("scalene", invalid.checkTriangle());

    }
}