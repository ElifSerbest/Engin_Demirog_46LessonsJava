package başlangıçlar;
//import java.util.Random;

public class miniProjeAsalSayi19 {
    public static void main(String[] args) {
        
        /*int number = 9;
        int kendindenKalan= number % number;

        Random randomSayi = new Random();

        int herhangiSayi = randomSayi.nextInt(100);
        int herhangiSayiyaBolumundenKalan = number % herhangiSayi;

        System.out.println("Seçtiğimiz değerimiz= "+number);
        System.out.println("Herhangi bir sayı olarak atanan değer= "+herhangiSayi);
        System.out.println("Herhangi sayıya bölümünden kalan= "+herhangiSayiyaBolumundenKalan);
        System.out.println("Sayının kendine bölümünden kalan= "+kendindenKalan);

        if(number>herhangiSayi){
        if(kendindenKalan==0 && herhangiSayiyaBolumundenKalan != 0){
            System.out.println("Asaldır.");
        }else{
            System.out.println("Asal değil.");
        }
            //SADECE NUMBER'DAN KÜÇÜK ATARSA HERHANGİ SAYIYI O ZAMAN KOD DOĞRU ÇALIŞIYOR..
        }*/

        //kullanıcının önden doğru veri girişini sağlayabilmek için belirlenen kurallara_> defensive programming deniyor.

        int number = 24;
        boolean isPrime=true; //ile yalandan değer verdik true diye..
        
        for(int i=2; i<number; i++){
            if(number % i == 0){
                isPrime =false;
            }   
        }
            if(isPrime==false){
                System.out.println("Asal değildir.");
            }

            if(isPrime){
                System.out.println("Asaldır.");
            }

    }

}
