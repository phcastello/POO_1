package Aula2.Ex1;

public class Turma{
    private String curso, diciplina;

    public String getCurso(){
        return curso;
    }

    public String getDiciplina(){
        return diciplina;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setDiciplina(String diciplina){
        this.diciplina = diciplina;
    }

    public void imprimir(){
        System.out.println("Curso: " + curso);
        System.out.println("Diciplina: " + diciplina);
        System.out.println("===========================================================");
    }
}