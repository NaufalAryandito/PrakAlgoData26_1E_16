package P5;

public class Nilai {
     NilaiMahasiswa[] data;

    Nilai(NilaiMahasiswa[] data) {
        this.data = data;
    }

    int maxUTS(int l, int r) {
        if (l == r) return data[l].uts;
        int mid = (l + r) / 2;
        return Math.max(maxUTS(l, mid), maxUTS(mid + 1, r));
    }

    int minUTS(int l, int r) {
        if (l == r) return data[l].uts;
        int mid = (l + r) / 2;
        return Math.min(minUTS(l, mid), minUTS(mid + 1, r));
    }

    double rataUAS() {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i].uas;
        }
        return (double) total / data.length;
    }
}
