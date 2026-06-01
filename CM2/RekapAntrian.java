package CM2;

public class RekapAntrian {

    int jamAntri;
    int jumlah;
    RekapAntrian prev;
    RekapAntrian next;

    RekapAntrian(int jamAntri) {
        this.jamAntri = jamAntri;
        this.jumlah = 1;
        this.prev = null;
        this.next = null;
    }
}
// class RekapAntrian untuk menyimpan data rekap antrian per jam, dengan atribut jamAntri untuk menyimpan jam antrian dan jumlah untuk menyimpan  pembeli yang mengantri pada jam tersebut.   