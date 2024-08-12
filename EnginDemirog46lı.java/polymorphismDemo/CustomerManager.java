package polymorphismDemo;

public class CustomerManager {
    private BaseLogger logger; //**onun yerine bu şekilde bir alan oluşturuyorum bağlanacağım şeye

    //bu class'ın bu constructor'u da newlerken çalışıyordu yani hepsi öyle zaten sanırım
    public CustomerManager(BaseLogger logger){ //burada aslında BaseLogger yok DBLogger var, BLogger sadece onun referansını tutuyor.
        this.logger = logger;                  //this dediğimiz de (?)CPTYESOR
    }

   
   
    public void add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("log mesajı 'çağırdık burada'"); //çağırmazsak çalışmaz
        /*DatabaseLogger logger = new DatabaseLogger();   //bir class'ı başka class'ın içinde new yapmak demek : ben CM'da DatabaseLogger'a iyice körü körüne bağlandım demek.
                                                        //olur da bir gün kaldırın denirse DB vs sıkıntı olur.**
        logger.Log("Log mesajı");*/
    }
}
