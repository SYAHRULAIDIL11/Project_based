import java.util.ArrayList;
import java.util.ArrayDeque;

public class array {
    public static void main(String[] args) {
        // Contoh ArrayList
        ArrayList<String> mahasiswa = new ArrayList<>();
        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");

        System.out.println("Isi ArrayList:");
        for (String nama : mahasiswa) {
            System.out.println(nama);
        }

        // Contoh ArrayDeque
        ArrayDeque<String> antrian = new ArrayDeque<>();
        antrian.addLast("Login 1");
        antrian.addLast("Login 2");
        antrian.addLast("Login 3");

        System.out.println("\nIsi Antrian (ArrayDeque):");
        while (!antrian.isEmpty()) {
            System.out.println("Diproses: " + antrian.removeFirst());
        }
    }
}
