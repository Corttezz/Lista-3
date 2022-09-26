import java.util.Scanner;

// Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
// Um número primo é aquele que é divisível somente por ele mesmo e por 1.
public class Ex021 {
    public static void main(String[] args) throws Exception {
        int num;
        String falseOrTrue;
        falseOrTrue = "";
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = tc.nextInt();
        tc.close();
        
        for(int i = 2; i<num; i++){
            if(num % i == 0){
               falseOrTrue = "Não é número primo.";
               break;
            }else{
                falseOrTrue = "Número primo.";
            }
        }
        System.out.println(falseOrTrue);
     }
 }
