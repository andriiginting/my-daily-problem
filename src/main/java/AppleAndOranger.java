public class AppleAndOranger {
    public void countAppleAndOrange(int s, int t, int a, int b, int[] apples, int[] oranges){
        int orangeCount = 0;
        int appleCount = 0;
        for (int apple : apples) {
            if (a + apple >= s && a + apple <= t) {
                appleCount++;
            }
        }

        for (int orange : oranges) {
            if (b + orange >= s && b + orange <= t) {
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
