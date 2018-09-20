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

    //Rizqi Aryansa
    public void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                positive++;
            } else if(arr[i] < 0) {
                negative++;
            } else if(arr[i] == 0) {
                zeros++;
            }
        }

        System.out.println((double) positive/arr.length);
        System.out.println((double) negative/arr.length);
        System.out.println((double) zeros/arr.length);
    }
}
