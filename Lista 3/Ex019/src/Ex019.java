//Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
import java.util.Scanner;
public class Ex019 {
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
                if(conjunto[i] >= 0 && conjunto[i] <= 1000){

                maior = conjunto[i];
                menor = conjunto[i];

                
                }else{
                    System.out.println("Número inválido.");
                    System.out.println("Digite o "+(i+1)+"° número novamente:");
                    conjunto[i] = tc.nextInt();
                }
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
