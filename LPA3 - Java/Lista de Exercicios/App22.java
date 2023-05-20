import java.util.Scanner;

public class App22 {
    public static void main(String[] args) {
        
        try (Scanner leitor = new Scanner (System.in)) {
            String nomeProduto;
            Float precoCusto;
            Float precoVenda;

            Float totalCusto = 0.0f;
            Float totalVenda = 0.0f;

            int i = 0;
            for(; i < 3; i++){
                System.out.print("Digite o nome do Produto: ");
                nomeProduto = leitor.next();

                System.out.print("Digite o Preço de Custo: ");
                precoCusto = leitor.nextFloat();

                System.out.print("Digite o Preço de Venda: ");
                precoVenda = leitor.nextFloat();

                totalCusto = totalCusto + precoCusto;
                totalVenda += precoVenda;

                if (precoCusto == precoVenda){
                    System.out.println("Preços Empatados");
                } else {
                    if (precoVenda > precoCusto){
                        System.out.println("Deu Lucro");
                    } else {
                        System.out.println("Deu Preju");
                    }
                }

                System.out.println(nomeProduto + "| Custo=" + precoCusto + "| Venda=" + precoVenda);
                System.out.println();
   
            }

            System.out.println("Total Preço Custo = " + totalCusto);
            System.out.println("Media Total Custo = " + (totalCusto/i));
            System.out.println();
            System.out.println("Total Preço Venda = " + totalVenda);
            System.out.println("Media Total Venda = " + (totalVenda/i));
        }
    }
}
