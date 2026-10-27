import java.util.Scanner;

public class Parkir05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, jam, total = 0;

        while (true) {
            System.out.print("Jenis kendaraan (1 mobil, 2 motor, 0 selesai): ");
            jenis = sc.nextInt();

            if (jenis == 0) break;
            if (jenis != 1 && jenis != 2) continue;

            System.out.print("Lama parkir (jam): ");
            jam = sc.nextInt();

            if (jam < 0) continue;

            if (jenis == 1) {
                total += jam * 3000;
            } else {
                total += jam * 2000;
            }
        }
   
        System.out.println("Total parkir: Rp" + total);
        sc.close();
    }
}
