public class SherlockSquare {
    static int squares(int a, int b) {
        int minValue = (int)Math.sqrt(a);
        int maxValue = (int)Math.sqrt(b);

        int count = maxValue - minValue;
        if(Math.pow(minValue,2) >= a){
            count+=1;
        }else{
            count += 0;
        }
        return count;
    }
}
