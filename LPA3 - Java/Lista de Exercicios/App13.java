import java.util.Scanner;

public class App13{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;
        System.out.print("Digite um numero: ");
        numero = leitor.nextInt();

        if (numero > 10){
            System.out.print("Maior que 10 ");
        } else {System.out.print("Menor que 10");}
    }
}