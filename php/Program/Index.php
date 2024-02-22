<?php

    require_once 'Product.php';
    require_once 'Clothing.php';
    require_once 'Shirt.php';

    // Fungsi untuk mencetak tabel data anggota DPR RI
    function printTable($shirtList) {

        // Membuat tabel untuk data anggota DPR RI 2019/2024
        echo '<table border="0">';
        echo "Data Produk Baju yang Kami Miliki :<br>";
        echo '<tr>';
        echo '<th>No</th>';
        echo '<th>ID</th>';
        echo '<th>Nama</th>';
        echo '<th>Brand</th>';
        echo '<th>Price</th>';
        echo '<th>Size</th>';
        echo '<th>Material</th>';
        echo '<th>Gender</th>';
        echo '<th>Color</th>';
        echo '<th>Sleeve</th>';
        echo '</tr>';

        // Menampilkan data anggota dalam bentuk tabel
        foreach ($shirtList as $index => $current) {
            echo '<tr>';
            echo '<td>' . ($index + 1) . '</td>';
            echo '<td>' . $current->getIdProduct() . '</td>';
            echo '<td>' . $current->getName() . '</td>';
            echo '<td>' . $current->getBrand() . '</td>';
            echo '<td>' . $current->getPrice() . '</td>';
            echo '<td>' . $current->getSize() . '</td>';
            echo '<td>' . $current->getMaterial() . '</td>';
            echo '<td>' . $current->getGender() . '</td>';
            echo '<td>' . $current->getColor() . '</td>';
            echo '<td>' . $current->getSleeve() . '</td>';
            echo '</tr>';
        }
        echo '</table>';
        echo "<br><br>";
    }

    // Deklarasi variabel
    $i = 0;
    $n = 0;
    $idProduct = "";
    $name = "";
    $brand = "";
    $price = "";

    // Membuat list untuk menyimpan objek Shirt
    $shirtList = array();
    $shirt1 = new Shirt();
    $shirt1->setIdProduct("1231");
    $shirt1->setName("Kaos_Harimau");
    $shirt1->setBrand("Levi's");
    $shirt1->setPrice("400000");
    $shirt1->setSize("M");
    $shirt1->setMaterial("Cotton");
    $shirt1->setGender("Male");
    $shirt1->setColor("Blue");
    $shirt1->setSleeve("Short");
    $shirtList[] = $shirt1;
    
    $shirt2 = new Shirt();
    $shirt2->setIdProduct("1232");
    $shirt2->setName("Jaket_Bomber_Ganjar");
    $shirt2->setBrand("Denim");
    $shirt2->setPrice("3000000000");
    $shirt2->setSize("L");
    $shirt2->setMaterial("Polyester");
    $shirt2->setGender("Male");
    $shirt2->setColor("Red");
    $shirt2->setSleeve("Long");
    $shirtList[] = $shirt2;
    
    $shirt3 = new Shirt();
    $shirt3->setIdProduct("1233");
    $shirt3->setName("Kaos_Minimalis");
    $shirt3->setBrand("3second");
    $shirt3->setPrice("1000");
    $shirt3->setSize("S");
    $shirt3->setMaterial("Spandex");
    $shirt3->setGender("Male");
    $shirt3->setSleeve("Short");
    $shirtList[] = $shirt3;

    // Inisialisasi variabel untuk panjang maksimum setiap kolom
    $maxIdLength = 0;
    $maxNameLength = 0;
    $maxBrandLength = 0;
    $maxPriceLength = 0;

    // Menghitung panjang maksimum untuk setiap kolom
    foreach ($shirtList as $shirt) {
        $maxIdLength = max($maxIdLength, strlen($shirt->getIdProduct()));
        $maxNameLength = max($maxNameLength, strlen($shirt->getName()));
        $maxBrandLength = max($maxBrandLength, strlen($shirt->getBrand()));
        $maxPriceLength = max($maxPriceLength, strlen($shirt->getPrice()));
    }

    // Menampilkan tabel awal
    printTable($shirtList);

    $pilihan = 0;
    while($pilihan != 2) {
        switch ($pilihan) {
            case 0:
                // Menambahkan data baru
                $shirt4 = new Shirt();
                $shirt4->setIdProduct("1234");
                $shirt4->setName("Kaos_Batik_Kemeja");
                $shirt4->setBrand("3second");
                $shirt4->setPrice("90000000");
                $shirt4->setSize("XL");
                $shirt4->setMaterial("Spandex");
                $shirt4->setGender("Male");
                $shirt4->setSleeve("Long");
                $shirtList[] = $shirt4;
                echo "<i>Data baru berhasil ditambah :D</i><br>";
                printTable($shirtList);
                break;
            case 1:
                echo "<i>Sampai jumpa lagi :)</i><br>";
                break;
        }
        // Menampilkan tabel setelah perubahan

        $pilihan++;
    } 
    
?>
