import java.util.Arrays;

public class ArrayBerputar {
    public boolean solution(int[] arr){
        int[] arrCopy = Arrays.copyOf(arr,arr.length);
        int numberDiff = 0;
        Arrays.sort(arrCopy);

        for (int i = 0; i <arr.length ; i++){
            if (arrCopy[i] != arr[i]){
                numberDiff++;
            }
        }

        return numberDiff <= 2;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,3,3,7};
        int[] secondArr = new int[]{1,3,5,3,4};

        ArrayBerputar arrayBerputar = new ArrayBerputar();

        System.out.println(arrayBerputar.solution(arr));
        System.out.println(arrayBerputar.solution(secondArr));
    }
}
