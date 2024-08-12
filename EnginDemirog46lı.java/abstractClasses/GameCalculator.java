package abstractClasses;

public abstract class GameCalculator {   //baseCalculator gibi bişi, temel, kıyaslamalar olucak ya onları hesaplayacakk
    /*public void Hesapla(){
        System.out.println("Puanınız: 100");
    }*/

    public abstract void hesapla();    //hesaplayı kim implemente (inherite) ediyorsa hesaplayı içermek zorunda ve override etmesi (kendi hesaplasını yazmak zorunda) zorunda


    public final void gameOver(){               //override edilmesini istemediğim için final koydum
        System.out.println("Oyun Bitti.");    //bu demek oluyor ki GameCalculator'u kim kullanıyorsa gameOver'ı olduğu gibi kullanmalıdır hiçbir zaman değişmeyecek kuraldır.
    }
    //tamamlanmış operasyon, işi bitmiş, tek başına çalışan op.
}
