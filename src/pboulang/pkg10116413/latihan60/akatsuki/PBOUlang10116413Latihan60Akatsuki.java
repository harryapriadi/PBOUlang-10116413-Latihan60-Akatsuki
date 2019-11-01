/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan60.akatsuki;

/**
 *
 * @author Lenovo
 * NAMA         : HARRY APRIADI
 * KELAS        : PBOULANG
 * NIM          : 10116413
 * DESKRIPSI    : Membuat Program Mengenai Tokoh-Tokoh Akatsuki
 */
public class PBOUlang10116413Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Akatsuki akatsuki = new Akatsuki("Baju Hitam Bercorak Merah",
                "Menangkap Jinchuriki");
        akatsuki.tampilAkatsuki();

        Anggota konan = new Anggota("Konan", "Rambut Berwarna Biru Dan Aksesoris"
                + "Bunga Di Kepala ", "Amegakure", "Tenshi no Fukuin", "Shiro",
                "Jari Tengah", "Pain", "", "");
        konan.tampilAnggota();

        Anggota kisame = new Anggota("Kisame", "Penampilan Seperti Hiu",
                "Kirigakure", "Pedang Samehada", "Minami", "Jari Manis",
                "Uchiha Itachi", "", "");
        kisame.tampilAnggota();

        Anggota zetsu = new Anggota("Zetsu", "Memiliki 2 Warna Wajah Hitam "
                + "dan Putih", "Kusagakure", "Kamui", "Kai", "KelingkingKanan",
                "Tobi/Madara", "", "");
        zetsu.tampilAnggota();

        Anggota deidara = new Anggota("Deidara", "Berambut Pirang Dan Spealis "
                + "Ledakan", "Iwagakure", "C0, C1, C2, C3, C4", "Ao", "Telunjuk "
                + "Kanan", "Sasori", "", "");
        deidara.tampilAnggota();

        Anggota hidan = new Anggota("Hidan", "Membawa Sabit Bermata Tiga",
                "Amegakure", "Immortality", "San", "Telunjuk Kiri",
                "Kakuzu", "", "");
        hidan.tampilAnggota();

        Anggota kakuzu = new Anggota("Kakuzu", "Memakai Penutup Wajah",
                "Takigakure", "Gian, Zokkoku", "Kita", "Jari Tengah",
                "Hidan", "", "");
        kakuzu.tampilAnggota();

        Anggota sasori = new Anggota("Sasori", "Ahli Menggunakan Boneka",
                "Sunagakure", "Kugutsu", "tama", "Jempol Kiri", "Deidara",
                "", "");
        sasori.tampilAnggota();

        Anggota itachi = new Anggota("Itachi", "Memiliki Sharingan",
                "Konohagakure", "Amaterasu, Susano'o", "Shu", "Jari Manis",
                "Kisame", "", "");
        itachi.tampilAnggota();

    }

}
