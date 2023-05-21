import java.util.Scanner;;

public class App5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String aluno;
        System.out.print("Digite o nome do aluno: ");
        aluno = leitor.next();

        float nota1=0;
        System.out.print("Digite a 1° nota do aluno: ");
        nota1 = leitor.nextFloat();

        float nota2=0;
        System.out.print("Digite a 2° nota do aluno: ");
        nota2 = leitor.nextFloat();

        float nota3=0;
        System.out.print("Digite a 3° nota do aluno: ");
        nota3 = leitor.nextFloat();

        float media = (nota1+nota2+nota3) / 3;
        System.out.print("Media Aritimetica das notas: ");
        System.out.printf("%.2f", media);
    }
}
