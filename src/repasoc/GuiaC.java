
package repasoc;

import java.util.Scanner;


public class GuiaC {
//Escriba un método que lea 20 números. Si el número leído es igual a cero se debe salir del
//bucle y mostrar el mensaje "Se capturó el número cero". El método deberá calcular y mostrar el
//resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota:
//recordar el uso de la sentencia break.
    public static void nota(){
    Scanner leer = new Scanner (System.in);
       int num;
       int contador = 0;
       int Suma = 0;
       num = leer.nextInt();
            if (num>0){
              do { System.out.println("ingresa un numero");
                num = leer.nextInt();
                Suma = Suma + num;
                contador = contador + 1;
                }while (contador == 20);
            }else {System.out.println("Se capturo el numero cero");}
          
                  
    }
}  
 
      