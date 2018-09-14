import org.junit.Test;

import static org.junit.Assert.*;

public class FirstDayTest {

    @Test
    public void testSolutionIfSumNull(){
        FirstDay firstDay = new FirstDay();

        int[] solutions = new int[]{10, 15, 3, 7};

        assertEquals(0,firstDay.solution(solutions,0));
    }

    @Test
    public void testSolutionIfArrayNull(){
        FirstDay firstDay = new FirstDay();

        int[] solutions = new int[]{};
        assertEquals(0,firstDay.solution(solutions,0));
    }

    @Test
    public void testSolution(){
        FirstDay firstDay = new FirstDay();

        int[] solutions = new int[]{10, 15, 3, 7};
        assertEquals(1,firstDay.solution(solutions,17));
    }
}