package Celda;

public class Celda{
    private String valorString;
    private String indetificador;
    private Object valor;

    public Celda(String _identificador, Object _valor){
        this.indetificador=_identificador;
        this.valor=_valor;
    }

    public String getIndetificador() {
        return indetificador;
    }

    public void setIndetificador(String indetificador) {
        this.indetificador = indetificador;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
}
