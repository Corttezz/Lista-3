import java.util.Scanner;

// Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao
// segundo número. Não utilize a função de potência da linguagem.
public class Ex013 {
    public static void main(String[] args) throws Exception {
        int base, expoente, resultado;
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        base = tc.nextInt();
        System.out.print("Digite o expoente: ");
        expoente = tc.nextInt();
        tc.close();
        resultado = 1;
        for(int i = 1; i<=expoente; i++){
            resultado= resultado * base;
        }
        System.out.println("O resultado da potenciacão é de: "+resultado);
    }
}
