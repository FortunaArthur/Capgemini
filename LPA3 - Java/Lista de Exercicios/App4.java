import java.util.Scanner;

public class App4{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String vendedor;
        System.out.print("Informe o nome do vendedor: ");
        vendedor = leitor.next();

        Float salario;
        System.out.print("Informe o Salario Fixo: ");
        salario = leitor.nextFloat();

        float totalVendas=0f;
        System.out.print("Informe quantos R$ foi de vendas: ");
        totalVendas = leitor.nextFloat();

        float porcentagem = 0.15f;
        float comissao = totalVendas * porcentagem;
        float total = salario + comissao;

        System.out.println();

        System.out.println("Nome do Vendedor: " + vendedor);
        System.out.println("Salario Fixo: " + salario);
        System.out.printf("Porcentagem das Vendas: " + "%.2f", comissao);
        System.out.println();
        System.out.printf("Salario Total: " + "%.2f", total);

    }
}