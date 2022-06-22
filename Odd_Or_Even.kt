import java.util.Scanner

fun main(args: Array<String>) {
    val girdi = Scanner(System.`in`)
    while(true){
        println("Sayı giriniz:")

        val sayi = girdi.nextInt()

        val sonuc = sayi % 2

        if(sonuc == 0){
            println("Girilen sayı çift sayıdır.")
        }
        if(sonuc == 1){
            println("Girilen sayı tek sayıdır.")
        }

        println("Çıkmak için (1) - Devam etmek için farklı bir sayı giriniz.")

        val exit = girdi.nextInt()

        if(exit == 1 ){
            println("Çıkış yapıldı.")
            break
        }
    }
}