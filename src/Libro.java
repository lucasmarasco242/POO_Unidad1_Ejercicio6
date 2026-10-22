public class Libro {
    String titulo;
    String autor;
    int paginasTotales;
    int paginaActual;


    public Libro(String titulo, String autor, int paginasTotales) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginasTotales = paginasTotales;
        this.paginaActual = 0;
    }


    public void leer(int paginas) {
        this.paginaActual = this.paginaActual + paginas;

        if (this.paginaActual >= this.paginasTotales) {
            this.paginaActual = this.paginasTotales;
            System.out.println("¡Su lectura ha finalizado!");
        }
    }

    public void mostrarProgreso(){

        double porcentaje = ((double) this.paginaActual / this.paginasTotales) * 100;

        System.out.println("--- PROGRESO DE LECTURA ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas leídas: " + this.paginaActual + " de " + this.paginasTotales);
        System.out.println("Porcentaje completado: " + porcentaje + "%");
    }
}


