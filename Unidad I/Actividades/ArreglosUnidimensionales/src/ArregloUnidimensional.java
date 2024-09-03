
import java.util.Scanner;

/**
 * Programa que me permite enlistar de manera natural o inversa una serie de productos 
 * @author coby_
 * 30 -ago 
 */
public class ArregloUnidimensional {
    
    public static void main(String[] args) {
        // pasos para hacer el ejercicio 
        // 1) hacer el menu 
        // 2) hacer la carga de datos 
        // 3) mostrar los datos en orden natural 
        // 4) mostrar los datos en orden inverso 
        Scanner sc = new Scanner(System.in); 
        int op = 0; 
        //// arreglo con los productos 
        Producto lista[] = new Producto[10]; 
        do{
            System.out.println("  MENU ");
            System.out.println("1) Cargar Datos");
            System.out.println("2) Mostrar productos");
            System.out.println("3) Mostrar productos en orden inverso");
            System.out.println("4) Salir");
            op = Integer.parseInt(sc.nextLine()); 
            switch(op){
                case 1: 
                    lista  = cargarValores(); 
                    break; 
                case 2: 
                    System.out.println(lista[0]);
                    System.out.println("Orden natural");
                    break; 
                case 3: 
                    System.out.println("Orden inverso");
                    break; 
                case 4: 
                    System.out.println("Salir");
                    break; 
                default: 
                    System.out.println("Opción invalida");
            } // switch 
        }while(op != 4); 
    }
    
    /**
     * Metodo que me permite pedir los valores de la lista
     */
    static Producto[] cargarValores(){ // declaracion 
        System.out.println("Cargar datos");
        Producto lista[] = new Producto[10]; 
        Scanner sc = new Scanner(System.in); 
        for (int i = 0; i < 10; i++) {
            System.out.print("Codigo:");
            String codigo = sc.nextLine(); 
            System.out.print("Nombre:");
            String nombre = sc.nextLine(); 
            System.out.print("Precio:");
            double precio = Double.parseDouble(sc.nextLine());
            lista[i] = new Producto(codigo, nombre, precio);
        }
        return lista;
    }
    
}
