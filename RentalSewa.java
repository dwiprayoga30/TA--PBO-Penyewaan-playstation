public abstract class RentalSewa implements PS{
    public int Biaya(int harga, int lama_sewa) {
        return 0;
    }
    @Override
    public void Jenis_PS(){
        System.out.println(" 1. PS 3, 30000/hari");
        System.out.println(" 2. PS 4, 60000/hari");
        System.out.println(" 3. PS 5, 80000/hari");
    }
    abstract double getMoney();
}
