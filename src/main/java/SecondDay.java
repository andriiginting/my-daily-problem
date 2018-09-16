public class SecondDay {
    public boolean solution(int[] arr,int length, int sum){

        if (sum == 0) return true;

        if (length == 0 && sum != 0 ) return false;

        if (arr[length-1] > sum){
            return solution(arr,length-1,sum);
        }
        return solution(arr,length-1,sum) || solution(arr,length,sum-arr[length-1]);
    }

    public boolean pairedValue(int[] arr, int k){
        int count = 0;

        for (int i = 0; i<k; i++){
            count += arr[i];
        }

        if (count%2 != 0){
            return false;
        }
        return solution(arr,k,count/2);
    }
}
