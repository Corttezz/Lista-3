import java.util.Scanner;
// Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido
// e continue pedindo até que o usuário informe um valor válido.
public class Ex001 {
    public static void main(String[] args) throws Exception {
      int num;
      Scanner tc = new Scanner(System.in);
      System.out.print("Digite um número de 0 a 10: ");
      num = tc.nextInt();
      while(num < 0 || num>10){
        System.out.println("Número inválido. Digite um número de 0 a 10: ");
        num = tc.nextInt();
      }
      tc.close();
    }
}
