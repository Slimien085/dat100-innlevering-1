import java.util.Scanner;

public class O2 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int antallStudenter = 10;
        for (int i = 1; i<=10; i++) {
            String karakter;
            do {
                System.out.print("Antall poeng på studen " + i + ": ");
                int poeng = scanner.nextInt();
                karakter = BeregnKarakter(poeng);
                System.out.println(karakter);
            } while (karakter.equals("Ugyldig poengsum"));
        }
    }

    public static String BeregnKarakter(int poeng) {
        if(poeng < 0 || poeng > 100)
            return "Ugyldig poengsum";
        if(poeng < 40)
            return "F";
        if(poeng < 50)
            return "E";
        if(poeng < 60)
            return "D";
        if(poeng < 80)
            return "C";
        if(poeng < 90)
            return "B";
        return "A";
    }
}
