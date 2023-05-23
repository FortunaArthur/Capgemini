import java.util.Scanner;

public class App11{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float custoCompra=0;
        System.out.print("Qual o valor de compra deste produto: ");
        custoCompra = leitor.nextFloat();

        float adicional=0;
        System.out.print("Qual porcentagem adicional a este produto: ");
        adicional = leitor.nextFloat();

        float valorVenda = custoCompra + (custoCompra * (adicional/100));
        System.out.print("Valor da venda do produto: ");
        System.out.printf("%.2f", valorVenda); 
    }
}