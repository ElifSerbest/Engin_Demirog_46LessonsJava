package abstractDemo;

public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        /*OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        oracleDatabaseManager.getData();*/ //dersek Oracle'ye bağımlı oluruz artık.
        
        databaseManager.getData();

    }
}
