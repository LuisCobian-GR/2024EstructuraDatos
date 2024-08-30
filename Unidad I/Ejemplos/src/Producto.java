
/**
 * Clase que me permite almacenar datos de producto 
 * @author coby_
 * 27-Ago 
 */
public class Producto {
    
    String codigoBarras; 
    String nombre;
    double precio; 
    boolean disponible; 
    int existencias; 

    public Producto(String codigo, String nombre, double precio) {
        codigoBarras = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoBarras=" + codigoBarras 
                + ", nombre=" + nombre + ", precio=" 
                + precio + 
                ", existencias=" + existencias + '}';
    }
    
    
    
}
