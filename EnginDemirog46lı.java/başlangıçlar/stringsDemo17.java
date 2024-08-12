package başlangıçlar;
public class stringsDemo17 {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";

        // stringler bir karakter dizisidir.

        /*
         * System.out.println("Eleman sayısı: "+mesaj.length());
         * System.out.println("5.eleman: "+mesaj.charAt(4));
         * System.out.println(mesaj.concat(" Yaşasın!")); //birleştiriyor mesajları
         * System.out.println(mesaj); //yukarıdakini kullanabilmek için daimi, bir
         * değişkene
         * System.out.println(mesaj.startsWith("B")); //B ile başlıyorsa true döndürür.
         * //mesaj.endsWith de var..
         * 
         * char[] karakterler = new char[5];
         * mesaj.getChars(0, 4, null, 0);
         * //karakterkleri 0.indexinden itibaren aktar,ata.
         * System.out.println(karakterler);
         * System.out.println(mesaj.indexOf('a')); //ilk bulduğunda aramayı bitirir.
         * //lastIndexOf var bir de..sağdan başlayan
         */

        String yenimesaj = mesaj.replace(' ', '-');
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(2, 4)); // 2'den 4. index' kadar kes dedik.

        for (String kelime : mesaj.split(" ")) { // BOŞLUĞA GÖRE AYIR.
            System.out.println(yenimesaj); // kelimleri alt alta ayırdı işte
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim()); // baş ve sondaki boşlukları atar
    }
}
