
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Fruta  fruta1 = new Fruta("fresa", 10.5, 10, "rojo" );
        Fruta  fruta2 = new Fruta("melocoton", 11.5, 20, "naranja" );
        Lacteo lacteo1 = new Lacteo("leche", 15,1,30);
        Lacteo lacteo2 = new Lacteo("queso", 19,2,60);
        NoPerecedero noPerecedero1 = new NoPerecedero("galletas", 20.5, 50,30);
        NoPerecedero noPerecedero2 = new NoPerecedero("atun en conserva", 22.5, 70,3);
        Limpieza limpieza1 = new Limpieza("fairy",5,"friega platos",1);
        Limpieza limpieza2 = new Limpieza("lejia",6,"lejia",5);




        productos.add(fruta1);
        productos.add(fruta2);
        productos.add(lacteo1);
        productos.add(lacteo2);
        productos.add(noPerecedero1);
        productos.add(noPerecedero2);
        productos.add(limpieza1);
        productos.add(limpieza2);
        for (Producto a :productos){
            System.out.println(a.toString());
        }
    }

}