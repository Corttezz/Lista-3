// Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o 
// programa para que ele mostre os números um ao lado do outro.
public class Ex006 {
    public static void main(String[] args) throws Exception {
        int num;
        for(num=0; num<=20; num++){
            System.out.println(num);
            // Para listar lado a lado use:
            // System.out.print(num+" ");
        }
    }
}
