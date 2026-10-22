//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro milibro = new Libro("El Mentalista","Lucas", 500);

        milibro.leer(200);
        milibro.mostrarProgreso();
    }
}