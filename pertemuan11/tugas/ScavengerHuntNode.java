package tugas;

public class ScavengerHuntNode {
    String soal, kunci;
    ScavengerHuntNode next;

    ScavengerHuntNode() {}

    ScavengerHuntNode(String soal, String kunci, ScavengerHuntNode next) {
        this.soal = soal;
        this.kunci = kunci;
        this.next = next;
    }
}
