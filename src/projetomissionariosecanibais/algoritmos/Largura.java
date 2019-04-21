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
        Estado reconstrucao = null;
        
        ArrayList<Estado> fronteira = new ArrayList<>();
        fronteira.add(inicial);
        boolean margem = true; //true = esquerda e false=direita
        
        //Criar os nós acionam na fronteira de busca
        while(fronteira.size() > 0){ 
            Estado atual = fronteira.get(0);
            fronteira.remove(0); 
            if(testeObjetivo(atual)){
                objetivo = atual;
                caminho.add(atual);
                break;
            }else{
                //Verificar margem atual e proxima margem no obj estado
                if(atual.testeRemove1Cada()){ //Cra um novo nó de movimentação de um canibal e um missionario 
                    Estado novo = atual;
                    novo.setPai(atual); //Seta o nó atual como pai
                    novo.remove1Cada(margem); //realiza a movimentação
                    fronteira.add(novo); //adiciona o novo nó a fronteira de busca
                }
                if(atual.testeRemove1Tipo(true)){ //Cria um nó de movimentação de um missionario 
                    Estado novo = atual;
                    novo.setPai(atual);
                    novo.remove1Tipo(true, margem);
                    fronteira.add(novo);
                }
                if(atual.testeRemove1Tipo(false)){ //Cria um nó de movimentação de um canibal
                    Estado novo = atual;
                    novo.setPai(atual);
                    novo.remove1Tipo(false, margem);
                    fronteira.add(novo);
                }
                if(atual.testeRemove2Tipo(true)){ //Cria um nó de movimentação de dois missionarios
                    Estado novo = atual;
                    novo.setPai(atual);
                    novo.remove2Tipo(true, margem);
                    fronteira.add(novo);
                }
                if(atual.testeRemove2Tipo(false)){ //Cria um nó de movimentação de dois canibais
                    Estado novo = atual;
                    novo.setPai(atual);
                    novo.remove2Tipo(false, margem);
                    fronteira.add(novo);
                }
            }
            
            //Altera a margem
            if(margem){ 
                margem = false;
            }else{
                margem = true;
            }
        }
        
        //Reconstrução do caminho
        if(objetivo != null){
            boolean sair = false;
            reconstrucao = objetivo.getPai();
            while(sair != true){                
                if(reconstrucao == null){
                    sair = true;
                }else{
                    Estado novo = reconstrucao;
                    caminho.add(novo);
                    reconstrucao = novo.getPai();
                }
            }
            System.out.println("Encoontrei!");
            return true;
        }else{
            System.out.println("Não descobri a solução!");
            return false;
        }
    }
}
