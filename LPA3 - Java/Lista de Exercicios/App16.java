import java.util.Scanner;

public class App16{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        float n1=0;
        System.out.print("Primeira nota: ");
        n1 = leitor.nextFloat();

        float n2=0;
        System.out.print("Segunda nota: ");
        n2 = leitor.nextFloat();
        
        float n3=0;
        System.out.print("Terceira nota: ");
        n3 = leitor.nextFloat();

        float media = (n1+n2+n3)/3;

        if (media >= 7){
            System.out.println("Passou: olha tua media ai: ");
            System.out.printf("%.2f", media);
        } else if (media >= 5.1 && media <= 6.9){
            System.out.println("TA DE RECU: olha tua media ai: ");
            System.out.printf("%.2f", media);
        } else if (media <= 5) {
            System.out.println("REPROVADO: olha tua media ai: ");
            System.out.printf("%.2f", media);
        }
    }
}
