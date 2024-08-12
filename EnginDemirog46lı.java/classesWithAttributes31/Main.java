package classesWithAttributes31;

//import javax.sound.sampled.Port;

//SOLID->verimli yazılımın 5 kuralı
//single responsibilty principle:tek sorumluluk prensibi->bir class/metot vs sadece bir iş yapar(hem attribute tutup hem method içermemeli vs.)
public class Main {
    
    public static void main(String[] args) {
        //Product product = new Product();    //biz product'ı newlediğimiz zaman (Product'taki metodu çağırıyor gibi çalışacak ve yazdıracak)
        //Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");   //bunsuz yapmak istersek de aşağıdakileri kullanacağız ama bu sefer de overloading oluyor.
      
        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.description="Asus Laptop";
        product.price=5000;
        product.stockAmount=3;
        product.renk=" "; 
        //BUNLAR YERINE PRODUCT'TAKİ CONSTRUCTOR'U kullanmak için yukarıdaki gibi yazdık

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getDescription());

        //System.out.println(product.name);

        /*productManager.Add2(1, null, null, 0, 0);
        productManager.Add2(1, null, null, 0, 0);
        productManager.Add2(1, null, null, 0, 0);
        **ProductManager'da yazdığım ekranlar bunlar. Eğer ki PM'de ben yeni bir özellik eklersem bunların hepsi hata vericek.
        Eski kullanımda Product'da String renk; şeklinde tanımlayıp Main'de de product.renk=" "; şeklinde tanımlarsak sistem sorun çıkarmazdı.*/

    }
}
//herhangi bir lanı kullanmak için kısıtlamayı öngören bir yöntemdir.
