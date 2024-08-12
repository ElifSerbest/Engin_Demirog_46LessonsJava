package methodOverloading;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem(); //yazdığımız class'ı başka bir class'ın içeriisnde kullandık.
        System.out.println(dortIslem.topla(5, 6));
        System.out.println(dortIslem.topla(5,   40, 5));
    }
}
