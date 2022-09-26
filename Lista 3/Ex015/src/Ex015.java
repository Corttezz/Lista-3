
import java.util.Scanner;

// A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
// Faça um programa capaz de gerar a série até o n−ésimo termo.
public class Ex015 {
    public static void main(String[] args) throws Exception {
        int termo, i, num, num2, sequencia;
        num = 0;
        num2= 1;
        
        sequencia = 0;
        Scanner tc = new Scanner(System.in);
        termo = tc.nextInt();
        tc.close();
        for(i=1; i<=termo; i++){
            sequencia =  num2 + num;
            num = num2;
            num2 = sequencia;
            System.out.println(sequencia);
        }
    }
}
