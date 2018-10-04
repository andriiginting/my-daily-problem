import java.util.Scanner;
public class PenjumlahanPecahan {
    private String solution(int A, int B, int C, int D){
        int E = (A*D) + (B*C);
        int F = B*D;
        return E+" "+F;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PenjumlahanPecahan pecahan = new PenjumlahanPecahan();

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        System.out.println(pecahan.solution(A,B,C,D));
    }
}
