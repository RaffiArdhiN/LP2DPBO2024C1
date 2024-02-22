from Shirt import Shirt

def display_shirt_list(shirt_list):
    # Inisialisasi variabel untuk panjang maksimum setiap kolom
    max_id_length = 0
    max_name_length = 0
    max_brand_length = 0
    max_price_length = 0
    max_size_length = 0
    max_material_length = 0
    max_gender_length = 0
    max_color_length = 0
    max_sleeve_length = 0

    # Menghitung panjang maksimum untuk setiap kolom
    for current_shirt in shirt_list:
        max_id_length = max(max_id_length, len(current_shirt.getIdProduct()))
        max_name_length = max(max_name_length, len(current_shirt.getName()))
        max_brand_length = max(max_brand_length, len(current_shirt.getBrand()))
        max_price_length = max(max_price_length, len(current_shirt.getPrice()))
        max_size_length = max(max_size_length, len(current_shirt.getSize()))
        max_material_length = max(max_material_length, len(current_shirt.getMaterial()))
        max_gender_length = max(max_gender_length, len(current_shirt.getGender()))
        max_color_length = max(max_color_length, len(current_shirt.getColor()))
        max_sleeve_length = max(max_sleeve_length, len(current_shirt.getSleeve()))

    total = max_id_length + max_name_length + max_brand_length + max_price_length + max_size_length + \
            max_material_length + max_gender_length + max_color_length + max_sleeve_length

    # Menampilkan data anggota dengan lebar kolom yang sesuai
    if shirt_list:
        for _ in range(total + 18 + 9 + 18 + 3):
            print("-", end="")
        print()

        for i, current in enumerate(shirt_list, start=1):
            print(f"{i} | {current.getIdProduct():<{max_id_length + 2}} | "
                  f"{current.getName():<{max_name_length + 2}} | "
                  f"{current.getBrand():<{max_brand_length + 2}} | "
                  f"{current.getPrice():<{max_price_length + 2}} | "
                  f"{current.getSize():<{max_size_length + 2}} | "
                  f"{current.getMaterial():<{max_material_length + 2}} | "
                  f"{current.getGender():<{max_gender_length + 2}} | "
                  f"{current.getColor():<{max_color_length + 2}} | "
                  f"{current.getSleeve():<{max_sleeve_length + 2}} |")
        for _ in range(total + 18 + 9 + 18 + 3):
            print("-", end="")
        print()

def main():

    pilihan = 0
    inIdProduct = ""
    inName = ""
    inBrand = ""
    inPrice = ""
    inSize = ""
    inMaterial = ""
    inGender = ""
    inColor = ""
    inSleeve = ""
    shirtList = [Shirt(),Shirt(),Shirt()]
    
    shirtList[0].setIdProduct("1231")
    shirtList[0].setName("Kaos_Harimau")
    shirtList[0].setBrand("Levi's")
    shirtList[0].setPrice("400000")
    shirtList[0].setSize("M")
    shirtList[0].setMaterial("Cotton")
    shirtList[0].setGender("Male")
    shirtList[0].setColor("Blue")
    shirtList[0].setSleeve("Short")
    
    shirtList[1].setIdProduct("1232")
    shirtList[1].setName("Jaket_Bomber_Ganjar")
    shirtList[1].setBrand("Denim")
    shirtList[1].setPrice("3000000000")
    shirtList[1].setSize("L")
    shirtList[1].setMaterial("Polyester")
    shirtList[1].setGender("Male")
    shirtList[1].setColor("Red")
    shirtList[1].setSleeve("Long")
    
    shirtList[2].setIdProduct("1233")
    shirtList[2].setName("Kaos_Minimalis")
    shirtList[2].setBrand("3second")
    shirtList[2].setPrice("1000")
    shirtList[2].setSize("S")
    shirtList[2].setMaterial("Spandex")
    shirtList[2].setGender("Male")
    shirtList[2].setColor("Green")
    shirtList[2].setSleeve("Short")
    display_shirt_list(shirtList)

    # Melakukan loop selama pilihan pengguna tidak sama dengan 2
    while pilihan != 2:
        print("---------------------------")
        print("Pilih opsi dibawah ini:")
        print("Tambah data (input 1)")
        print("Keluar dari aplikasi (input 2)")
        print("---------------------------")

        pilihan = int(input())

        if pilihan == 1:
            inIdProduct = input("ID Product: ")
            inName = input("Name: ")
            inBrand = input("Brand: ")
            inPrice = input("Price: ")
            inSize = input("Size: ")
            inMaterial = input("Material: ")
            inGender = input("Gender: ")
            inColor = input("Color: ")
            inSleeve = input("Sleeve: ")

            shirt4 = Shirt()
            shirt4.setIdProduct(inIdProduct)
            shirt4.setName(inName)
            shirt4.setBrand(inBrand)
            shirt4.setPrice(inPrice)
            shirt4.setSize(inSize)
            shirt4.setMaterial(inMaterial)
            shirt4.setGender(inGender)
            shirt4.setColor(inColor)  # Tambahkan warna yang diinginkan
            shirt4.setSleeve(inSleeve)
                # id_product=inIdProduct,
                # name=inName,
                # brand=inBrand,
                # price=inPrice,
                # size=inSize,
                # material=inMaterial,
                # gender=inGender,
                # color=inColor,
                # sleeve_type=inSleeve
            
            shirtList.append(shirt4)

        display_shirt_list(shirtList)
        
    # Menampilkan pesan penutup program
    print("---------------------------")
    print("Sampai jumpa lagi XD")
    print("---------------------------")
    
# Memanggil fungsi main jika file ini dijalankan sebagai program utama
if __name__ == "__main__":
    main()