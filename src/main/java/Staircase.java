public class Staircase {
    public void solustion(int number){
        for(int i = 0; i< number; i++){
            for(int j = 1; j <= number; j++){
                if(j < number-i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
