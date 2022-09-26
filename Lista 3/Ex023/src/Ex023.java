import java.util.Arrays;
import java.util.Scanner;

// Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário.
// O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos.
// Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.
public class Ex023 {
    public static void main(String[] args) throws Exception {
        int num;
        int[] div; 
        String falseOrTrue;
        falseOrTrue = "";
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = tc.nextInt();
        div = new int[2];
        tc.close();

        for(int i = 2; i<num; i++){
            if(num % i == 0){
                div[i-2] = i;
               falseOrTrue = "Não é número primo. Divisível por "+ Arrays.toString(div);
               break;
            }else{
                falseOrTrue = "Número primo.";
            }
        }
        System.out.println(falseOrTrue); 
    }
}
