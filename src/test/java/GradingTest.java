import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradingTest {

    @Test
    public void solutionArray() {
        Grading gr = new Grading();

        int[] inputExample = new int[]{73, 67, 38, 33};
        int[] outputExpect = new int[]{75, 67, 40, 33};

        assertArrayEquals(outputExpect, gr.solution(inputExample));
    }
}