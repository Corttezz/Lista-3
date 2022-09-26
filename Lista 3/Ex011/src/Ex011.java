import java.util.Scanner;

//mostre a soma entre eles
public class Ex011{
    public static void main(String[] args) throws Exception {
        int num1, num2, start, i, lenght, soma;
        i = 0;
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite dois números inteiros: ");
        num1 = tc.nextInt();
        num2 = tc.nextInt();
        lenght= num1 - num2;
        soma = 0;
        tc.close();
        if(lenght < 0){
            lenght = lenght *-1;
        }
        if(num1 < num2){
            start = num1;
        }else{
            start = num2;
        }
        for(i=1; i<lenght; i++){
            start++;
            soma = soma + start;
            System.out.print(start+" - ");
        }
        System.out.println("A soma entre todos eles é de: "+soma);
    }
}