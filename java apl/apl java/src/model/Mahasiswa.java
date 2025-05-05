package model;

public class Mahasiswa<T> extends Person {
    private T nim;

    public Mahasiswa(String name, T nim) {
        super(name);
        this.nim = nim;
    }

    @Override
    public void display() {
        System.out.println("Nama: " + name + ", NIM: " + nim);
    }
}
