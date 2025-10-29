
public class Tugas1 {
    public static void main(String[] args) {

        int N = 5;
        for (int iOuter=1 ; iOuter<=N ; iOuter++) {
            for (int i=1 ; i<=N ; i++) {
                if (i >= 2 && i <= N-1 && iOuter >=2 && iOuter <= N-1) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print(" ");
                System.out.print(N);
            }
            System.out.println("");
        }   
    }
}
