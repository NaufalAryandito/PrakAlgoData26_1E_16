package P16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMahasiswa16 {
    List<Mahasiswa16> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa16... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa16 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int binarySearch(String nim) {

        sortAscending();

        Mahasiswa16 key = new Mahasiswa16(nim, "", "");

        return Collections.binarySearch(mahasiswas, key, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortAscending() {
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortDescending() {
        mahasiswas.sort((m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa16 lm = new ListMahasiswa16();

        Mahasiswa16 m = new Mahasiswa16("201234", "Noureen", "021xx1");
        Mahasiswa16 m1 = new Mahasiswa16("201235", "Akhleema", "021xx2");
        Mahasiswa16 m2 = new Mahasiswa16("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();
        int indexCari = lm.binarySearch("201235");

        if (indexCari >= 0) {
            lm.update(indexCari, new Mahasiswa16("201235", "Akhleema Lela", "021xx2"));
        }
        System.out.println("\n--- Diurutkan Secara Descending (NIM Terbesar) ---");
        lm.sortDescending();
        lm.tampil();
        System.out.println("\n--- Setelah Data Di-update ---");
        lm.tampil();

        System.out.println("");
        lm.tampil();
    }
}
