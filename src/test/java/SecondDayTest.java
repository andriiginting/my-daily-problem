import org.junit.Test;

import static org.junit.Assert.*;

public class SecondDayTest {

    @Test
    public void testSolutionIfArrayNull(){
        SecondDay secondDay = new SecondDay();

        int[] solutions = new int[]{0};

        assertTrue(secondDay.solution(solutions));
    }
}