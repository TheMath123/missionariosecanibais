/* @Matheus P. Agostinho */

package projetomissionariosecanibais;

import java.util.ArrayList;


public class Busca { //Arvore de busca
    
    Estado estadoInicial;
    Estado estadoObjetivo;
    ArrayList<No> fronteira;
    ArrayList<No> caminho;
    ArrayList<No> nosVisitados;
    int custoTotal;
 
    //Verifica se estado atual é o objetivo.
    public boolean testObjetivo(Estado atual){
        if(atual.equals(estadoObjetivo)){
            return true;
        }else{
            return false;
        }
    }

    //Método construtor
    
    
    //Métodos gets e sets.
    public Estado getEstadoInicial() {
        return estadoInicial;
    }
    public void setEstadoInicial(Estado estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public Estado getEstadoObjetivo() {
        return estadoObjetivo;
    }
    public void setEstadoObjetivo(Estado estadoObjetivo) {
        this.estadoObjetivo = estadoObjetivo;
    }

    public ArrayList<No> getFronteira() {
        return fronteira;
    }
    public void setFronteira(ArrayList<No> fronteira) {
        this.fronteira = fronteira;
    }

    public ArrayList<No> getCaminho() {
        return caminho;
    }
    public void setCaminho(ArrayList<No> caminho) {
        this.caminho = caminho;
    }

    public ArrayList<No> getNosVisitados() {
        return nosVisitados;
    }
    public void setNosVisitados(ArrayList<No> nosVisitados) {
        this.nosVisitados = nosVisitados;
    }

    public int getCustoTotal() {
        return custoTotal;
    }
    public void setCustoTotal(int custoTotal) {
        this.custoTotal = custoTotal;
    }
    
}