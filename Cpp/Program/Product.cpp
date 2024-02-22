#include <iostream>
#include <string>

using namespace std;

class Product {
private:
    string idProduct;
    string name;
    string brand;
    string price;

public:
    Product() {

    }

    // Metode untuk mengatur nilai ID produk.
    void setIdProduct(string idProduct) {
        this->idProduct = idProduct;
    }

    // Metode untuk mendapatkan nilai ID produk.
    std::string getIdProduct() const {
        return this->idProduct;
    }

    // Metode untuk mengatur nilai nama produk.
    void setName(string name) {
        this->name = name;
    }

    // Metode untuk mendapatkan nilai nama produk.
    std::string getName() const {
        return this->name;
    }

    // Metode untuk mengatur nilai merek produk.
    void setBrand(string brand) {
        this->brand = brand;
    }

    // Metode untuk mendapatkan nilai merek produk.
    std::string getBrand() const {
        return this->brand;
    }

    // Metode untuk mengatur nilai harga produk.
    void setPrice(string price) {
        this->price = price;
    }

    // Metode untuk mendapatkan nilai harga produk.
    std::string getPrice() const {
        return this->price;
    }
};
