#include <iostream>
#include <string>
using namespace std;

// Kelas Shirt merupakan anak dari kelas Clothing dan cucu dari kelas Product
class Shirt : public Clothing {
private:

    string color;
    string sleeve_type;

public:
    Shirt() {
        
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
