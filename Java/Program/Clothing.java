// Kelas Clothing merupakan turunan dari kelas Product, 
// artinya Clothing akan memiliki semua atribut dan metode yang dimiliki oleh kelas Product.
class Clothing extends Product {

    // Atribut untuk menyimpan ukuran pakaian.
    private String size;

    // Atribut untuk menyimpan bahan dari pakaian.
    private String material;

    // Atribut untuk menyimpan jenis kelamin yang menjadi target pakaian.
    private String gender;

    // Konstruktor kosong untuk kelas Clothing.
    Clothing() {
        // Konstruktor ini tidak melakukan apa-apa pada saat objek Clothing dibuat.
    }

    // Metode untuk mengatur nilai ukuran pakaian.
    public void setSize(String size) {
        this.size = size;
    }

    // Metode untuk mendapatkan nilai ukuran pakaian.
    public String getSize() {
        return this.size; 
    }

    // Metode untuk mengatur nilai bahan pakaian.
    public void setMaterial(String material) {
        this.material = material;
    }

    // Metode untuk mendapatkan nilai bahan pakaian.
    public String getMaterial() {
        return this.material; 
    }

    // Metode untuk mengatur nilai jenis kelamin yang menjadi target pakaian.
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Metode untuk mendapatkan nilai jenis kelamin yang menjadi target pakaian.
    public String getGender() {
        return this.gender; 
    }

}