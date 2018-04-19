import Celda.Celda;

import java.util.ArrayList;
import java.util.List;

public class SpredSheet {
    private List<Celda> celdas=new ArrayList<Celda>();

    public void set(String _identidicador, int _valor) {
        celdas.add(new Celda(_identidicador,_valor));
    }

    public void set(String _identidicador, String _valor) {
        celdas.add(new Celda(_identidicador,_valor));
    }

    public Object get(String _identificador) {
        for(Celda celda:celdas){
            if(celda.getIndetificador().equals(_identificador)){
                return celda.getValor();
            }
        }
        return null;
    }
}
