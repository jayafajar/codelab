import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Codelab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminString = (jenisKelamin == 'P' || jenisKelamin == 'p') ? "Perempuan" : "Laki-laki";

        System.out.print("Masukkan tanggal lahir (format: yyyy-MM-dd): ");
        String tanggalLahirStr = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr, formatter);

        LocalDate sekarang = LocalDate.now();
        Period periode = Period.between(tanggalLahir, sekarang);

        int tahun = periode.getYears();
        int bulan = periode.getMonths();
        int hari = periode.getDays();

        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminString);
        System.out.println("Umur: " + tahun + " tahun, " + bulan + " bulan, " + hari + " hari");
    }
}
