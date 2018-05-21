fun main(args: Array<String>) {
    var bilanganOne = 10
    var bilanganDua = 3

    var hasilBagi: Double?

    var hasil: Int?
    hasil = bilanganOne - bilanganDua

    var hasil2: Int?
    hasil2= bilanganDua * bilanganOne

    var tambah: Int?
    tambah = bilanganDua+bilanganOne

    println("========= Pertambahan")
    println(tambah)
    println("========= Pengurangan ")
    println("Hasil $bilanganOne - $bilanganDua = $hasil")
    println("========= Perkalian ")
    println(" Hasil kali : $hasil2")


    //dia pasti bermasalah karena bilanganOne dan dua itu tipe datanya Int
    //conversi tipe data
    /*
    * toInt() = conversi dari apa ke int
    * toString() = conversi dari apa ke String
    * toFloat() = conversi dari apa ke float
    * toDouble = conversi dari apa ke double
    * */
    //pembagian
    hasilBagi = bilanganOne.toDouble() / bilanganDua.toDouble()
    println("======== Pembagian ==========")
    println(hasilBagi)

    println("Hasil dari $bilanganOne / $bilanganDua = ${bilanganOne.toDouble()/bilanganDua.toDouble()}")
}