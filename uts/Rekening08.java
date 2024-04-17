public class Rekening08
{
    String noRekening, nama, namaIbu, phone, email;

    public Rekening08(String noRekening, String nama, String namaIbu, String phone, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.email = email;
    }
    public Rekening08(){}
    
    Rekening08 data[] = new Rekening08[1000];
    int idx;

    // Transaksi08 transaksi08 = new Transaksi08();

    void tambah(Rekening08 d) {
        if (idx < data.length) {
            data[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    Rekening08[] getData(){
        return data;
    }

    void tampilAll() {
        System.out.println();
        System.out.println("Data Rekening");
        System.out.println();
        System.out.println("No Rekening \t Nama \t Nama Ibu \t Phone \t Email");
        for (Rekening08 d : data) {
            if(d != null){
                System.out.println(d.noRekening+"\t"+d.nama+"\t"+d.namaIbu+"\t"+d.phone+"\t"+d.email);
            }
        }
        System.out.println();
    }

    Transaksi08[] sortByName(Transaksi08 dataTra[]) {
        for (int i = 0; i < idx - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (data[j].nama.compareTo(data[minIdx].nama) < 0) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                Rekening08 temp = data[i];
                data[i] = data[minIdx];
                data[minIdx] = temp;
               
                Transaksi08 tempTra = dataTra[i];
                dataTra[i] = dataTra[minIdx];
                dataTra[minIdx] = tempTra;
            }
        }
        
        return dataTra;
    }

}