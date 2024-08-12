package başlangıçlar;
public class sayiBulma23 {
    public static void main(String[] args){
        int[] sayilar = {1,2,3,4,5,6,7,8,9};
        int arancak=5;
        boolean varMi = false;

        for(int sayi:sayilar){
            if(sayi==arancak){
                varMi = true;
                break;
            }
        }
        if(varMi==true){
            System.out.println("Dizide "+ arancak + " sayısı var.");
        }else{
            System.out.println("Dizide "+ arancak + " sayısı yok.");
        }
    }
}
