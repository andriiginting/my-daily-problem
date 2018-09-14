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
        int[] solutions2 = new int[]{10, 5, 5, 9, 0, 10, 2, 10, 1, 5};
        assertEquals(1,firstDay.solution(solutions,17));
        assertEquals(9,firstDay.solution(solutions2,15));
    }
}