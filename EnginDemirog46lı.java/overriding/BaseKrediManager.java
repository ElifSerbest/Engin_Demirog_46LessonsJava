package overriding;

public class BaseKrediManager {
    public /*final*/ double hesapla(double tutar){
return tutar*1.18;
    }
}
//final olunca ezemiyoruz.
//üzerine yazılmaya çalışılan (override edilmeye) final oldğu için sen onu ezemezsin. Ezersen kızarırım (ogrKrdManagaer'deki gibi )
