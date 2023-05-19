import java.util.Scanner;

public class App24{
    public static void main(String[] agrs){

        Scanner leitor = new Scanner(System.in);

        char continuar = 'S';

        while(continuar == 'S' || continuar == 's'){
            System.out.print("Digite um Numero: ");
            int numero = leitor.nextInt();

            if(numero == 0){
                System.out.println("Numero igaul a ZERO");
            } else {
                if(numero > 0){
                    System.out.println("Numero Positivo");
                } else {
                    System.out.println("Numero Negativo");
                }
            }

            System.out.print("Continuar? Digite 'S - SIM' / 'N - NÃO': ");
            continuar = leitor.next().charAt(0);
        }
    }
}