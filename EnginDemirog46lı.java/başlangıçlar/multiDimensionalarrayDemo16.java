package başlangıçlar;
public class multiDimensionalarrayDemo16 {
    public static void main(String[] args){
        String[][] sehirler = new String[2][2];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[1][0] = "Bilecik";
        sehirler[1][1] = "Ankara";

        for(int i=0; i<=1; i++){
            System.out.println("-----------------");
            for(int j=0; j<=1; j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
