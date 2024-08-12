package polymorphismDemo;
//38.video polymorphism gerçek hayat uygulamaları önemli!
//çokbiçimlilik: referans tiplerin aralarında bir inheritance varsa birbirlerinin referansını tutması halinde oluşan durumdur.
//birbirini inherite etmiyorsa benzemiyorlarsa üstleri aynı değilse poly olamazlar.
//loglama VT'na, bir dosyaya.. yapılabilir vsvs
public class Main {
    public static void main(String[] args) {
       /*EmailLogger logger = new EmailLogger();
        logger.Log("Email Log mesajı");*/
                                                                                                         //plug and play: tak ve çalıştır               
        //2//BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()}; //hepsinin annesi BaseLogger olduğu için sorun çıkmadı.
        //2 tane FileLogger değişkeni yaptık (Stack'de) 1 tane de BaseLogger, bunların 3ü de Heap'deki aynı new'e tutabildiği için yukarıdaki atamaları yapabildik.
        //her biri farklı iş yapıyor ama hepsi aslında BaseLogger gibi diyebilirz(?)

        /*2*for(BaseLogger logger : loggers){
            logger.Log(("Log mesajı"));*2*/
        

        //int[] sayilar = new int[]{2,3,4,"daksd"};

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());    //ben DBLogger'ı gönderdim ya
        customerManager.add();                                    //FileLogger() deseydik LoggedtoFile: diyecekti 

        
    }
}

