package ClasslaraGiris;
public class classes27 {
    //nesnel altyapıları öğrenirsek, sürdürülebilir yazılımı öğrenmiş oluruz->java'da nesnel ve nesne tabanlı bir dildir.
    //class'ların gruplama özellikleri vardır. (operasyonları metotları grupluyoruz vs)
    //Manager ->operasyon bazlı işlemlerde kullanılır, katman görevi görür gibi diyebiliriz.

    public static void main(String[] args) {
        //classlar referans tiptir. 
        CustomerManager customerManager = new CustomerManager(); //customerManager türünde bir kullanım yapacağım demek. **
        //customerManager türünde bir nesne ürettik
        CustomerManager customerManager2 = new CustomerManager();

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value
        int[] sayilar1 = new int[]{1,2,3}; //new int'i yazmadan da olur ama bu daha okunaklı
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;    //***sayilar2'nin referans no eşittir sayılar1'in referans no'suna..
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
        //diziler referans tip olduğu için ***
        //bellekte 1 nesne var, 2 değişken aynı nesneyi tutyor.
    }

}

//**bu şekilde tanımlama yapınca bellekte bunu tanımlamış oluyoruz.
//bellekte 2 alan var biri Stack biri Heap'tir. 
//eşitliğin sol tarafı cm'yi tanımladığımız yer -> Stack EĞER SAĞ TARAFINI SİLERSEK~~
//~~"vARİABLE 'CUSTOMERmANAGER' MİGHT NOT HAVE BEEN initialized" : CM başlatılmamış/örneği oluşturulmamış olabilir.
//demek ki, bir class'ı kullanabilmek için onuın new'lenmiş olması gerekiyor
//new kısmını ekleyince Heap'ta {}'ler içinde bir CM nesnesi oluşuyor
//bunları yaparken CM Stack'de 101 diye bir referans numarası alıyor. bu ne işe yarıyor?
//elimizde 2 tane nesne var bellekte ayrı ayrı duruyorlar..
//customerManager = customerManager2; -> yaparsak 101 olan ref 102 olur CM'inki olur.
//GarbageCollector:çöpçü,çöp toplayıcısı, java'nın bellek yöneticisidir. -> kullanılmayanları bellek'ten siler mesela 101'i
//bellekte bir nesneyi new'lemek pahalıdır.

