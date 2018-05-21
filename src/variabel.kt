fun main(args: Array<String>) {
    //macam" variabel itu ada String, Int, Char, Float, Double, Boolean dll
    /* tanda ? digunakan u/ membuat variabel kosong
    * perbedaan String dengan Char
    *  String menggunakan tanda " kalau char hanya ' */


    var nama: String?
    nama = "Lufita"
    println(nama)
    println("Nama saya adalah "+nama)
    println("Namaku : $nama")
    println("==================")

    var huruf: Char? // char hanya bisa digunakan untuk satu huruf / karakter
    huruf='A'
    println(huruf)
    println("saya duduk di kursi : $huruf")
    println("==================")

    var angka: Int? // int digunakan u/ bilangan bulat
    angka=15
    println("Umur saya adalah $angka")
    println("==================")

    var angka2: Float? // float digunakan untuk bilangan desimal
    angka2= 52.5f // belkang angka harus dikasih huruf f karna jika tidak dikasih maka tidak bisa
    println("Berat badn saya : $angka2")
    println("==================")

    var angka3: Double? // double sama seperti float tapi tanda tambahan huruf
    angka3=163.4
    println("Tinggi badanku : $angka3")
    println("==================")

    //boolean itu ada 2, true 1 sama false 0
    var aku = true
    var akus:Boolean?
    akus = false
    println("Apakah aku $aku atau $akus")
    println("==================")

    println("=== mengimputan data")
    print("Coment : ")
    var input= readLine()

    println("$input")



}