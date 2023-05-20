import java.util.Scanner;

public class App3{
    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    float distanciaTotal=0;
    float combustivelTotal=0;

    System.out.print("Distancia Total: ");
    distanciaTotal = leitor.nextFloat();

    System.out.print("Combustivel Total: ");
    combustivelTotal = leitor.nextFloat();

    float consumoMedio = distanciaTotal / combustivelTotal;
    System.out.print("Consumo Medio: " + consumoMedio);

    }
}