package başlangıçlar;
public class reCapDemo2_15 {
    public static void main(String[] args){
        double[] myList = {1.2, 3.4, 2.5, 3.9};
        double total=0;
        double max = myList[0];
        for(double number : myList){
            if(max<number){
                max=number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam= " + total);
        System.out.println("En Büyük= " + max);

    }
}
