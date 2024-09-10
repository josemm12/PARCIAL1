public class Novela extends Libro{
    String tipo;

    public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

    public void imprimir() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Autor: " + autor);
        System.out.println("titulo: " + titulo);
    }
}
