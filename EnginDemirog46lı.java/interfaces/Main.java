package interfaces; //referans tutucular. kullanılmak için implemente edilmeleri gerekk
//temel classlar abvstracrt classlar interfaceler
//classlar ve abstract classlar birbirine benzer ama interfaceler class olarak kabul edilmiyor
//ama onlar gibi referans tutabiliyorlar.

public class Main {
    public static void main(String[] args) {
        /*ICustomerDal customerDal = new ICustomerDal() {
            //OLMUYOR!! INTERFACELER DE ABSTRACTLAR GİBİ NEW'LENEMEZLER. ÇÜMKÜ İÇLERİ DOLU DEĞİL NE YAPACAKLARINI BİLMİYORLAR.
        };*/

        //ICustomerDal customerDal = new OracleCustomerDal();
            //!!Interface onu implemente eden class'ın referansını tutabilir. (bir polymorphism daha^^)
            //peki bu interface nerede kullanılır? Operasyonun implemente edilmesi istenen durumlarda(o onu ayrıca implemente etsin dediğimiz yerlerde vb. (?!)) /*CPT:ICustomerDal gibi bir interface, farklı veri erişim katmanlarının (örneğin, OracleCustomerDal, SqlServerCustomerDal) belirli bir sözleşmeye uygun şekilde davranmasını sağlayarak, uygulamanın esnekliğini ve genişletilebilirliğini artırır. */
    
        
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal()); //diyerek CM'ı çağırdık.
  /*2*/ //ensonsildik//customerManager.customerDal = new /*MySqlCustomerDal*/ OracleCustomerDal(); //Artık CustomerManager'da ekle,sil,güncelle hepsi Oracle ile çalışacak. yaniVT olarak Oracle seçtik. ->SQL istersek de
  /*2*programcı bu kısmı unutabileceği için CustomerManagerdeki yolu izleyelim.*/      
        customerManager.add();
    
    }
}

//classlarda tüm operasyonların (mesela metotların) dolu/tamamlanmış olması gerekiyrodu.
//abstractlardakimisi dolu kimisi boş olabilirdi.. onu inherite eden içini doldurmak zorundaydı.
//interfacelerde ise abstract metotların içini doldurmayıp imza olarak bıraktığımız onu kim inherite ediyorsa implemente ediyordu(içini dolduruyordu). 
//"" de bunun gibi bir durum söz konusudur. 
//inheritance'de bir class bir class'ı inherite edebiliyordu
//interfaceler implementasyon kabul ediliyor inhertance kabul edilmiyor. bir class 1+ interfaceyi implemente edebiliyor (uyguluyor)

/*
 * Kodlar katmanlardan oluşur:
 * Arayüz kodları: HTML, FXjava, Swing, Android uyg: kullanıcının gördüğü şeylerdir.
 * İş Katmanları: diyelim birine ehliyet verilecek, sınavdan 70 almış mı? Kontrol ediyoruz yani.. //+İŞ KODLARININ YAZILDIĞI YERDİR.
 * Veri Erişim (Data Access): DAL dediğimiz katman.
 * 
 * bu katmanların geçişlerini biz interface'lerle yaparız. -> bağımlılıkları önlemek için.
 * 
 * //interfaceler temel anlamda new'lenmezler ve imza taşırlar.
 * //extend yok implementasyon var^^
 * //bir class 1+ interface'yi implemente edebilir.
 * //ama bir class sadece 1 class'ı extend edebilir.
 * //ya sadece bir class ya da abstract'ı ...
 */