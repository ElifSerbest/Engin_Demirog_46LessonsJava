package inheritanceDemo;

//bir class sadece bir class'ı extend(inherite) edebilir.
public class Main {
    public static void main(String[] args) {
        /*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();*/

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());   //bellekte bu örneği oluştur.
    }
}
//BaseKrediManager hem OgrKM'ın hem e TarımKM'ın annesi olduğu için KrediUI'a anneyi verip çocuklarından istediğimizi yollayabiliriz.
//bunu referans tip olması sayesinde yapıyor.
//BaseKrediManager ogr'nin de Tarım'ında rfrns'ını tutabilir. 