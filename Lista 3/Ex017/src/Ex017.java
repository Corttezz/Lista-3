import java.util.Scanner;

// Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
public class Ex017 {
    public static void main(String[] args) throws Exception {
        int num, fatorial;
        fatorial = 1;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = tc.nextInt();
        tc.close();
        for (int i = 1; i <= num; i++) {

            if (num == num +1 - i) {
                fatorial = ((num + 1 - i) * (num - i));
            } else if(num - i > 0){
                fatorial = fatorial * (num - i);
            }
        }
        System.out.println("O resultado do fatorial é de: "+fatorial);
    }
}
