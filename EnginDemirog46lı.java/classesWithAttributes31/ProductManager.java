package classesWithAttributes31;

public class ProductManager {
    public void Add(Product product) {
        // bu product'ları JDBC kodları yazarak VT'na kaydediceğiz ileride.
        System.out.println("Ürün eklendi: " + product.name);
    }

    // operasyon gönderelim yine
    public void Add2(int id, String name, String description, int stockAmount, double price) {
        // bu hatalı bir kullanımdır (main'de gelip çalıştırdık'bir ekranda kullandık')
        // başka bir ekrana geldik yine kullandık, tekrar tekrar kullandık diyelim

        

    }
}
