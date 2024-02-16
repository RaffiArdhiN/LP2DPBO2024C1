// Kelas Shirt merupakan turunan dari kelas Clothing, yang pada gilirannya merupakan turunan dari kelas Product.
class Shirt extends Clothing {

    // Atribut untuk menyimpan warna.
    private String color;

    // Atribut untuk menyimpan jenis lengan.
    private String sleeve_type;

    // Konstruktor kosong untuk kelas Shirt.
    Shirt() {
        // Konstruktor ini tidak melakukan apa-apa pada saat objek Shirt dibuat.
    }

    // Metode untuk mengatur nilai warna.
    public void setColor(String color) {
        this.color = color;
    }

    // Metode untuk mendapatkan nilai warna.
    public String getColor() {
        return this.color; 
    }

    // Metode untuk mengatur nilai jenis lengan.
    public void setSleeve(String sleeve_type) {
        this.sleeve_type = sleeve_type;
    }

    // Metode untuk mendapatkan nilai jenis lengan.
    public String getSleeve() {
        return this.sleeve_type; 
    }

}