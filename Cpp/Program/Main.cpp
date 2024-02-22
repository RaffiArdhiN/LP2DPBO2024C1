#include <iostream>
#include <iomanip>
#include <vector>
#include "Product.cpp"
#include "Clothing.cpp"
#include "Shirt.cpp"

using namespace std;

// Fungsi untuk menghitung panjang maksimum dan menampilkan data anggota
void displayShirtList(const vector<Shirt>& shirtList) {
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
    for (const Shirt& currentShirt : shirtList) {
        maxIdLength = max(maxIdLength, static_cast<int>(currentShirt.getIdProduct().length()));
        maxNameLength = max(maxNameLength, static_cast<int>(currentShirt.getName().length()));
        maxBrandLength = max(maxBrandLength, static_cast<int>(currentShirt.getBrand().length()));
        maxPriceLength = max(maxPriceLength, static_cast<int>(currentShirt.getPrice().length()));
        maxSizeLength = max(maxSizeLength, static_cast<int>(currentShirt.getSize().length()));
        maxMaterialLength = max(maxMaterialLength, static_cast<int>(currentShirt.getMaterial().length()));
        maxGenderLength = max(maxGenderLength, static_cast<int>(currentShirt.getGender().length()));
        maxColorLength = max(maxColorLength, static_cast<int>(currentShirt.getColor().length()));
        maxSleeveLength = max(maxSleeveLength, static_cast<int>(currentShirt.getSleeve().length()));
    }

    int total = maxIdLength + maxNameLength + maxBrandLength + maxPriceLength + maxSizeLength +
                maxMaterialLength + maxGenderLength + maxColorLength + maxSleeveLength;

    // Menampilkan data anggota dengan lebar kolom yang sesuai
    if (!shirtList.empty()) {
        for (int i = 0; i < total + 18 + 9 + 18 + 3; i++) {
            cout << "-";
        }
        cout << endl;

        for (size_t i = 0; i < shirtList.size(); i++) {
            const Shirt& current = shirtList[i];
            cout << i + 1 << " | " << setw(maxIdLength + 2) << current.getIdProduct() << " | "
                 << setw(maxNameLength + 2) << current.getName() << " | "
                 << setw(maxBrandLength + 2) << current.getBrand() << " | "
                 << setw(maxPriceLength + 2) << current.getPrice() << " | "
                 << setw(maxSizeLength + 2) << current.getSize() << " | "
                 << setw(maxMaterialLength + 2) << current.getMaterial() << " | "
                 << setw(maxGenderLength + 2) << current.getGender() << " | "
                 << setw(maxColorLength + 2) << current.getColor() << " | "
                 << setw(maxSleeveLength + 2) << current.getSleeve() << " |" << endl;
        }

        for (int i = 0; i < total + 18 + 9 + 18 + 3; i++) {
            cout << "-";
        }
        cout << endl;
    }
}

int main() {
    // Deklarasi variabel
    int pilihan;
    string inIdProduct, inName, inBrand, inPrice, inSize, inMaterial, inGender, inColor, inSleeve;
    vector<Shirt> shirtList;

    // Membuat objek cucu secara statis
    Shirt shirt1;
    shirt1.setIdProduct("1231");
    shirt1.setName("Kaos_Harimau");
    shirt1.setBrand("Levi's");
    shirt1.setPrice("400000");
    shirt1.setSize("M");
    shirt1.setMaterial("Cotton");
    shirt1.setGender("Male");
    shirt1.setColor("Blue");
    shirt1.setSleeve("Short");

    Shirt shirt2;
    shirt2.setIdProduct("1232");
    shirt2.setName("Jaket_Bomber_Ganjar");
    shirt2.setBrand("Denim");
    shirt2.setPrice("3000000000");
    shirt2.setSize("L");
    shirt2.setMaterial("Polyester");
    shirt2.setGender("Male");
    shirt2.setColor("Red");
    shirt2.setSleeve("Long");

    Shirt shirt3;
    shirt3.setIdProduct("1233");
    shirt3.setName("Kaos_Minimalis");
    shirt3.setBrand("3second");
    shirt3.setPrice("1000");
    shirt3.setSize("S");
    shirt3.setMaterial("Spandex");
    shirt3.setGender("Male");
    shirt3.setColor("Green");
    shirt3.setSleeve("Short");

    // Menambahkan objek-objek ke dalam vektor
    shirtList.push_back(shirt1);
    shirtList.push_back(shirt2);
    shirtList.push_back(shirt3);
    displayShirtList(shirtList);

    // Melakukan loop selama pilihan pengguna tidak sama dengan 2
    do {
        cout << "---------------------------" << endl;
        cout << "Pilih opsi dibawah ini:" << endl;
        cout << "Tambah data (input 1)" << endl;
        cout << "Keluar dari aplikasi (input 2)" << endl;
        cout << "---------------------------" << endl;
        
        // Membaca input dari pengguna
        cin >> pilihan;

        // Switch case untuk menangani pilihan pengguna
        switch (pilihan) {
            case 1:
                // Input dari pengguna
                cout << "Enter Shirt details:" << endl;
                cout << "ID Product: ";
                cin >> inIdProduct;
                shirt.setIdProduct(inIdProduct);

                cout << "Name: ";
                cin >> inName;
                shirt.setName(inName);

                cout << "Brand: ";
                cin >> inBrand;
                shirt.setBrand(inBrand);

                cout << "Price: ";
                cin >> inPrice;
                shirt.setPrice(inPrice);

                cout << "Size: ";
                cin >> inSize;
                shirt.setSize(inSize);

                cout << "Material: ";
                cin >> inMaterial;
                shirt.setMaterial(inMaterial);

                cout << "Gender: ";
                cin >> inGender;
                shirt.setGender(inGender);

                cout << "Color: ";
                cin >> inColor;
                shirt.setColor(inColor);

                cout << "Sleeve: ";
                cin >> inSleeve;
                shirt.setSleeve(inSleeve);

                // Menambahkan objek Shirt ke dalam vektor
                shirtList.push_back(shirt);
                break;
            case 2:
                break;
        }

        displayShirtList(shirtList);

    } while (pilihan != 2&&pilihan == 1);

    // Menampilkan pesan penutup program
    cout << "---------------------------" << endl;
    cout << "Sampai jumpa lagi XD" << endl;
    cout << "---------------------------" << endl;

    return 0;
}
