package staticDemo;

public class ProductManager {
    public void add(Product product){ //bu metodumuza bir product verdik o da bunu Veri Erişim Katmanına(VT'na) göndersin.
    
    //ProductValidator validator = new ProductValidator(); //'ı çağıralım

    if(ProductValidator.isValid(product)){
        System.out.println("Eklendi");
    }else{
        System.out.println("Ürün bilgileri geçersizdir");
    }

    //System.out.println("Eklendi"); //ben direkt burada VT kodunun çalıştığını varsayıyorum.
    
    /*ProductValidator productValidator = new ProductValidator();
    productValidator.bisey();  //kısaca statikler direkt class ismiyle çağırılır ve çağırıldığı anda da bellekte oluşturulur.*/

/*2*/   ProductValidator productValidator = new ProductValidator();
        productValidator.bisey();


    }
    //genelde araç amacı ile kullanacağımız yapılarda staticlerden yararlanıyoruz. daha çok utility'lerde filan kullanabiliyoruz.*/
}
//static tanımlamadığımızda. new dediğimizde onun bir örneği oluşuyordu ve o örnek bizim işimiz bittiğinde bellekten atılıyordu.
//static tanımladığımızda. uyg sıfırlanana kadar bellekten atılmıyor.
//ilk çağıran kullanıcı nesneyi oluşturuyor. diğer bütün kullanıcılar aynı nesneyi kullanır static yaptığımız zaman. 
//o yüzden bu tip manager sınıfları static yapılmaz ama yardımcı araçlar (utility,kullan bırak) static yapılabiliyor.
//bir metodu static yaptığımızda direkt çağırılır.