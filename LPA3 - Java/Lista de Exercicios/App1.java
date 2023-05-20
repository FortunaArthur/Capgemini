import java.util.Scanner;

public class App1{
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int numero1;
        int numero2;

        System.out.print("Digite un numero inteiro ai: ");
        numero1 = leitor.nextInt();

        System.out.print("Digite un numero inteiro ai: ");
        numero2 = leitor.nextInt();

        System.out.println("Soma: " + (numero1 + numero2));

    }
}