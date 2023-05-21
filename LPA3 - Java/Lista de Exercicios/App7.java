import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float C;
        System.out.print("Temperatura em Celcius: ");
        C = leitor.nextFloat();

        double F = 32 + (C * 1.8);

        System.out.print("Convertida pra Fahrenheit: ");
        System.out.printf("%.2f", F);
    }
}
