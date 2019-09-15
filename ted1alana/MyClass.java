/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ted1alana;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MyClass {
    public static void main(String[] arg){
        /*System.out.println("---(1)Calculo do troco---");
        Scanner input = new Scanner (System.in);
        
        float valorpago, precoprod, troco;
        
        System.out.print("Digite o valor pago: ");
        valorpago = input.nextFloat();
        
        System.out.print("Digite o preço do produto: ");
        precoprod = input.nextFloat();
        
        troco = valorpago - precoprod;
        System.out.print("O troco é: "+ troco);*/
        
        /*System.out.println("---(2)Calculo do kg---");
        Scanner input = new Scanner (System.in);
        float valorkg, kgconsumo, valorpagar;
        
        System.out.println("Digite o valor do kg: ");
        valorkg = input.nextFloat();
        
        System.out.println("Digite a quantidade de kg consumida: ");
        kgconsumo = input.nextFloat();
        
        valorpagar = valorkg * kgconsumo;
        System.out.println("O cliente deve pagar "+valorpagar+"reais!");*/
        
        
        /*System.out.println("---(3)Par ou impar?---");
        Scanner input = new Scanner(System.in);
        int numin;
        
        System.out.println("Digite um numero: ");
        numin = input.nextInt();
        
        if (numin%2 == 0){
            System.out.println("Esse numero é PAR :)");
        }else{
            System.out.println("Esse numero é IMPAR :)");
        }*/
        
        
        /*System.out.println("---(4)Classificaçao de Triangulos---");
        Scanner input = new Scanner(System.in);
        float A, B, C;
        
        System.out.print("Digite o primeiro lado: ");
        A = input.nextFloat();
        System.out.print("Digite o segundo lado: ");
        B = input.nextFloat();
        System.out.print("Digite o terceiro lado: ");
        C = input.nextFloat();
        
        if(C<A+B || A<B+C || B<C+A){
            if(A==B && B==C){
                System.out.println("Esse trinagulo é EQUILATERO!");
                
            }else if(A==B || B==C || C==A ){
                System.out.println("Esse trinagulo é ISOCELES!");
            }else{
                System.out.println("Esse trinagulo é ESCALENO!");
            }
        }else{
            System.out.println("NAO FORMA TRIANGULO!!!");
        }*/
        
        
        /*System.out.println("---(5)Imprimir multiplos de 3(1 a 100)---");
        int i;
        
        for ( i=1 ; i<=100 ; i = i+1){
            if (i%3 ==0){
            System.out.println(i);
            }
        }*/
        
        /*System.out.println("---(6)Ler numeros inteiros---");
        
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
        System.out.println("Mensagem de finalização!");*/
        
        /*System.out.println("---(7)Media do aluno!---");
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
        }*/
        
       
        /*System.out.println("---(8)Conjunto de elementos!---");
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
        System.out.println("O somatorio dos elementos é: "+soma);*/
        
        
        
        
      
    }
    
}
