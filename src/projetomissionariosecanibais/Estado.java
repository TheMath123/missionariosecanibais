/* @Matheus P. Agostinho */

package projetomissionariosecanibais;

public class Estado {
    private int missionario; // 0 a n missionários
    private int canibal; // 0 a n canibais
    private boolean bote; //"false" - Direita / "true" - Esquerda
    private int custo = 0;
    Estado pai = null;//Armazena o estado de origem - Obs.: Caso tiver.
    
    //Remove 1 missionário ou canibal
    public boolean remove1Tipo(boolean tipo){
               Estado temporario = this;
        if(tipo){ //true = missionário
            temporario.setMissionario(temporario.getMissionario()-1);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1 && missionario > 0){
                missionario-=1;
                custo++;
                return true;
            }else{
                return false;
            }
        }else{ //false =canibal
            temporario.setCanibal(temporario.getCanibal()-2);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1 && canibal > 0){
                canibal-=1;
                custo++;
                return true;
            }else{
                return false;
            }
        }
    }

    //Remove 2 missionários ou canibais
    public boolean remove2Tipo(boolean tipo){
        Estado temporario = this;
        if(tipo){ //true = missionário
            temporario.setMissionario(temporario.getMissionario()-2);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1){
                missionario -=2;
                custo++;
                return true;
            }else{
                return false;
            }
        }else{ //false =canibal
            temporario.setCanibal(temporario.getCanibal()-2);
            if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1 && canibal >= 2){
                canibal -=2;
                custo++;
                return true;
            }else{
                return false;
            }
        }
    }

    //Remove 1 de cada
    public boolean remove1Cada(){
        Estado temporario = this;
        temporario.setMissionario(temporario.getMissionario()-1);
        temporario.setCanibal(temporario.getCanibal()-1);
        if(temporario.getCanibal() <= temporario.getMissionario() && canibal <= missionario-1){
            missionario -=1;
            canibal -=1;
            custo++;
            return true;
        }else{
            return false;
        }
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
