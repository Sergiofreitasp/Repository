
package ted1alana;

import java.util.Scanner;


public class Quest03 {
    public static void main(String[] arg){
        System.out.println("---(3)Par ou impar?---");
        Scanner input = new Scanner(System.in);
        int numin;
        
        System.out.println("Digite um numero: ");
        numin = input.nextInt();
        
        if (numin%2 == 0){
            System.out.println("Esse numero é PAR :)");
        }else{
            System.out.println("Esse numero é IMPAR :)");
        }
    }
}
