
package comun;

import java.util.Scanner;

/**
 *  Programa para probar pila 
 * @author coby_
 */
public class Prueba {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Tamaño: ");
        int tam = Integer.parseInt(sc.nextLine()); 
        Pila pila = new Pila(tam); 
        int opc = 0; 
        do {
            System.out.println("1)Agregar");
            System.out.println("2)Sacar");
            System.out.println("3)Mostrar");
            System.out.println("4)Ver tope");
            System.out.print("Selecciona:");
            opc = Integer.parseInt(sc.nextLine()); 
            switch(opc){
                case 1: 
                    System.out.println("Dame un nombre:");
                    String nombre = sc.nextLine(); 
                    pila.push(nombre);
                    break; 
                case 2:
                    String valor = pila.pop(); 
                    System.out.println("El valor es:" + valor);
                    break; 
                case 3: 
                    String valor2 = pila.peek(); 
                    System.out.println("El valor es " + valor2);
                    break; 
                case 4:
                    int tope = pila.getTope(); 
                    System.out.println("Tope: " + tope);
            }
        }while(opc!=5); 
        
        System.out.println("Fin");
    }
    
    
}
