public class Producto {
    private String nombre;
    private double precio;


    public Producto() {
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El nombre del producto es: "
                 + nombre +
                "con un precio de: "+ precio;
    }
}
