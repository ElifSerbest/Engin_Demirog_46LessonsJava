package abstractDemo;
//bir müşterinin VT'na kaydedilmesini işliyor olacağız. Oracle,MsSql,MySQL vb..
public class Main {
  
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        //customerManager.getCustomers(); -> databaseMAnager bir abstract olduğu için bir örnek yok ortada (zaten abstract'ı direkt çalıştıramıyorduk.)
        customerManager.databaseManager = new OracleDatabaseManager();  //sistem direkt arızasız oracle'yle çalışır.
        customerManager.getCustomers();     //yukarıdaki konfigürasyonu SqlServerDatabaseManager yaparsak da sql olur.

    }
}//bir sisteme yeni bir özellik getirildiğinde mevcuttaki hiçbir kodu değiştiremezsin. (Main haricindeki herhangi class) SOLID'in O'su.
 //yalnızca konfigürasyon değiştirilebilir. (IOS Container'lerle bağımlılık yönetimi araçlarıyla ileri seviyedeki bir kural)

