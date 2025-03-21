package Aula2.Ex2;

public class Livro {
    private String titulo, autor;

    // Métodos para acessar os atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // Métodos para modificar os atributos
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para imprimir as informações no console
    public void imprimirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("===========================================================");
    }
}
