/* @Matheus P. Agostinho */

package projetomissionariosecanibais;

public class Estado {
    private int missionario; // 0 a n missionários
    private int canibal; // 0 a n canibais
    private boolean bote; //"false" - Direita / "true" - Esquerda
    private int custo = 0;
    Estado pai = null;//Armazena o estado de origem - Obs.: Caso tiver.
    
    //Verifica restrição, se pode remover 1 do mesmo tipo de uma margem
    public boolean testeRemove1Tipo(boolean tipo){
               Estado temporario = this;
        if(tipo){ //true = missionário
            temporario.setMissionario(temporario.getMissionario()-1);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1 && missionario > 0){
                return true;
            }else{
                return false;
            }
        }else{ //false =canibal
            temporario.setCanibal(temporario.getCanibal()-1);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1 && canibal > 0){
                return true;
            }else{
                return false;
            }
        }
    }
    //Remove 1 missionário ou canibal
    public void remove1Tipo(boolean tipo){
        if(tipo){ //missionarios
            missionario-=1;
            custo++;
        }else{
            canibal-=1;
            custo++;
        }
    }
    
    //Verifica restrição, se pode remover 2 do mesmo tipo de uma margem
    public boolean testeRemove2Tipo(boolean tipo){
        Estado temporario = this;
        if(tipo){ //true = missionário
            temporario.setMissionario(temporario.getMissionario()-2);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1){
                return true;
            }else{
                return false;
            }
        }else{ //false =canibal
            temporario.setCanibal(temporario.getCanibal()-2);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1 && canibal >= 2){
                return true;
            }else{
                return false;
            }
        }
    }
    //Remove 2 missionários ou canibais
    public void remove2Tipo(boolean tipo){
        if(tipo){ //missionarios
            missionario-=2;
            custo++;
        }else{
            canibal-=2;
            custo++;
        }
    }

    //Verifica restrição, se pode mover 1 de cada tipo
    public boolean testeRemove1Cada(){
        Estado temporario = this;
        temporario.setMissionario(temporario.getMissionario()-1);
        temporario.setCanibal(temporario.getCanibal()-1);
        if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1){
            return true;
        }else{
            return false;
        }
    }
    //Remove 1 de cada
    public void remove1Cada(){
        missionario -=1;
        canibal -=1;
        custo++;
    }

    //Construtor
    public Estado(int missionario, int canibal) { //Construtor inicio
        this.missionario = missionario;
        this.canibal = canibal;
        this.bote = false;
    }
    
    public Estado(int missionario, int canibal, boolean bote){ //Construtor para nó
        this.missionario = missionario;
        this.canibal = canibal;
        this.bote = bote;
    }
    //

    //Métodos gets e sets
    public int getMissionario() {
        return missionario;
    }
    public void setMissionario(int missionario) {
        this.missionario = missionario;
    }

    public int getCanibal() {
        return canibal;
    }
    public void setCanibal(int canibal) {
        this.canibal = canibal;
    }

    public boolean isBote() {
        return bote;
    }
    public void setBote(boolean bote) {
        this.bote = bote;
    }

    public int getCusto() {
        return custo;
    }
    public void setCusto(int custo) {
        this.custo = custo;
    }
    public void custoMove(){ // Soma + 1 ao custo de movimentação.
        custo++;
    }

    public Estado getPai() {
        return pai;
    }
    public void setPai(Estado pai) {
        this.pai = pai;
    }    
    //


    @Override
    public String toString() {
        return "[M: " + missionario + "| C: " + canibal + "| B: " + bote + "]\n";
    }

}
