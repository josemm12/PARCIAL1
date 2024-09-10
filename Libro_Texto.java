public class Libro_Texto extends Libro {
    int curso;

    public Libro_Texto (String titulo, String autor, int curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }



    public void setCurso(int curso) {
        this.curso = curso;
    }


    public void imprimir(){
        System.out.println("Titulos: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Curso: " + curso);
    }


}
