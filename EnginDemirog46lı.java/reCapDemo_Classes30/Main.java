package reCapDemo_Classes30;

public class Main { //class'lar ortak operasyonları tutar.
                    //" özellik tutarlar field ve attribute olarak isimlendirilirler.
    
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();  //bunu kullanacağım zaman bunun bir referansını oluşturmam gerekiyor.
    int sonuc = dortIslem.Topla(3, 4);
    System.out.println(sonuc);
    }
}
