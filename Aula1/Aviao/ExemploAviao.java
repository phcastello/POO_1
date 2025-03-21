package Aula1.Aviao;

public class ExemploAviao {
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao();
        aviao1.fabricante = "Boeing";
        aviao1.modelo = "777";
        aviao1.qtdAssentos = 368;
        aviao1.ligar();
    }
}
