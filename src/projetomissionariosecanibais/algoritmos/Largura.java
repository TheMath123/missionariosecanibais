/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetomissionariosecanibais.algoritmos;

import java.util.ArrayList;
import projetomissionariosecanibais.Estado;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Largura extends Busca{

    public Largura(Estado estadoInicial) {
        super(estadoInicial);
    }

    public boolean buscarCaminho(Estado inicial) {
        Estado objetivo = null;
        Boolean sair = true;
        
        ArrayList<Estado> fronteira = new ArrayList<>();
        fronteira.add(inicial);
        boolean margem = true; //true = esquerda e false=direita
        
        //Criar os nós acionam na fronteira de busca
        while(sair){ 
            for (int i = 0; i < fronteira.size(); i++) {
                Estado atual = fronteira.get(i);
                if(atual.testeRemove1Cada()){ //Cra um novo nó de movimentação de um canibal e um missionario 
                    Estado novo = atual;
                    novo.setPai(novo); //Seta o nó atual como pai
                    novo.remove1Cada(); //realiza a movimentação
                    novo.custoMove(); //soma +1 a custo da movimentação
                    novo.setBote(margem); //adiona a margem atual do bole
                    fronteira.add(novo); //adiciona o novo nó a fronteira de busca
                    if(testeObjetivo(novo)){
                        objetivo = novo;
                        break;
                    }
                }
                if(atual.testeRemove1Tipo(true)){ //Cria um nó de movimentação de um missionario 
                    Estado novo = atual;
                    novo.setPai(novo);
                    novo.remove1Tipo(true);
                    novo.custoMove();
                    novo.setBote(margem);
                    fronteira.add(novo);
                    if(testeObjetivo(novo)){
                        objetivo = novo;
                        break;
                    }
                }
                if(atual.testeRemove1Tipo(false)){ //Cria um nó de movimentação de um canibal
                    Estado novo = atual;
                    novo.setPai(novo);
                    atual.remove1Tipo(false);
                    novo.custoMove();
                    atual.setBote(margem);
                    fronteira.add(novo);
                    if(testeObjetivo(novo)){
                        objetivo = novo;
                        break;
                    }
                }
                if(atual.testeRemove2Tipo(true)){ //Cria um nó de movimentação de dois missionarios
                    Estado novo = atual;
                    novo.setPai(novo);
                    novo.remove2Tipo(true);
                    novo.custoMove();
                    novo.setBote(margem);
                    fronteira.add(novo);
                    if(testeObjetivo(novo)){
                        objetivo = novo;
                        break;
                    }
                }
                if(atual.testeRemove2Tipo(false)){ //Cria um nó de movimentação de dois canibais
                    Estado novo = atual;
                    novo.setPai(novo);
                    novo.remove2Tipo(false);
                    novo.custoMove();
                    novo.setBote(margem);
                    fronteira.add(novo);
                    if(testeObjetivo(novo)){
                        objetivo = novo;
                        break;
                    }
                }
                fronteira.remove(i);
            }
            
            //Altera a margem
            if(margem){ 
                margem = false;
            }else{
                margem = true;
            }
        }
        
        //Reconstrução do caminho
        return false;
    }
}
