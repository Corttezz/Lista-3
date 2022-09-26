import java.util.Scanner;

// Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
// O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
// Tabuada de 5:
// 5 X 1 = 5
// 5 X 2 = 10
// ...
// 5 X 10 = 50
public class Ex012 {
    public static void main(String[] args) throws Exception {
        int num;
        System.out.print("Digite um número para fazer a tabuada: ");
        Scanner tc = new Scanner(System.in);
        num = tc.nextInt();
        tc.close();
        for(int i = 1; i<10; i++){
            System.out.println(num + " X "+ i + " = " + num*i);
        }
    }
}