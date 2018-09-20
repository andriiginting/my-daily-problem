public class PlusMinus {
    public void solution(int[] arr){
        int negative = 0;
        int zeros = 0;
        int positive = 0;
        int length = arr.length;

        for (int anArr : arr) {
            if (anArr < 0) {
                negative += 1;
            } else if (anArr == 0) {
                zeros += 1;
            } else {
                positive += 1;
            }
        }

        System.out.println((double)positive/length);
        System.out.println((double)negative/length);
        System.out.println((double)zeros/length);
    }
}
