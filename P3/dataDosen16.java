package P3;

public class dataDosen16 {

    public static void datasemuadosen(dosen16[] arrayofdosen) {
        for (dosen16 dsn : arrayofdosen) {
            dsn.tampilDosen();
        }
    }

    public static void jumlahDosenperjeniskelamin(dosen16[] arrayofdosen) {
        int pria = 0;
        int wanita = 0;
        for (dosen16 dsn : arrayofdosen) {
            if (dsn.jenisKelamin == true) {
                pria++;
            } else
                wanita++;

        }
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(dosen16[] arrayofdosen) {
        int pria = 0;
        int wanita = 0;
        int totalPria = 0, totalWanita = 0;

        for (dosen16 dsn : arrayofdosen) {
            if (dsn.jenisKelamin == true) {
                totalPria += dsn.usia;
                pria++;
            } else
                totalWanita += dsn.usia;
            wanita++;
        }
        System.out.println("Rata Rata Dosen Pria: " + (totalPria / pria));
        System.out.println("Rata Rata Dosen Wanita: " + (totalWanita / wanita));
    }

    public static void infoDosenPalingTua(dosen16[] arrayofdosen){
    dosen16 tertua= arrayofdosen [0];

    for (dosen16 dsn : arrayofdosen) {
        if (dsn.usia>tertua.usia){
            tertua=dsn;
        }
    }
    System.out.println("-DATA DOSEN TERTUA-");
    tertua.tampilDosen();
    }
     public static void infoDosenPalingMuda(dosen16[] arrayofdosen){
    dosen16 termuda= arrayofdosen [0];

    for (dosen16 dsn : arrayofdosen) {
        if (dsn.usia<termuda.usia){
            termuda=dsn;
        }
    }
    System.out.println("-DATA DOSEN TERMUDA-");
    termuda.tampilDosen();
    }
}
