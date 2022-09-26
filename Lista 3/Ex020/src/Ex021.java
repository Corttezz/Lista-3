
import java.util.Scanner;

// Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e 
// limitando o fatorial a números inteiros positivos e menores que 16.
public class Ex021 {
    public static void main(String[] args) throws Exception {
        int num, fatorial;
        fatorial = 1;
        try (Scanner tc = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            num = tc.nextInt();

            while (num < 0 || num >= 16) {
                System.out.println("Número inválido, digite um número menor que 16:");
                num = tc.nextInt();
            }

            for (int i = 1; i <= num; i++) {

                if (num == num + 1 - i) {
                    fatorial = ((num + 1 - i) * (num - i));
                } else if (num - i > 0) {
                    fatorial = fatorial * (num - i);
                }
                while (num - i == 1) {
                    System.out.println("O resultado do fatorial é de: " + fatorial);
                }
                
            }
        }
    }
}
