/*Saya Raffi Ardhi Naufal NIM 2202495 mengerjakan Latihan Praktikum 1 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    // Fungsi untuk menghitung panjang maksimum dan menampilkan data anggota
    private static void displayShirtList(ArrayList<Shirt> shirtList) {
        // Inisialisasi variabel untuk panjang maksimum setiap kolom
        int maxIdLength = 0;
        int maxNameLength = 0;
        int maxBrandLength = 0;
        int maxPriceLength = 0;
        int maxSizeLength = 0;
        int maxMaterialLength = 0;
        int maxGenderLength = 0;
        int maxColorLength = 0;
        int maxSleeveLength = 0;

        // Menghitung panjang maksimum untuk setiap kolom
        for (Shirt currentShirt : shirtList) {
            maxIdLength = Math.max(maxIdLength, currentShirt.getIdProduct().length());
            maxNameLength = Math.max(maxNameLength, currentShirt.getName().length());
            maxBrandLength = Math.max(maxBrandLength, currentShirt.getBrand().length());
            maxPriceLength = Math.max(maxPriceLength, currentShirt.getPrice().length());
            maxSizeLength = Math.max(maxSizeLength, currentShirt.getSize().length());
            maxMaterialLength = Math.max(maxMaterialLength, currentShirt.getMaterial().length());
            maxGenderLength = Math.max(maxGenderLength, currentShirt.getGender().length());
            maxColorLength = Math.max(maxColorLength, currentShirt.getColor().length());
            maxSleeveLength = Math.max(maxSleeveLength, currentShirt.getSleeve().length());
        }

        int total = maxIdLength + maxNameLength + maxBrandLength + maxPriceLength + maxSizeLength +
                    maxMaterialLength + maxGenderLength + maxColorLength + maxSleeveLength;

        // Menampilkan data anggota dengan lebar kolom yang sesuai
        if (shirtList.size() != 0) {
            for (int i = 0; i < total + 18 + 9 + 18 + 3; i++) {
                System.out.printf("-");
            }
            System.out.println("");

            for (int i = 0; i < shirtList.size(); i++) {
                Shirt current = shirtList.get(i);
                System.out.printf("%s | %-"+(maxIdLength + 2)+"s | %-"+(maxNameLength + 2)+"s | %-"+(maxBrandLength + 2)+"s | %-"+(maxPriceLength + 2)+"s | %-"+ (maxSizeLength + 2)+"s | %-"+(maxMaterialLength + 2)+"s | %-"+(maxGenderLength + 2)+"s | %-"+(maxColorLength + 2)+"s | %-"+(maxSleeveLength + 2)+"s |%n", (i + 1), current.getIdProduct(), current.getName(), current.getBrand(), current.getPrice(), current.getSize(), current.getMaterial(), current.getGender(), current.getColor(), current.getSleeve());
            }

            for (int i = 0; i < total + 18 + 9 + 18 + 3; i++) {
                System.out.printf("-");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        // Deklarasi variabel
        int i, n = 0, pilihan;
        String idProduct, name, brand, price, size, material, gender, color, sleeve_type;
        ArrayList<Shirt> shirtList = new ArrayList<>();

        // Membuat objek cucu secara statis
        Shirt shirt1 = new Shirt();
        shirt1.setIdProduct("1231");
        shirt1.setName("Kaos Harimau");
        shirt1.setBrand("Levi's");
        shirt1.setPrice("400000");
        shirt1.setSize("M");
        shirt1.setMaterial("Cotton");
        shirt1.setGender("Male");
        shirt1.setColor("Blue");
        shirt1.setSleeve("Short");

        Shirt shirt2 = new Shirt();
        shirt2.setIdProduct("1232");
        shirt2.setName("Jaket Bomber Ganjar");
        shirt2.setBrand("Denim");
        shirt2.setPrice("3000000000");
        shirt2.setSize("L");
        shirt2.setMaterial("Polyester");
        shirt2.setGender("Male");
        shirt2.setColor("Red");
        shirt2.setSleeve("Long");

        Shirt shirt3 = new Shirt();
        shirt3.setIdProduct("1233");
        shirt3.setName("Kaos Minimalis");
        shirt3.setBrand("3second");
        shirt3.setPrice("1000");
        shirt3.setSize("S");
        shirt3.setMaterial("Spandex");
        shirt3.setGender("Male");
        shirt3.setColor("Green");
        shirt3.setSleeve("Short");

        // Menambahkan objek-objek ke dalam ArrayList
        shirtList.add(shirt1);
        shirtList.add(shirt2);
        shirtList.add(shirt3);
        displayShirtList(shirtList);

        // Melakukan loop selama pilihan pengguna tidak sama dengan 4
        do {
            System.out.println("---------------------------");
            System.out.println("Pilih opsi dibawah ini:");
            System.out.println("Tambah data (input 1)");
            System.out.println("Keluar dari aplikasi (input 2)");
            System.out.println("---------------------------");
            // Scanner digunakan untuk membaca input dari pengguna
            Scanner scanner = new Scanner(System.in);
            pilihan = scanner.nextInt();
            scanner.nextLine();

            // Switch case untuk menangani pilihan pengguna
            switch (pilihan) {
                case 1:
                    // Input dari pengguna
                    System.out.println("Enter Shirt details:");
                    System.out.print("ID Product: ");
                    String idProductInput = scanner.nextLine();
                    System.out.print("Name: ");
                    String nameInput = scanner.nextLine();
                    System.out.print("Brand: ");
                    String brandInput = scanner.nextLine();
                    System.out.print("Price: ");
                    String priceInput = scanner.nextLine();
                    System.out.print("Size: ");
                    String sizeInput = scanner.nextLine();
                    System.out.print("Material: ");
                    String materialInput = scanner.nextLine();
                    System.out.print("Gender: ");
                    String genderInput = scanner.nextLine();
                    System.out.print("Color: ");
                    String colorInput = scanner.nextLine();
                    System.out.print("Sleeve: ");
                    String sleeveInput = scanner.nextLine();

                    // Membuat objek Shirt dan menambahkannya ke dalam ArrayList
                    Shirt shirt = new Shirt();
                    shirt.setIdProduct(idProductInput);
                    shirt.setName(nameInput);
                    shirt.setBrand(brandInput);
                    shirt.setPrice(priceInput);
                    shirt.setSize(sizeInput);
                    shirt.setMaterial(materialInput);
                    shirt.setGender(genderInput);
                    shirt.setColor(colorInput);
                    shirt.setSleeve(sleeveInput);
                    shirtList.add(shirt);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih kembali.");
            }

            displayShirtList(shirtList);

        } while (pilihan != 2);

        // Menampilkan pesan penutup program
        System.out.println("---------------------------");
        System.out.println("Sampai jumpa lagi XD");
        System.out.println("---------------------------");
    }
}