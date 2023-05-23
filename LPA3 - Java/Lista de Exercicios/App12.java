import java.util.Scanner;

public class App12{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Float custoFabrica;
        Float custoConsumidor;
        Float porcentagemDistribuidor = 0.28f;
        Float PercentualImpostos = 0.45f;
        Float Destribuidor;
        Float ValorImpostos;
 
        System.out.print("Informe o custo de fábrica de um carro novo: ");
        custoFabrica = leitor.nextFloat();
 
        ValorImpostos = custoFabrica + (custoFabrica * PercentualImpostos) / 100;
 
        Destribuidor = custoFabrica + (ValorImpostos * porcentagemDistribuidor) / 100;
 
        custoConsumidor = custoFabrica + Destribuidor + ValorImpostos;
 
        System.out.print("O custo ao consumidor de um carro novo é: ");
        System.out.printf("%.2f", custoConsumidor);
    
    }
}