
package ted1alana;

import java.util.Scanner;


public class Quest04 {
    public static void main(String[] arg){
        System.out.println("---(4)Classificaçao de Triangulos---");
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
        }
    }
}
