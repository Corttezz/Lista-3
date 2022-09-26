// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
public class Ex009 {
    public static void main(String[] args) throws Exception {
        int num, i;
        num=0;
        for(i = 1; i <=50; i++){
            num++;
            if(num %2 !=0){
                System.out.println(num);
            }
        }
    }
}
