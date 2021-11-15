import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert. assertNotNull;

public class StudentTest {

    @Before
    public void setUp() {
        Student rhiannon = new Student(9, "Rhiannon");
        assertNotNull(rhiannon);
    }


    @Test
    public void testName() {
        Student rhiannon = new Student(9, "Rhiannon");

        String expected = "Rhiannon";
        String actual = rhiannon.getName();

        assertEquals(expected, actual);

    }

    @Test
    public void testId() {
        Student rhiannon = new Student(9, "Rhiannon");

        assertEquals(9, rhiannon.getId());
    }




}
