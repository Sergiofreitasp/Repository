
package ted1alana;

import java.util.Scanner;


public class Quest06 {
    public static void main(String[] arg){
        System.out.println("---(6)Ler numeros inteiros---");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int i = input.nextInt();
        while (i!= -1){
            if (i%2 ==0){
                System.out.println("Esse numero é Par!");
                System.out.println("Digite um numero inteiro: ");
                i = input.nextInt();
            }else{
                System.out.println("Esse numero é IMPAR!");
                System.out.println("Digite um numero inteiro: ");
                i = input.nextInt();
            }
        }
        System.out.println("Mensagem de finalização!");
    }
}
