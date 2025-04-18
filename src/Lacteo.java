public class Lacteo extends Producto {
    private int cantidad;
    private int proteinas;

    public Lacteo(int cantidad, int proteinas) {
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    @Override
    public String toString() {
        return super.toString() + "una cantidad de: " + cantidad + " y " + proteinas + " proteinas";
    }
}
