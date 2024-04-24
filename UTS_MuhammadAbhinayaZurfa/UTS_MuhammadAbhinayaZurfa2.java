package UTS_MuhammadAbhinayaZurfa;

/**
 * @author
 * 20_Muhammad Abhinaya Zurfa
 * SIB1C
 */

import java.util.Scanner;

public class UTS_MuhammadAbhinayaZurfa2 {
    UTS_MuhammadAbhinayaZurfa listBuku[] = new UTS_MuhammadAbhinayaZurfa[10000];
    int idx;

    void inputBuku(String kodeISBN, String judulBuku, int stok, String pengarang) {
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] == null) {
                listBuku[i] = new UTS_MuhammadAbhinayaZurfa(kodeISBN, judulBuku, pengarang, stok);
                break;
            }
        }
    }

    void peminjamanBuku(Scanner sc) {
        System.out.println("Peminjaman Buku");
        System.out.print("Masukkan kode ISBN buku yang dipinjam\t: ");
        String kodeISBN = sc.next();
        System.out.print("Jumlah Buku yang dipinjam\t\t: ");
        int jumlah = sc.nextInt();

        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] != null) {
                if (listBuku[i].kodeISBN.equals(kodeISBN)) {
                    if (listBuku[i].stok >= jumlah) {
                        listBuku[i].stok -= jumlah;
                        break;
                    } else {
                        System.out.println("Stok tidak mencukupi");
                    }
                }
            }
        }
    }

    void urutkanBuku() {
        for (int i = 0; i < listBuku.length - 1; i++) {
            for (int j = 0; j < listBuku.length - i - 1; j++) {
                if (listBuku[j] != null && listBuku[j + 1] != null) {
                    if (listBuku[j].stok > listBuku[j + 1].stok) {
                        UTS_MuhammadAbhinayaZurfa temp = listBuku[j];
                        listBuku[j] = listBuku[j + 1];
                        listBuku[j + 1] = temp;
                    }
                }
            }
        }
    }

    void cariBuku(String kodeISBN) {
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] != null) {
                if (listBuku[i].kodeISBN.equals(kodeISBN)) {
                    listBuku[i].tampil();
                    break;
                }
            }
        }
    }

    void tampilkanBuku() {
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] != null) {
                listBuku[i].tampil();
            }
        }
    }

    void cekBuku() {
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] != null) {
                if (listBuku[i].stok == 0) {
                    System.out.println("Buku " + listBuku[i].judulBuku + " habis");
                }
            }
        }
    }
}
