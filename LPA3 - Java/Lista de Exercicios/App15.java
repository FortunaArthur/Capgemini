import java.util.Scanner;

public class App15{
    public static void main(String[] args){

        int numero;

        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite un nuemro inteiro ai: ");

        numero = leitorScanner.nextInt();


        if(numero >= 100 && numero <= 200){
            System.out.println("Dentro do Intervalo");

        } else{
            System.out.println("Fora do Intervalo");
        }
    }
}