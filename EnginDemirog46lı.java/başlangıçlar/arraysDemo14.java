package başlangıçlar;
public class arraysDemo14 {
    public static void main(String[] args){
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("--------------------");

        //dizinin boyutunu belirledik burada
        String[] ogrenciler = new String[3];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[3]="Salih";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        //dizinin boyutunu belirlediğimiz yere [2]; yazsaydık
        // .ArrayIndexOutOfBoundsException-> sınır aşma hatası verecekti!!

        for(String oggyy:ogrenciler){
            //ogrenciler dizisindeki her bir elemanı gez demek-> o anki elemana da takma isim taktık (ooggy)
            System.out.println(oggyy);
        }
        //reverse engineering~~
        //best practise:doğrulama yöntemleri


    }
}
