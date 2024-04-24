package UTS_MuhammadAbhinayaZurfa;

/**
 * @author
 * 20_Muhammad Abhinaya Zurfa
 * SIB1C
 */

import java.util.Scanner;

public class UTS_MuhammadAbhinayaZurfa3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UTS_MuhammadAbhinayaZurfa2 buku = new UTS_MuhammadAbhinayaZurfa2();

        System.out.println("=====================================");
        System.out.println("=====   PERPUSTAKAAN ABHINAYA   =====");
        System.out.println("=====================================");

        System.out.println("1. INPUT DATA BUKU\n2. PEMINJAMAN BUKU\n3. URUTKAN DATA BUKU\n4. PENCARIAN BUKU\n5. TAMPILKAN DATA BUKU\n6. CEK BUKU\n7. KELUAR");
        System.out.print("\nPilih Menu : ");
        int pilih = sc.nextInt();

        while (pilih != 7) {
            if (pilih == 1) {
                System.out.print("Masukkan kode ISBN buku\t: ");
                String kodeISBN = sc.next();
                sc.nextLine();
                System.out.print("Masukkan judul buku\t: ");
                String judulBuku = sc.nextLine();
                System.out.print("Masukkan stok buku\t: ");
                int stok = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan pengarang buku\t: ");
                String pengarang = sc.nextLine();
                buku.inputBuku(kodeISBN, judulBuku, stok, pengarang);
            } else if (pilih == 2) {
                buku.peminjamanBuku(sc);
            } else if (pilih == 3) {
                buku.urutkanBuku();
            } else if (pilih == 4) {
                System.out.print("Masukkan kode ISBN buku yang dicari : ");
                String kodeISBN = sc.next();
                buku.cariBuku(kodeISBN);
            } else if (pilih == 5) {
                buku.tampilkanBuku();
            } else if (pilih == 6) {
                buku.cekBuku();
            } else {
                System.out.println("Menu tidak tersedia");
            }

            System.out.println("=====================================");
            System.out.println("1. INPUT DATA BUKU\n2. PEMINJAMAN BUKU\n3. URUTKAN DATA BUKU\n4. PENCARIAN BUKU\n5. TAMPILKAN DATA BUKU\n6. CEK BUKU\n7. KELUAR");
            System.out.print("\nPilih Menu : ");
            pilih = sc.nextInt();
        }
    }
}
