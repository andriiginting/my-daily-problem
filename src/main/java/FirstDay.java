public class FirstDay {
    public int solution(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == k) {
                    count++;
                }
            }
        }
        System.out.println("result -> "+count);
        return count;
    }
}
