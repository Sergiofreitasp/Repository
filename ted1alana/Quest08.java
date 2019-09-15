
package ted1alana;

import java.util.Scanner;


public class Quest08 {
    public static void main(String[] arg){
        System.out.println("---(8)Conjunto de elementos!---");
        Scanner input = new Scanner(System.in);
        
        int i, tam, maior, menor, soma, incnj;
        float media;
        
        System.out.println("Qual o tamanho do seu conjunto de elementos?");
        tam = input.nextInt();
        menor=100000000;
        maior=0;
        soma = 0;
        
        for (i=0; i<tam; i = i+1){
            System.out.println("Digite um elemento inteiro: ");
            incnj = input.nextInt();
            soma = soma + incnj;
            if (incnj>maior){
                maior = incnj;
              
            }else if(incnj<menor){
                menor = incnj;
            }
            
        }
        media = soma/tam;
        System.out.println("O menor valor digitado foi "+menor);
        System.out.println("O maior valor digitado foi "+maior);
        System.out.println("A media dos elementos do conjunto é: "+media);
        System.out.println("O somatorio dos elementos é: "+soma);
        
    }
}
