/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2;

/**
 *
 * @author coby_
 */
public class Unidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Operaciones obj = new Operaciones();
    String recibi = obj.saludoMayus("Luis");
    System.out.println(recibi);
         int numeroIncrementado=obj.incrementar(10);
    System.out.println(numeroIncrementado);
         int suma=obj.sumar(5,12);
    System.out.println(suma);
         suma=obj.sumar(5,12,5);
    System.out.println(suma);
    }
        
    
}
