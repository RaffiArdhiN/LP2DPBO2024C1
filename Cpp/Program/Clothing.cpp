#include <iostream>
#include <string>
using namespace std;

// Kelas Clothing merupakan turunan dari kelas Product.
class Clothing : public Product {
private:
    string size;
    string material;
    string gender;

public:
    // Konstruktor kosong untuk kelas Clothing.
    Clothing() {
        
    }

    // Metode untuk mengatur nilai ukuran pakaian.
    void setSize(string size) {
        this->size = size;
    }

    // Metode untuk mendapatkan nilai ukuran pakaian.
    string getSize() const {
        return this->size;
    }

    // Metode untuk mengatur nilai bahan pakaian.
    void setMaterial(string material) {
        this->material = material;
    }

    // Metode untuk mendapatkan nilai bahan pakaian.
    string getMaterial() const {
        return this->material;
    }

    // Metode untuk mengatur nilai jenis kelamin yang menjadi target pakaian.
    void setGender(string gender) {
        this->gender = gender;
    }

    // Metode untuk mendapatkan nilai jenis kelamin yang menjadi target pakaian.
    string getGender() const {
        return this->gender;
    }
};