
package ladosdeumtriangulo_fabioalexandre;
import java.util.Scanner;
public class LadosDeUmTriangulo_FabioAlexandre {

 
    public static void main(String[] args) {
     Scanner entrada;
     double a, b, c;
     entrada = new Scanner(System.in);
     System.out.print("Digite o valor A: ");
     a = entrada.nextDouble();
     System.out.println("Digite o valor B: ");
     b =  entrada.nextDouble();
     System.out.println("Digite o valor C: ");
     c = entrada.nextDouble();
     
if((a+a>c) && (a+c>b) && (b+c>a)){
           System.out.println("é um triângulo valido");

         if(a==b && a==c && b==c){
            System.out.println("Triângulo Equilátero");
         }
         else if(a!=b && a!=c && b!=c){
            System.out.println("Tiângulo Escaleno");
         }
         else if((a==b && a!=c) || (a==c && a!=b) || (b==c & b!=a)){
            System.out.println("Triângulo Isósceles");
         }
        }
        else{
            System.out.println("Não é um triângulo valido");

        } 
    }
}