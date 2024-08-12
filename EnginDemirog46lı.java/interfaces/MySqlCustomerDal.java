package interfaces;
/*3*CustMan*/
public class MySqlCustomerDal /*extends OracleCustomerDal*/ implements ICustomerDal, IRepository{
//ICDal'ı implemente eden herkes bu operasyonları içermek zorunda
    @Override
    public void add() { //mySQL için add operasyonu
        System.out.println("My sql'e eklendi");        
    }
    
}
