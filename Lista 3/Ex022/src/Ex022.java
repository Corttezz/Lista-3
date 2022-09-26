import java.util.Scanner;
// Altere o programa de cálculo dos números primos, informando, caso o número não seja primo,
// por quais número ele é divisível.
public class Ex022 {
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
               falseOrTrue = "Não é número primo. Divisível por "+ i;
               break;
            }else{
                falseOrTrue = "Número primo.";
            }
        }
        System.out.println(falseOrTrue); 
    }
}
