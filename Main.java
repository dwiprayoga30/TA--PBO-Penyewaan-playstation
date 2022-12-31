import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        // Membuat Scanner untuk class Petugas
        Petugas pgs = new Petugas();
        Scanner Petugas = new Scanner(System.in);
        // Tampilkan output ke user
        System.out.println(" ### PETUGAS RENTAL PS ### ");
        System.out.println(" Nama Petugas : ");
        pgs.nama_petugas = Petugas.nextLine();
        // Tampilkan output lagi
        System.out.println(" No Hp : ");
        pgs.no_hp = Petugas.nextLine();
        System.out.println(" Alamat : ");
        pgs.alamat = Petugas.nextLine();

        // Membuat Scanner untuk class Penyewa
        Penyewa in = new Penyewa();
        Scanner Penyewa = new Scanner(System.in);
        System.out.println(" ### PENDATAAN PENYEWA ### ");
        System.out.println(" Nama Penyewa : ");
        in.nama_penyewa = Penyewa.nextLine();
        System.out.println(" No Hp : ");
        in.no_hp = Penyewa.nextLine();
        System.out.println(" Alamat : ");
        in.alamat = Penyewa.nextLine();

        //Rental Keluar
        System.out.println(" ### DATA HARGA ###");
        RentalSewa byr= new RentalKeluar();
        RentalKeluar bayar = new RentalKeluar();
        Scanner RentalKeluar = new Scanner(System.in);
        byr.Jenis_PS();
        System.out.println(" Pilih jenis PS yang ingin anda Sewa : ");
        ((RentalKeluar) byr).nama_ps= (String) RentalKeluar.nextLine();
        System.out.print("Masukkan Harga PS yg ingin anda sewa : ");
        //menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        ((RentalKeluar) byr).harga= (int) RentalKeluar.nextDouble();
        System.out.println("Masukkan berapa hari annda mau menyawa : ");
        ((RentalKeluar) byr).lama_sewa= (int) RentalKeluar.nextDouble();

        // Menampilkan data yang sudah di inputkan
        System.out.println("---------------------------");
        System.out.println(" Nama Petugas : " +pgs.getNama_petugas());
        System.out.println(" No Hp : " +pgs.getNo_hp());
        System.out.println(" Alamat : "+pgs.getAlamat());
        System.out.println("--------------------------");
        System.out.println(" Nama Penyewa : " +in.getNama_penyewa());
        System.out.println(" No Hp : " +in.getNo_hp());
        System.out.println(" Alamat : " +in.getAlamat());
        // Menampilkan Output untuk menghitung total
        System.out.println("--------------------");
        System.out.println("Harga : " + ((RentalKeluar) byr).getHarga());
        System.out.println("Lama Sewa : "+ ((RentalKeluar) byr).getLama_sewa());
        System.out.println("total  : "+ ((RentalKeluar) byr).getMoney());

        java.io.File file = new java.io.File("output.txt");
        try{
            java.io.PrintWriter output = new  java.io.PrintWriter(file);

            output.println("============Data Sewa PS=============");
            output.println("Nama Penyewa : " +in.getNama_penyewa());
            output.println("Alamat : " +in.getAlamat());
            output.println("No Hp: " +in.getNo_hp());
            output.println("--------------------");
            output.println("total bayar untuk Sewa PS");
            output.println("Harga  : " + ((RentalKeluar) byr).getHarga());
            output.println("Lama Sewa/hari : "+ ((RentalKeluar) byr).getLama_sewa());
            output.println("total : "+ byr.getMoney());
            output.close();
        }   catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}