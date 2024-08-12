package başlangıçlar;
public class methods24 {
    //DRGY: kendini tekrar etme prensibi önemlidir!!
    //kodlarımızı basit,kısa ve sadece bir işi yapabilecek şekilde tasarlamalıyız.
        //uygulamanın herhangi bir yerlerinde birçok kez alışveriş sepetine eklemek gibi
        //müşteri takip sisteminde müşteriyi listelemek takip etmek vs. yani biz kodu bir yerde  kullanıp lazım oldukça çağırırız.
        //fonksiyon yazarak kendimizi tekrarlamayı engelledik.
    public static void main(String[] args){
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[] {1,2,3,4,5,7,0};
        int aranacak=7;
        boolean varMi=false;

        for(int sayi : sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }

        
        String mesaj=""; 
        if(varMi){
            mesaj = "Sayı mevcuttur: "+aranacak;
            mesajVer(mesaj);
        }else{
            mesajVer("Sayı mevcut değildir: "+aranacak);
        }

        
        /*if(varMi){
            //System.out.println("Sayı mevcuttur.");
            mesajVer(aranacak);
        }else{
            System.out.println("Sayı mevcut değildir.");
        }*/
    }

        /*public static void mesajVer(int aranacak){
            System.out.println("Sayı Mevcuttur: "+aranacak);
        }*/
        
        //YUKARIDAKİNE ALTERNATİF OLARAK


        public static void mesajVer(String mesaj){
            System.out.println(mesaj);
        }

}
