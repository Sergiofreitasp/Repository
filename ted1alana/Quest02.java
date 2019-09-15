
package ted1alana;

import java.util.Scanner;


public class Quest02 {
    public static void main(String[] arg){
        System.out.println("---(2)Calculo do kg---");
        Scanner input = new Scanner (System.in);
        float valorkg, kgconsumo, valorpagar;
        
        System.out.println("Digite o valor do kg: ");
        valorkg = input.nextFloat();
        
        System.out.println("Digite a quantidade de kg consumida: ");
        kgconsumo = input.nextFloat();
        
        valorpagar = valorkg * kgconsumo;
        System.out.println("O cliente deve pagar "+valorpagar+"reais!");
    }
}
