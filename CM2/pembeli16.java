package CM2;

public class pembeli16 {
    int no_antrian;
    String nama;
    String noHp;
    pembeli16 prev;
    pembeli16 next;


    public pembeli16(int no_antrian, String nama, String noHp) {
        this.no_antrian = no_antrian;
        this.nama = nama;
        this.noHp = noHp;
        this.prev = null;
        this.next = null;
    }
}
