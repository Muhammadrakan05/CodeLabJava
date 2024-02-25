import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nama: ");
        String nama = scanner.nextLine();


        String jenisKelamin;
        System.out.print("Jenis Kelamin (L/P): ");
        String jenisKelaminInput = scanner.nextLine().toUpperCase();
        if (jenisKelaminInput.equals("L")) {
            jenisKelamin = "Laki-laki";
        } else if (jenisKelaminInput.equals("P")) {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Jenis Kelamin tidak valid";
        }


        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirStr = scanner.nextLine();
        String[] parts = tanggalLahirStr.split("-");
        int tahunLahir = Integer.parseInt(parts[0]);
        int bulanLahir = Integer.parseInt(parts[1]);
        int tanggalLahir = Integer.parseInt(parts[2]);


        LocalDate now = LocalDate.now();
        int tahunSekarang = now.getYear();
        int bulanSekarang = now.getMonthValue();
        int tanggalSekarang = now.getDayOfMonth();

        int umurTahun = tahunSekarang - tahunLahir;
        int umurBulan = bulanSekarang - bulanLahir;
        int umurHari = tanggalSekarang - tanggalLahir;

        if (umurBulan < 0 || (umurBulan == 0 && umurHari < 0)) {
            umurTahun--;
        }


        System.out.println("\nData Diri Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur Anda: " + umurTahun + " tahun " + umurBulan + " bulan");
    }
}