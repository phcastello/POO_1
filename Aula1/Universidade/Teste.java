package Aula1.Universidade;

public class Teste {
    public static void main(String[] args) {
        Universidade universidade1 = new Universidade();
        Aluno aluno1 = new Aluno();
        universidade1.nome = "Unicentro";
        universidade1.estado = "PR";
        universidade1.cidade = "Guarapuava";
        aluno1.nome = "Pedro Castello";
        aluno1.curso = "Ciência da Computação";
        universidade1.exibeDados();
        aluno1.exibeDados();
    }
}
