package P16;
import java.util.ArrayList;
import java.util.Arrays;
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

  
    int linearSearch(String nim) { 
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) { 
                return i; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        ListMahasiswa16 lm = new ListMahasiswa16(); 

        Mahasiswa16 m = new Mahasiswa16("201234", "Noureen", "021xx1"); 
        Mahasiswa16 m1 = new Mahasiswa16("201235", "Akhleema", "021xx2"); 
        Mahasiswa16 m2 = new Mahasiswa16("201236", "Shannum", "021xx3"); 

        lm.tambah(m, m1, m2); 
        lm.tampil(); 
        int indexCari = lm.linearSearch("201235"); 
        lm.update(indexCari, new Mahasiswa16("201235", "Akhleema Lela", "021xx2")); 

        System.out.println("");
        lm.tampil(); 
    }
} 

