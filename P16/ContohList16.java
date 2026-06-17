package P16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList16 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.push("Mei-mei");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));

        names.add("Dewi");
        names.remove(0);

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));

        List<String> names2 = new LinkedList<>();
        names2.add("Noureen");
        names2.add("Akhleema");
        names2.add("Shannum");
        names2.add("Uwais");
        names2.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names2.get(0), names2.size(), names2.get(names2.size() - 1));

        names.set(0, "My kid");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));

        System.out.println("Names: " + names.toString());
    }
}