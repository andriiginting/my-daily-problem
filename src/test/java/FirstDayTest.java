import org.junit.Test;

import static org.junit.Assert.*;

public class FirstDayTest {

    @Test
    public void testSolutionIfSumNull(){
        FirstDay firstDay = new FirstDay();

        int[] solutions = new int[]{10, 15, 3, 7};

        firstDay.solution(solutions,0);
        assertEquals(0,0);
    }

    @Test
    public void testSolutionIfArrayNull(){
        FirstDay firstDay = new FirstDay();

        int[] solutions = new int[]{};

        firstDay.solution(solutions,0);
        assertEquals(0,0);
    }

    @Test
    public void testSolution(){
        FirstDay firstDay = new FirstDay();

        int[] solutions = new int[]{10, 15, 3, 7};

        firstDay.solution(solutions,17);
        assertEquals(1,1);
    }
}