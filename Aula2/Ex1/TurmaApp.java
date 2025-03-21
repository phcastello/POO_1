package Aula2.Ex1;

public class TurmaApp {
    public static void main(String[] args) {
        Turma turma0 = new Turma();
        Turma turma1 = new Turma();
        System.out.println("===========================================================");
        turma0.setCurso("Ciência da Computação");
        turma0.setDiciplina("Programação Orientada a Objetos 1");
        turma0.imprimir();
        turma1.setCurso("Agronomia");
        turma1.setDiciplina("Fisiologia Vegetal");
        turma1.imprimir();
    }
}
