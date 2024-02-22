#include <iostream>
#include <string>
using namespace std;

// Kelas Shirt merupakan turunan dari kelas Clothing.
class Shirt : public Clothing {
private:

    string color;
    string sleeve_type;

public:
    // Konstruktor kosong untuk kelas Shirt.
    Shirt() {
        // Konstruktor ini tidak melakukan apa-apa pada saat objek Shirt dibuat.
    }

    // Metode untuk mengatur nilai warna.
    void setColor(string color) {
        this->color = color;
    }

    // Metode untuk mendapatkan nilai warna.
    string getColor() const {
        return this->color;
    }

    // Metode untuk mengatur nilai jenis lengan.
    void setSleeve(string sleeve_type) {
        this->sleeve_type = sleeve_type;
    }

    // Metode untuk mendapatkan nilai jenis lengan.
    string getSleeve() const {
        return this->sleeve_type;
    }
};