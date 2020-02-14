import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitLecture {
    public static void main(String[] args) {

    }

    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        //Delta required when working with floating points. Specifies positive margin of error of decimals.
        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;
        assertNotSame(sheep, dog);
        assertSame(sheep, clonedSheep);
    }
}
