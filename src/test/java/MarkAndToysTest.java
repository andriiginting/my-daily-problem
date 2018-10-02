import org.junit.Test;

import static org.junit.Assert.*;

public class MarkAndToysTest {

    @Test
    public void maximumToys() {
        int[] prices = new int[]{1,12,5,111,200,1000,10};

        MarkAndToys markAndToys = new MarkAndToys();

        assertEquals(4,markAndToys.maximumToys(prices,50));
    }
}