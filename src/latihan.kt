fun main(args: Array<String>) {
    println("======== MENGGUNAKAN  READLINE ========")

    print("input angka : ")
    val n1 = readLine() !!.toInt()
    print("input angka 2 : ")
    val n2 = readLine() !!.toInt()
    print("input angka 3 : ")
    val n3 = readLine() !!.toInt()
    if(n1>n2){
        if(n1>n3)
            print("Angka maks adalah $n1")
        else
            print("Angka maks adalah $n3")
    }else{if(n2>n3)
        print("Angka maks adalah $n2")
    else
        print("Angka maks adalah $n3")}

    println("\n========== TANPA READLINE =============")
    val angka1 = 12
    val angka2 = 22
    val angka3 = 33
    val max = if(angka1>angka2){
        if(angka1>angka3)
            angka1
        else
            angka3

    }else{
        if(angka2>angka3)
            angka2
        else
            angka3
    }
    println("Nilai Maksimal adalah $max")
}