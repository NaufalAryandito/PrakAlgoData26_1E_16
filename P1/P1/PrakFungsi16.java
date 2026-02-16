package P1;

public class PrakFungsi16 {
     public static int hitungpendapatan16(int[] stok, int[] harga) {
        int total12 = 0;
        for (int i = 0; i < stok.length; i++) {
            total12 += stok[i] * harga[i];
        }
        return total12;
    }

    public static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        String[] cabang = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4"
        };

        String[] bunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };

        int[][] stok = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };

        int[] harga = { 75000, 50000, 60000, 10000 };

        System.out.println("pendapatan12 RoyalGarden\n");

        for (int i = 0; i < stok.length; i++) {

            int pendapatan = hitungpendapatan16(stok[i], harga);

            System.out.println(cabang[i]);
            System.out.println("pendapatan : Rp." + pendapatan);
            System.out.println("Status     : " + cekStatus(pendapatan));
            System.out.println("----------------------------");
        }
    }
}

