package interfaces;

    //iş katmanı->iş kodlarının yazıldığı yerdir.
public class CustomerManager {

    //aşağıdaki yapı unutulabilir bir yapı old. için bir de buradan bakalım.
    //çünkü Main/*2*/ o kısım unutulursa program sadece çalışırken hata veriyor.
    

            //ICustomerDal-> interface new'lenemez. new'lense bile içinde sadece void() add; var içi boş böyle de çağıramazdık.
    /*1*/   ICustomerDal customerDal;   //CustomerManager'in customerDal'ı var*1* //+veri erişim nesnesi
    //Gönderdiğim şeyi içeride kullanabilmek için değişkenime atadım.
    /*CustomerManager sınıfının constructor'ında, bir ICustomerDal nesnesi istenir 
     *ve bu nesne customerDal değişkenine atanır. 
     *Bu, sınıfın veri erişim katmanıyla çalışabilmesini sağlar. */
    
/*3*/   public CustomerManager(ICustomerDal customerDal){   //CustomerManager'in Constructor'ında ben bir tane ICustomerDal istiyorum, ya Oracle ya da MySQL olabilir. çünkü ikiside ICDal ile implenmente!   
        this.customerDal = customerDal;     //Constructor ile customerDal atanıyor.
    }

    public void add(){
        //DAL'ın içinde zaten add vardı ama buranın içine iş kodları yazıldığı için yazdık. (burası DAL'ı çağıracak)
        //mesela müşterinin adı doğru girilmiş mi? veriler doğru mu?... bu yüzden business katmanıyla veri erişim katmanı sadece birbirini çağırıyor gibi işte
        /*OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); //bu, sistem sadece oracle'da çalışıyor demek oluyor. bağımlıyız*/
    
    /*1*/    customerDal.add();      //ve biz onun add'ini çağıracağız.*1*



    }
}
