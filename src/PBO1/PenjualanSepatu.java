package PBO1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PenjualanSepatu {
    public static void main(String[] args) {
        
        // IO Sederhana
        Scanner input = new Scanner(System.in);
        
        // Array
        Sepatu [] daftarSepatu = new Sepatu[2];
        
        // Perulangan
        for (int i = 0; i < daftarSepatu.length; i++) {
            System.out.println("Data Sepatu  " + ( i + 1));
            System.out.print("Merk = ");
            String merk = input.next();
            
            int ukuran = 0;
            boolean ukuranValid = false;
            while (!ukuranValid) {
                
                // Error Handling
                try {
                    System.out.print("Ukuran  = ");
                    ukuran = input.nextInt();
                    if  (ukuran <= 10 ) {
                        throw new IllegalArgumentException("Ukuran sepatu harus lebih dari o. ");
                    }
                    ukuranValid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Masukkan ukuran sepatu dalam bentuk angka. ");
                    input.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    input.nextLine();
                }
            }
            
            double harga = 0;
            boolean hargaValid = false;
            while (!hargaValid) {
                try {
                    System.out.print("Harga  = ");
                    harga = input.nextDouble();
                    if (harga  <= 0) {
                        throw new IllegalArgumentException("Harga sepatu harus lebih dari 50000.");
                    }
                    hargaValid = true;
                    
                } catch (InputMismatchException e) {
                    System.out.println("Masukkan harga sepatu dalam bentuk angka.");
                    input.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    input.nextLine();
            }
        }
        
            System.out.print("Apakah sepatu ini untuk lari? (ya/tidak): ");
            String jenisLari = input.next();
            
            // Seleksi
            if  (jenisLari.equalsIgnoreCase("ya")) {
                System.out.print("Jenis Lari   (Sprint / Marathon)  = ");
                jenisLari = input.next();
                
                // Object
                daftarSepatu[i] = new SepatuLari(merk, ukuran, harga, jenisLari);
            } else {
                daftarSepatu[i] = new Sepatu(merk, ukuran, harga);
            }
        }
            
            System.out.println("\nDaftar Sepatu:");
            for (Sepatu sepatu : daftarSepatu) {
                  sepatu.displayInfo();
                  System.out.println();
            }
            
            input.close();
    }
}
