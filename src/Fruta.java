public class Fruta extends Producto {
    private double peso;
    private String color;

    public Fruta(double peso, String color) {
        this.peso = peso;
        this.color = color;
    }

    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    @Override
    public String toString() {

        return
        super.toString() + "con un peso de: "  +
                 peso +
                " y de color " + color;
    }
}
