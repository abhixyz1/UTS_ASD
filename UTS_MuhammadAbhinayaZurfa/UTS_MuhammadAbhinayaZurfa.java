package UTS_MuhammadAbhinayaZurfa;

/**
 * @author
 * 20_Muhammad Abhinaya Zurfa
 * SIB1C
 */

public class UTS_MuhammadAbhinayaZurfa {
    String kodeISBN, judulBuku, pengarang;
    int stok;

    UTS_MuhammadAbhinayaZurfa(String kodeISBN, String judulBuku, String pengarang, int stok) {
        this.kodeISBN = kodeISBN;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    void tampil() {
        System.out.println("=====================================");
        System.out.println("Kode ISBN\t: " + kodeISBN);
        System.out.println("Judul Buku\t: " + judulBuku);
        System.out.println("Pengarang\t: " + pengarang);
        System.out.println("Stok\t\t: " + stok);
    }
}

