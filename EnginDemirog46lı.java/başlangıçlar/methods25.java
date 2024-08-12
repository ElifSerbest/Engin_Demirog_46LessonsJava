package başlangıçlar;
public class methods25 { 
    public static void main(String[] args) { //args: arguments'den geliyor. 
        String mesaj = "Hava çokzel";
        //String yeniMesaj = sehirVer();
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);

        int sayi = topla(1651,564);
        System.out.println("düz parametreli toplam = " + sayi);

        int toplam = topla2(2,3,4,5,10,11); //burada ne gönderildiği belli olmadığı için (şu an int ile çalışıyoruz ama yarın nesne gönderildiğinde) test edilebilirliği zayıflıyor bu tip yapıların, koleksiyonları kullanmak daha nesnel davranmak daha mantıklı. 
        System.out.println("parametreli variable arguments'li toplam = "+toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
        return; //bitir, metodu devam ettirme.
    }
    
    public static int topla(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }  

    public static int topla2(int... sayilar){   //1+ integer göndereceksek int'in sonuna ... koyarız -> bu variabla arguments'die 
        int toplam = 0;
        for(int sayi:sayilar){
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }

}
