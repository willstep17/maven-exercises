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


}
