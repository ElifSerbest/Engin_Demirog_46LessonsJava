package staticDemo;
//statiklerimizi kullanım alanlarımızdan bir tanesi->uyg'ların içinde UTILTY dediğimiz araç yazarken kullanırız.
public class ProductValidator { //java'da C#'taki gibi ana class'ın önüne static koyunca static olamıyor.
    //PV. bir ürünü kaydederken/güncellerken ürünün kurallara uygun olup olmadığını doğrulamak için kullanırız. 
    
/*3*/   static{

        System.out.println("Statik Yapıcı blok çalıştı!");
    }

    public ProductValidator(){  //constructor'ımız class ismiyle aynı olmalıydı. void moid yoktu
        System.out.println("Yapıcı blok(new'leyince çalışıyordu) çalıştı.");
    }

    public static boolean isValid(Product product){ //ben sana bir tane product vericem sen bana onu doğrula
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void bisey(){    //bunlara inner class denir. class içi class
/*2*/  //bu metodu çağırabilmemiz için ProductValidator'u newlememiz lazım
    }
/*3*///!FARK!ama C#'ta yapıcı blok static'de de çalışır(parametresiz olan), burada çalışmıyor, burada çalıştırmak için *3*


    /*public static class BaskaBirClass {
        public static void Sil(){

        }
    
    }*/

}
