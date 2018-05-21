fun main(args: Array<String>) {
    println("\n========== NILAI MAKS YANG DIINCREMENT =============")
    val angka1 = 12
    val angka2 = 22
    val angka3 = 33
    var max:Int?
    max=0
    if(angka1>angka2){
        if(angka1>angka3)
            max =angka1
        else
            max=angka3

    }else{
        if(angka2>angka3)
            max=angka2
        else
            max=angka3
    }
    println("Angka 1 = 12")
    println("Angka 2 = 22")
    println("Angka 3 = 33")
    print("Nilai maks diincrement : ")
    println(++max)
}