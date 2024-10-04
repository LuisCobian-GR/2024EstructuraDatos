/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respuestas;

/**
 *
 * @author coby_
 */
public class Pregunta8P3 {
    public static void main(String[] args) {
        imprimeOrden(6); 
        int j[] = {3,4,5}; 
        int x = 10; 
        var y = 10; 
        System.out.println("Numero de elementos " + j.length);
    }
    
    public static void imprimeOrden(int n){
        
        if(n > 0) imprimeOrden(n-1); // caso para detener
       System.out.println(n);
    }
}
