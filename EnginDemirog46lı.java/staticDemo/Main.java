package staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product(); //1*hemen bir tane product nesnesi oluşturduk
        product.price=10;
        product.name="";
        
        manager.add(product); //1*dediğimde benden bir product istiyor

        /*DatabaseHelper.Crud.Delete(); //gibi kullanımlar söz konusu
          DatabaseHelper.Connection();*/ 
        /*BEST PRATICES'LER BUNLARI ÖNERMİYOR.
         * BİRBİRİNE BENZEYEN OPERASYONLARINIZI PARÇALAYIN OKE AMA bunu biz DatabaseHelper'ın içine koyduğumuz zaman 
         * SOLID'İN single responsibility problemine sebep oluyor
         * 'tek sorumluluk prensibi' bir class sadece bir iş yapar.
         * yani diyor ki DBH'daki crud ve connection'u iki ayrı parça şeklinde ayır.
         */
    }
}
