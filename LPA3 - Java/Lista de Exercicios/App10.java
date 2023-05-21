import java.util.Scanner;;

public class App10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float produto;
        System.out.print("Qual o valor da compra: ");
        produto = leitor.nextFloat();

        float prestacao = produto / 5;
        System.out.print("Sua prestação ficou em ");
        System.out.printf("%.2f", prestacao);

    }
}
