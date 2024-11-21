package Ejercicio1;

public class Libro {
    
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(){
        this.titulo = "El principito";
        this.autor = "Exupery";
        this.numeroPaginas = 120;
        
    }
    public Libro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        
    }

    @Override
    public String toString() {
        return "Datos del libro: Titulo: " + titulo + ", autor: " + autor + " numero de paginas " + numeroPaginas;
    }

}
