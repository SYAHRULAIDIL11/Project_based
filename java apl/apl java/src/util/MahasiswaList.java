package util;

import model.Mahasiswa;
import java.util.ArrayList;

public class MahasiswaList {
    private ArrayList<Mahasiswa<?>> list = new ArrayList<>();

    public void tambah(Mahasiswa<?> mhs) {
        list.add(mhs);
    }

    public void tampilkanSemua() {
        for (Mahasiswa<?> m : list) {
            m.display();
        }
    }
}
