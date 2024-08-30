
/**
 * Programa que me permite controlar una lista de productos 
 * @author coby_
 * 27 agos
 */
public class ListaBodega {
    
    public static void main(String[] args) {
        Producto lista[] = new Producto[5];
        
        Producto pro1 = new Producto("A001","Coca Cola", 10.00); 
        lista[0] = pro1; 
        
        //--- 
        lista[1] = new Producto("A002", "Papitas", 15.00); 
        
        for (Producto producto : lista) { // foreach
            System.out.println(producto);
        }
        
        System.out.println("orden inverso ");
        
        for(int i = lista.length-1;i>=0;i--){
            System.out.println(lista[i]);
        }
    }
}




