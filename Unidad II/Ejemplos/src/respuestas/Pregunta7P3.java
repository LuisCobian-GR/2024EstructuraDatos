/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respuestas;

/**
 *
 * @author coby_
 */
public class Pregunta7P3 {
    public static void main(String[] args) {
        System.out.println(getNumeroMenor(1,4,2));
    }
    
    public static int getNumeroMenor(int n1, int n2, int n3){
        if(n1<n2 && n1<n3) return n1;
        else if(n2<n3) return n2;
        else return n3;  
    }
}
