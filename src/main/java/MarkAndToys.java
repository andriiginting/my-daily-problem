import java.util.Arrays;

public class MarkAndToys {
    static int maximumToys(int[] prices, int k) {
        int count = 0;
        int temp = 0;
        Arrays.sort(prices);
        for (int price : prices) {
            temp += price;
            if (temp > k) {
                break;
            }
            count++;
        }

        return count;
    }
}
