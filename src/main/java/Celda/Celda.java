package Celda;

public class Celda {
    private String indetificador;
    private int valor;
    public Celda(String _identificador, int _valor){
        this.indetificador=_identificador;
        this.valor=_valor;
    }

    public String getIndetificador() {
        return indetificador;
    }

    public void setIndetificador(String indetificador) {
        this.indetificador = indetificador;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
