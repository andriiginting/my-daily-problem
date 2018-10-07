import java.util.HashSet;

public class Odd {
    public int solution(int[] A){
        int count = 0;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0;i<A.length;i++){
            if (hashSet.add(A[i])){
                count = A[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 9, 3, 9, 3, 9, 7, 9 };

        Odd odd = new Odd();

        System.out.println(odd.solution(arr));
    }
}
