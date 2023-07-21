package PBO1;

// Inheritance
public class SepatuLari extends Sepatu {
    private String jenisLari;

    //  Method Constructor
    public SepatuLari(String merk, int ukuran, double harga, String jenisLari ) {
        super(merk, ukuran, harga);
        this.jenisLari = jenisLari;
    }

    public String getJenisLari() {
        return jenisLari;
    }
    
    // Polymorphism (Overriding)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sepatu ini dipakai untuk  = "+ jenisLari);
    }
}
