/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoritmos;

import java.util.ArrayList;
import projetomissionariosecanibais.Estado;

/**
 *
 * @author Matheus P. Agostinho <mat.matheus.p.agostinho@gmail.com>
 */

public class Largura{

    public Estado buscaLargura(Estado inicial) {
        if(inicial.testeObjetivo()){
            return inicial;
        }
        ArrayList<Estado> fronteira = new ArrayList<>();
        fronteira.add(inicial);
        if(fronteira.isEmpty()){
            return null;
        }
        while(true){
            Estado atual = fronteira.get(0);
            if(atual.testeObjetivo()){
                return atual;
            }else{
                fronteira.addAll(atual.geraSucessores());
                fronteira.remove(0);
            }
        }
    }
    
    public Estado buscaLargura2(Estado inicial) {
        ArrayList<Estado> fronteira = new ArrayList<>();
        fronteira.add(inicial);
        ArrayList<Estado> visitados = new ArrayList<>();
        System.out.println(inicial.toString());
        
        int index = 0;
        while(true){
            if(fronteira.isEmpty()){
                System.out.println("Erro: fila vaiza.");
                return null; //Fila vazia.
            }
            Estado atual = fronteira.get(index); 
            visitados.add(atual);
            ArrayList<Estado> sucessores = new ArrayList<>();
            for(Estado filho : sucessores){
                if(!visitados.contains(filho) || !fronteira.contains(filho)){
                    if(filho.testeObjetivo()){
                        return filho;
                    }
                    fronteira.add(filho);
                }
            }
            if(!atual.testeObjetivo()){
                index++;
            }
        }
    }
    
    
}