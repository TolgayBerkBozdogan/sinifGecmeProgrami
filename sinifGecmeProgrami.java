import java.util.Scanner;

public class sinifGecmeProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, turk, tarih, kimya, fizik, muzik;

        System.out.print("Matematik notunuzu giriniz :");
        mat = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz :");
        turk = input.nextInt();
        System.out.print("Tarih notunuzu giriniz :");
        tarih = input.nextInt();
        System.out.print("Kimya notunuzu giriniz :");
        kimya = input.nextInt();
        System.out.print("Fizik notunuzu giriniz :");
        fizik = input.nextInt();
        System.out.print("Müzik notunuzu giriniz :");
        muzik = input.nextInt();

        double average = ((mat + turk + tarih + kimya + fizik + muzik) / 6);

        if (average<50){
            System.out.print("Üzgünüm Kaldınız.");
        }else{
            System.out.print("Tebrikler Geçtiniz");
        }
    }
}
