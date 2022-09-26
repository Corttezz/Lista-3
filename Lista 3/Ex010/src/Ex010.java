import java.util.Scanner;

//Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo
//compreendido por eles.
public class Ex010{
    public static void main(String[] args) throws Exception {
        int num1, num2, start, i, lenght;
        i = 0;
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite dois números inteiros: ");
        num1 = tc.nextInt();
        num2 = tc.nextInt();
        lenght= num1 - num2;
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
            System.out.println(start);
        }
    }
}
