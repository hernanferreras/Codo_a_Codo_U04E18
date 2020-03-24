
package u04e18;

import java.util.Scanner;
public class U04E18 {

    public static void main(String[] args) {
       int num, i;
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese un numero: ");
       num = entrada.nextInt();
       i=1;
       while (i<=10){
           System.out.println(num+"*"+i+"="+(num*i));
           i=i+1;
       }
    }
}