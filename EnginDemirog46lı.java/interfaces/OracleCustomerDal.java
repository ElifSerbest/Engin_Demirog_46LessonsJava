package interfaces;
/*3*CustMan*/
public class OracleCustomerDal implements ICustomerDal{
//ICDal'ı implemente eden herkes bu operasyonları içermek zorunda
    @Override
    public void add() {
        System.out.println("Oracle'ye eklendi");        
    }
    
}
