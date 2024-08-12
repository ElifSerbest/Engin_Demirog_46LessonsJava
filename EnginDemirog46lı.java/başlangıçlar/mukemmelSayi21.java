package başlangıçlar;
public class mukemmelSayi21 {
  public static void main(String[] args) {
    int number = 24;
    int total=0;

    for(int i=1; i<number; i++){
        if(number % i == 0){
            total = total + number;
        }
    }
        if(total==number){
            System.out.println("Mükemmel sayıdır.");
        }else{
            System.out.println("Mükemmel sayı değildir.");
        }
  }
}
