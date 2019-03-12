//Esto es un archivo que tu al introducir un numero te dice si es par o impar
import java.util.Scanner;


public class T3_Ejercicio9 {

    
    
    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduzca el numero");
        numero = scan.nextInt();
        
        if(numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }
    }
    
}
