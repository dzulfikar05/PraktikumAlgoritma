public class Mahasiswa08 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa08() {
    }

    public Mahasiswa08(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim +", nama=" + nama + ", notelp=" + notelp + "}";
    }

}
