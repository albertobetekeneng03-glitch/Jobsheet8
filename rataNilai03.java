import java.util.Scanner;
public class rataNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Nilai N =  ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print("Masukkan Nilai ke-" + i + " = ");
            int nilai = sc.nextInt();
            sum += nilai;
        }
        double rataRata = (double) sum / N;
        System.out.println("Rata-rata Nilai = " + rataRata);
    }
}
