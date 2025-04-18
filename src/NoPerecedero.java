public class NoPerecedero extends Producto{
    private int kcal;
    private int contenido;

    public NoPerecedero(int kcal, int contenido) {
        this.kcal = kcal;
        this.contenido = contenido;
    }

    public NoPerecedero(String nombre, double precio, int kcal, int contenido) {
        super(nombre, precio);
        this.kcal = kcal;
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return super.toString() +  " con " + kcal +
                " kcal y " +
                 + contenido + " paquete/s";

    }
}
