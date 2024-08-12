package başlangıçlar;
public class switch10 {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel:Geçtin.");
                break;
            case 'B':
                System.out.println("Çok Güzel:Geçtin.");
                break;
            case 'C':
                System.out.println("İyi:Geçtin.");
                break;
            case 'D':
                System.out.println("Fena Değil:Geçtin.");
                break;
            case 'F':
                System.out.println("Kaldın :(");
                break;

        }

    }
}
