package başlangıçlar;
public class loop11 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti.");

        int i = 11;
        while(i<10){
            System.out.println(i);
        }
        System.out.println("While Döngüsü Bitti.");

        int j=100;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("While Döngüsü Bitti.");
    }
}
