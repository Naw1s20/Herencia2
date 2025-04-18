public class Limpieza extends Producto {
    private String componentes;
    private double litros;

    public Limpieza(String componentes, double litros) {
        this.componentes = componentes;
        this.litros = litros;
    }

    public Limpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    @Override
    public String toString() {
        return super.toString() +
                " con unos componentes: " + componentes +
                " y " + litros + " litros";

    }
}
