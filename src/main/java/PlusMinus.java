public class PlusMinus {
    static void solution(int[] arr){
        int negative = 0;
        int zeros = 0;
        int positive = 0;
        int length = arr.length;

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] < 0){
                negative+=1;
            }else if(arr[i] == 0){
                zeros+=1;
            }else if(arr[i] > 0){
                positive+=1;
            }
        }

        System.out.println((double)positive/length);
        System.out.println((double)negative/length);
        System.out.println((double)zeros/length);
    }
}
