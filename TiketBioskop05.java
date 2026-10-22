import java.util.Scanner;

public class TiketBioskop05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int jumlah;
        int harga_Tiket = 5000;
        int diskon;
        int harga;
        int total_Harga;
        int total_Diskon;


        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai) : ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Jumlah tidak valid!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }
            harga = jumlah * harga_Tiket;

            if (jumlah > 10) {
                diskon = 15;
            } else if (jumlah > 4) {
                diskon =10;
            } else {
                diskon = 0;
            }
            total_Diskon = harga * diskon / 100;
            total_Harga = harga - total_Diskon;

            System.out.println("Harga sebelum diskon    : Rp. " + harga);
            System.out.println("Total diskon harga      : Rp. " + total_Diskon);
            System.out.println("Harga setelah diskon    : Rp. " + total_Harga);
            System.out.println("Total tiket terjual     : " + jumlah + " Tiket");
            System.out.println("Total harga tiket       : Rp. " + total_Harga);
        } while (true);
        System.out.println("Transaksi selesai.");
    
    }
}
