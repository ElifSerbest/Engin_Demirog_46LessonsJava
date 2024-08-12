package inheritanceDemo;

public class KrediUI {              //burası arayüz,butonlar,textbox'lar vs. ama amaç ogrt ve trmkrmanager'i çağırmak
    public void KrediHesapla(BaseKrediManager baseKrediManager){
        /*ogretmenKrediManager.Hesapla();*/
        baseKrediManager.Hesapla();
    }
}
