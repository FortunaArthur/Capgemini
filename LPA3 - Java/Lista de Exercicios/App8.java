import java.util.Scanner;;

public class App8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float dola;
        System.out.print("Quanto ta valendo 1 dolar em R$: ");
        dola = leitor.nextFloat();

        float real;
        System.out.print("Quantos R$ vc tem agr: ");
        real = leitor.nextFloat();

        float disponivel = real/dola;
        int convert = (int)(Math.round(disponivel));

        System.out.print("Vc tem " + convert + "dolar! converti teus reais em dolar");

    }
}
