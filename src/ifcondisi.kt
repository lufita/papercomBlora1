fun main(args: Array<String>) {
    /*
    * Conditional Operator
    * ==
    * !=
    * <=
    * >=
    * <
    * >
    * Yang hanya bisa di pake selain angka itu == sama !=
    * */
    var a = 1;
    var b = 2;
    var c = "Aku"
    var d = "Dia"
    // output berupa boolean yaitu true dan false
    println(a==b)
    println(a!=b)
    println(a<b)
    println(c==d)
    /// if Conditional
    println("=== >> IF CONDITIONAL << ===")
    println("Apakah nilai $a >= $b ?")
    if(a>=b){
        println("Benar")
    }else{
        println("Salah")
    }
    println("======================")
    /*
    * Logical Operation
    * && dua & untuk DAN
    * || bukan L i l tapi || untuk ATAU
    * ! untuk tidak NOT
    * */

    var ab = 10
    var bc = 9
    var cd = 8

    //&& intinya keduanya harus benar
    if ((ab > bc) && (bc < ab)) {
        println("Ya")
    } else if (cd != ab && bc != cd){
        print(" Ya benar")
    }else{
        println("Tidak")
    }

    //|| atau salah satu harus benar
    //salah         benar
    if ((ab == bc) || (bc < ab)) {
        println("benar")
    } else {
        println("Salah")
    }
}