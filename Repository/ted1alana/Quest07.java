
package ted1alana;

import java.util.Scanner;


public class Quest07 {
    public static void main(String[] arg){
        System.out.println("---(7)Media do aluno!---");
        Scanner input = new Scanner(System.in);
        float n1, n2, n3, media;
        
        System.out.println("Digite sua primeira nota: ");
        n1 = input.nextFloat();
        System.out.println("Digite sua segunda nota: ");
        n2 = input.nextFloat();
        System.out.println("Digite sua terceira nota: ");
        n3 = input.nextFloat();
        media = (n1+n2+n3)/3;
        System.out.println("Sua media foi:"+media);
        
        if (media>=7){
            System.out.println("Aluno APROVADO :) ");
        }else if( media>=2.6 && media<=6.9){
            System.out.println("Aluno ficou em REPROVAÇÃO :/");
        }else if(media<=2.5){
            System.out.println("Aluno foi REPROVADO :'( ");
        }
    }
}
