import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ucret Tutarini Girin : ");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = kdvTutar + tutar;
        System.out.println ("KDV'siz Tutar:" + tutar);
        System.out.println ("KDV orani:" + kdvOran);
        System.out.println ("KDV TutarI:" + kdvTutar);
        System.out.println ("KDV'li Tutar:" + kdvliTutar);

    }
}
