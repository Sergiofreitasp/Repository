
package ted1alana;

import java.util.Scanner;


public class Quest01 {
    public static void main(String[] arg){
        System.out.println("---(1)Calculo do troco---");
        Scanner input = new Scanner (System.in);
        
        float valorpago, precoprod, troco;
        
        System.out.print("Digite o valor pago: ");
        valorpago = input.nextFloat();
        
        System.out.print("Digite o preço do produto: ");
        precoprod = input.nextFloat();
        
        troco = valorpago - precoprod;
        System.out.print("O troco é: "+ troco);
    }
}
