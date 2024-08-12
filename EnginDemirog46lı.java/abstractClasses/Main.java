package abstractClasses;
//abstract class'ları belirli kurallarla kullanabiliyoruz.
//bir class başka classı inherite ettiğinde başka classı inherite edemiyordu. gibi kurallar
//a.class'lar sadecebaşka bir sınıfı inherite edebilir.
//veya bir sınıf sadece bir a.class'ı inherite edebilir.
//bir sınıf herhangi bir classı ve a.classı miras alamaazz.

public class Main {
    public static void main(String[] args) {
          WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
          womanGameCalculator.hesapla();
          womanGameCalculator.gameOver();

          GameCalculator gameCalculator = new WomanGameCalculator(); //bir operasyona gameCalculator verip istersek woman man kidsGC ekleyebiliriz..^^
    }

}


    //tercih edilmez çok tek başına kullanılamazlar abstract'lar.
    //abstarct'lar base'i gizlemek istediğimiz zaman da kullanılabilir.
    //" sınıflar asla new'lenemez. New'lenebilmesi için bizim onun operasyonlarını aşağıdaki imzalı kullanımda olduğu gibi ezmemiz gerekte.
    /*GameCalculator gameCalculator = new GameCalculator() {
            @Override
            public void hesapla(){
                
            }
          }; */

