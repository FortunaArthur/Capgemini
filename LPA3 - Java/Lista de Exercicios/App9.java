import java.util.Scanner;;

public class App9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float rende = 0.07f;

        float poupando;
        System.out.print("Quanto vc depositou esse mes: ");
        poupando = leitor.nextFloat();

        float rendendo = poupando * rende;
        System.out.print("Mes q vem vai estar na conta: ");
        System.out.printf("%.2f", (poupando+rendendo));
        
    }
}
