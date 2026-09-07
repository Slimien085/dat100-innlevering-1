import java.util.Scanner;

public class O3 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nf =1;
        for (int i=1; i <= n; i++){
            nf = nf*i;
        }
        System.out.println(nf);
    }
}
