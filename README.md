# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi penjualan sepatu menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merk, ukuran dan harga, dan memberikan output berupa informasi detail dari merk sepatu, ukuran sepatu dan harga sepatu.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Sepatu`, `SepatuLari`, dan `PenjualanSepatu` adalah contoh dari class.

```bash
public class Sepatu {
    ...
}

public class SepatuLari extends Sepatu {
    ...
}

public class PenjualanSepatu {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarSepatu[i] = new SepatuLari(merk, ukuran, harga, jenisLari);` adalah contoh pembuatan object.

```bash
daftarSepatu[i] = new SepatuLari(merk, ukuran, harga, jenisLari);
daftarSepatu[i] = new Sepatu(merk, ukuran, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk`, `ukuran` dan `harga` adalah contoh atribut.

```bash
String merk;
int ukuran;
double harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Sepatu` dan `SepatuLari`.

```bash
public Sepatu(String merk, int ukuran, double harga) {
    this.merk = merk;
    this.ukuran = ukuran;
    this.harga = harga;
}

public SepatuLari(String merk, int ukuran, double harga, String jenisLari ) {
    super(merk, ukuran, harga);
    this.jenisLari = jenisLari;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk`, `setUkuran` dan `setHarga` adalah contoh method mutator.

```bash
public void setMerk(String merk) {
    this.merk = merk;
}

public void setUkuran(int ukuran) {
    this.ukuran = ukuran;
}

public void setHarga(double harga) {
    this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getUkuran`, `getHarga`, dan `getJenisLari` adalah contoh method accessor.

```bash
public String getMerk() {
    return merk;
}

public int getUkuran() {
    return ukuran;
}

public double getHarga() {
    return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private / protected dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk`, `ukuran` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
protected String merk;
protected int ukuran;
protected double harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SepatuLari` mewarisi `Sepatu` dengan sintaks `extends`.

```bash
public class SepatuLari extends Sepatu {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo()` di `Sepatu` merupakan overloading method `displayInfo()` di `SepatuLari` merupakan override dari method `displayInfo()` di `Sepatu`.

```bash
public void displayInfo() {
    ...
}

@Override
public void displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getJenisLari`.

```bash
String jenisLari = input.next();
    if  (jenisLari.equalsIgnoreCase("ya")) {
        System.out.print("Jenis Lari   (Sprint / Marathon)  = ");
            jenisLari = input.next();
            daftarSepatu[i] = new SepatuLari(merk, ukuran, harga, jenisLari);
        } else {
            daftarSepatu[i] = new Sepatu(merk, ukuran, harga);
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarSepatu.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);

System.out.println("Data Sepatu  " + ( i + 1));
System.out.print("Merk = ");
String merk = input.next();

System.out.println("\nDaftar Sepatu:");
for (Sepatu sepatu : daftarSepatu) {
      sepatu.displayInfo();
      System.out.println();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Sepatu [] daftarSepatu = new Sepatu[2];` adalah contoh penggunaan array.

```bash
Sepatu [] daftarSepatu = new Sepatu[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
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
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama  : Renaldi Wijayanto
NPM   : 2110010083
Kelas : 4A NonReg BJM
