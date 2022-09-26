// Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e
// a soma dos valores.
import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) throws Exception {
        int conjunto[], numeros;
        int maior = 0;
        int menor = 0;
        int soma = 0;

        try (Scanner tc = new Scanner(System.in)) {
            System.out.println("Digite a quantidade de números do conjunto: ");
            numeros = tc.nextInt();
            conjunto = new int[numeros];

            for(int i = 0; i < numeros; i++){
                System.out.println("Digite o "+(i+1)+"° número:");
                conjunto[i] = tc.nextInt();

                maior = conjunto[i];
                menor = conjunto[i];
            }
        }
        for(int i = 0; i<numeros; i++){
            if(conjunto[i] > maior){
                maior = conjunto[i];
            }
            if(conjunto[i] < menor){
                menor = conjunto[i];
            }
            soma = soma + conjunto[i];
        }
        System.out.println("O maior é "+maior+", o menor é "+menor+", e a soma dos números é "+soma+".");
    }  
}
