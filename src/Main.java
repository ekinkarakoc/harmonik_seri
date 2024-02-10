import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N sayisini giriniz : ");
        double toplam = 0;
        int n = scanner.nextInt();

        for(double i = 1; i<= n; i++){
            toplam += (1/i);
        }
        System.out.println(toplam);
    }
}