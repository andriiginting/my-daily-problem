import org.junit.Test;

import static org.junit.Assert.*;

public class SecondDayTest {

    @Test
    public void testSolution(){
        SecondDay secondDay = new SecondDay();

        int[] firstTest = new int[]{15, 5, 20, 10, 35, 15, 10};
        int[] secondTest = new int[]{15, 5, 20, 10, 35};

        assertTrue(secondDay.pairedValue(firstTest, firstTest.length));
        assertFalse(secondDay.pairedValue(secondTest, secondTest.length));
    }
}