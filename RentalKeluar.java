public class RentalKeluar extends RentalSewa {
    int harga;
    int lama_sewa;
    String nama_ps;

    @Override
    double getMoney(){
        return lama_sewa*harga;
    };

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama_ps() {
        return nama_ps;
    }

    public void setNama_ps(String nama_ps) {
        this.nama_ps = nama_ps;
    }

    public int getLama_sewa() {
        return lama_sewa;
    }

    public void setLama_sewa(int lama_sewa) {
        this.lama_sewa = lama_sewa;
    }


}
