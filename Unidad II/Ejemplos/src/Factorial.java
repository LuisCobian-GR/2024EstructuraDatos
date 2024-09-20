
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author coby_
 */

public class Factorial {
    public static void main(String[] args) { 
    Scanner leer=new Scanner(System.in);    
    System.out.println("Ingrese un numero");
        int entero = leer.nextInt();
    
        int v = Factorial(entero);
    System.out.println(v);
}       
public static int Factorial (int n){
    if (n==0) return 1;
    else
       return n*Factorial(n-1);
}

}
