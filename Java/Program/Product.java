// Kelas Product merupakan kelas dasar yang digunakan sebagai landasan untuk kelas turunan seperti Clothing.
class Product {

    // Atribut untuk menyimpan ID produk.
    private String idProduct;

    // Atribut untuk menyimpan nama produk.
    private String name;

    // Atribut untuk menyimpan merek produk.
    private String brand;

    // Atribut untuk menyimpan harga produk.
    private String price;

    // Konstruktor kosong untuk kelas Product.
    Product() {
        // Konstruktor ini tidak melakukan apa-apa pada saat objek Product dibuat.
    }

    // Metode untuk mengatur nilai ID produk.
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    // Metode untuk mendapatkan nilai ID produk.
    public String getIdProduct() {
        return this.idProduct; 
    }

    // Metode untuk mengatur nilai nama produk.
    public void setName(String name) {
        this.name = name;
    }

    // Metode untuk mendapatkan nilai nama produk.
    public String getName() {
        return this.name; 
    }

    // Metode untuk mengatur nilai merek produk.
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Metode untuk mendapatkan nilai merek produk.
    public String getBrand() {
        return this.brand; 
    }

    // Metode untuk mengatur nilai harga produk.
    public void setPrice(String price) {
        this.price = price;
    }

    // Metode untuk mendapatkan nilai harga produk.
    public String getPrice() {
        return this.price; 
    }

}