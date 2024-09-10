public class Libro_Camacho extends Libro{
    String facultad;
  

    public Libro_Camacho(String titulo, String autor, String facultad) {
        super(titulo, autor);
        this.facultad =facultad;
    }

    public void imprimir () {
        System.out.println("Facultad: " + facultad);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
