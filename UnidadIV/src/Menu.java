
import java.util.Scanner;
/**
 * Programa que permite probar los recorridos en los arboles
 * @author coby_
 */
public class Menu {
    static Nodo raiz; 
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc = 0; 
        do {
            System.out.println("Menu");
            System.out.println("1) Agregar");
            System.out.println("2) Modificar");
            System.out.println("3) Preorden");
            System.out.println("4) Inorden");
            System.out.println("5) PostOrden");
            System.out.println("6) Salir");
            System.out.print("Opcion:");
            opc = leer.nextInt(); 
            switch(opc){ 
                case 1: 
                    System.out.println("Dame un numero:");
                    int numero = leer.nextInt(); 
                    Nodo nuevoNodo = new Nodo(); 
                    nuevoNodo.valor = numero; 
                    if(raiz == null)
                        raiz = nuevoNodo; 
                    else 
                        formarElArbol(raiz, nuevoNodo); 
                    break; 
                case 3:
                    System.out.println("Preorden:");
                    preorden(raiz);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Inorden:");
                    inorden(raiz);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Postorden:");
                    postorden(raiz);
                    System.out.println("");
                    break;
            }
        }while(opc!=6); 
        System.out.println("Cerrando aplicacion arbol");
    }
    
    public static void postorden(Nodo carro){
        if(carro!=null){
            postorden(carro.izq); 
            postorden(carro.der);
            System.out.print(carro.valor + " ");
        }
    }
    
    public static void formarElArbol(Nodo base, Nodo nuevoNodo){
        if(nuevoNodo.valor<base.valor){ // izquierda
            if(base.izq == null)
                base.izq = nuevoNodo;
            else 
                formarElArbol(base.izq, nuevoNodo);
        }else {  // derecha  
            if(base.der == null)
                base.der = nuevoNodo;
            else 
                formarElArbol(base.der, nuevoNodo); 
        }
    }
    public static void inorden(Nodo carro){
        if(carro!=null){
            inorden(carro.izq);
            System.out.print( carro.valor + " ");
            inorden(carro.der); 
        }
    }
    
    
    public static void preorden(Nodo carro){
        if(carro!=null){
            System.out.print(carro.valor + " ");
            preorden(carro.izq); 
            preorden(carro.der); 
        }
    }
       
}













