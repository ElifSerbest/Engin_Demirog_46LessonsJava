package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{
    public void log(String message){       //DBlogger'in içine yazarsam aynı imzayla bu çalışır. bu üzerine yazmış demek oluyor yani
        System.out.println("Logged to Database : "+message);    //mesajı VT'na logladım demek
    }
}
