package interfaces;
//aslında interfaceler yapısal anlamda referans tutucudur..
public interface ICustomerDal { //ICustomerDal'a imza ekledik(void add gibi) daha sonra ICDal'ı implemente eden herkes bu operasyonları içermek zorunda

    void add(); 

}

//müşterinin farkı VT sistemleri için implementasyonunu yapıyorz.
//ya da farklı sistemlere göre veriyi getireceğiz.
//Dal:Data Access Layer -> VT ile ilgili operasyonları buraya yazarız.
//Manager genelde ->iş kodlarının öyle mi böyle mi diye yazıldığı yerdir

