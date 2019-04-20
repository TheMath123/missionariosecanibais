/* @Matheus P. Agostinho */

package projetomissionariosecanibais;

import java.util.ArrayList;


public class Busca { //Arvore de busca
    
    Estado estadoInicial;
    Estado estadoObjetivo;
    ArrayList<Estado> fronteira;
    ArrayList<Estado> caminho;
    ArrayList<Estado> nosVisitados;
    int custoTotal = 0;
    
    //Coloca nó na fronteira
    public void colocaFronteira(Estado atual){
        if(atual.remove1Cada()){
            atual.remove1Cada();
            atual.setCusto(atual.getCusto()+1);
            atual.setBote(true);
            fronteira.add(atual);
            System.out.println(toString());
        }
        if(atual.remove1Tipo(true)){
            atual.remove1Tipo(true);
            atual.setCusto(atual.getCusto()+1);
            atual.setBote(true);
            fronteira.add(atual);
            System.out.println(toString());
        }
        if(atual.remove1Tipo(false)){
            atual.remove1Tipo(false);
            atual.setCusto(atual.getCusto()+1);
            atual.setBote(true);
            fronteira.add(atual);
            System.out.println(toString());
        }
        if(atual.remove2Tipo(true)){
            atual.remove2Tipo(true);
            atual.setCusto(atual.getCusto()+1);
            atual.setBote(true);
            fronteira.add(atual);
            System.out.println(toString());
        }
        if(atual.remove2Tipo(false)){
            atual.remove2Tipo(false);
            atual.setCusto(atual.getCusto()+1);
            atual.setBote(true);
            fronteira.add(atual);
            System.out.println(toString());
        }
    }
 
    //Verifica se estado atual é o objetivo.
    public boolean testObjetivo(Estado atual){
        if(atual.equals(estadoObjetivo)){
            return true;
        }else{
            return false;
        }
    }

    //Método construtor
    public Busca(Estado estadoInicial) {
        this.estadoInicial = estadoInicial;
        fronteira.add(estadoInicial);
        this.estadoObjetivo = new Estado(0, 0, true);
    }
    
}