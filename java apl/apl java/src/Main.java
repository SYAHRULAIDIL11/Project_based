import model.Mahasiswa;
import util.MahasiswaList;

public class Main {
    public static void main(String[] args) {
        MahasiswaList data = new MahasiswaList();
        data.tambah(new Mahasiswa<>("Dina", "1102023"));
        data.tambah(new Mahasiswa<>("Fajar", "1102034"));
        data.tambah(new Mahasiswa<>("Rina", "1102045"));

        data.tampilkanSemua();
    }
}
