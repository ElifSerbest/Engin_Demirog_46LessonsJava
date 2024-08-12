package classesWithAttributes31;

public class Product {

    public Product(int id, String name, String descriptionString, int price, int stockAmount, String renkString) {
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = descriptionString; // Doğru parametre adını kullanın
        this.stockAmount = stockAmount;
        this.renk = renkString; // Doğru parametre adını kullanın

        /*Burada, this.id, sınıfın id alanına atıfta bulunur, sağdaki id ise yapıcıya geçirilen parametredir.
          this.id kullanımı, sınıf alanının parametreden gelen değerle atanmasını sağlar. */
    }

    public Product(){   //işte buna AŞIRI YÜKLEME DEMEK: PRODUCT CLASS'ININ BİR PARAMETRELİ BİR DE P'SİZ constructor'u VAR

    }

    //attribute || field diyebiliriz bunlara
     int id;
     String name;
     String description;
     double price;
     int stockAmount;
     String renk;
     String kod;

    //getter
    public int getId(){
        return id;
    }

    //setter
    public void setId(int id){
        this.id = id;               //this->bu class demek,içinde bulunduğumuz class ya da bu class'takilerin başına_id şu şekilde yapabiliriz.
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription (String description){
        this.description = description;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getStockAmount(){
        return stockAmount;
    }

    public void setStockAmount(int stockAmount){
        this.stockAmount = stockAmount;
    }

    public String getRenk(){
        return renk;
    }

    public void setRenk(String renk){
        this.renk = renk;
    }

    public String getKod(){
        return kod;
    }

    public void setKod(String kod){
        this.kod=kod;
    }


    //bir ürünün içerisinde bu şekilde alanlar tanınmladığımızda bunu public olarak işaretlemiş oluyoruz. default'ken hiçbir şey başlarına yazmamışken.(private yokken)
}
//Constructor: oluşturucu | Her class'ın (kendi ismiyle olan) bir constructor'u vardır. -> yapıcı blok/metot gibi düşünebiliriz. 
//biz bu product'ı kullanırken encapsulation'dan yararlanmak için yukarıdakilerin alanlarını getter ve setter'larla daha kullanışlı bir hale getirdik.
//class'ı new'leyince çalışan bloğu devreye sokmuş oluyoruz