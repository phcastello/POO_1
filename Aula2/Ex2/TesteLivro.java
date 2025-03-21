package Aula2.Ex2;

public class TesteLivro {
    public static void main(String[] args) {
        // Criando o primeiro livro
        Livro livro1 = new Livro();
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        
        // Criando o segundo livro
        Livro livro2 = new Livro();
        livro2.setTitulo("1984");
        livro2.setAutor("George Orwell");
        
        // Criando o terceiro livro
        Livro livro3 = new Livro();
        livro3.setTitulo("O Pequeno Príncipe");
        livro3.setAutor("Antoine de Saint-Exupéry");
        
        // Imprimindo informações dos livros
        System.out.println("Informações dos livros cadastrados:");
        System.out.println("===========================================================");
        
        livro1.imprimirInformacoes();
        livro2.imprimirInformacoes();
        livro3.imprimirInformacoes();
        
        // Testando os getters
        System.out.println("Teste dos métodos getters:");
        System.out.println("===========================================================");
        System.out.println("Livro 1 - Título: " + livro1.getTitulo() + ", Autor: " + livro1.getAutor());
        System.out.println("Livro 2 - Título: " + livro2.getTitulo() + ", Autor: " + livro2.getAutor());
        System.out.println("Livro 3 - Título: " + livro3.getTitulo() + ", Autor: " + livro3.getAutor());
    }
}
