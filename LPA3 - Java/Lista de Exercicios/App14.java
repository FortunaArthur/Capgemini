import java.util.Scanner;

public class App14{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int n1;
        int n2;

        System.out.print("Informe o 1° numero: ");
        n1 = leitor.nextInt();

        System.out.print("Informe o 2° numero: ");
        n2 = leitor.nextInt();

        if (n1 == n2) {
            System.out.print("IGUAI");
        } else {
            if (n1 > n2) {
                System.out.print(n1 + " maior que " + n2);
            } else {
                System.out.print(n2 + " maior que " + n1);
            }
        }
    }
}