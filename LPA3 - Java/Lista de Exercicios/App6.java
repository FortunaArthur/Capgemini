public class App6 {
    public static void main(String[] args) {
        int A = 10;
        int B = 8;
        int T = 0;

        System.out.println("Antes|| A: "+A + " || B: "+B);

        T = A;
        A = B;
        B = T;

        System.out.println("Depois|| A: "+A + " || B: "+B);
    }
}

// Obrigado meu amigo Rivetti