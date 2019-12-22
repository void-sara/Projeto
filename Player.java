/**
 * Escreva a descrição da classe Player aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Player{
    private String nickName;
    private Sector currentSector;
    private int attPoints;
    private static int maxAttPoints = 100;
    private int defPoints;
    private static int maxDefPoints = 100;
    private int coins;
    private int exp;
    private Artifact[] bag;
    private int bagWeight;
    private static int maxBagWeight = 2000;
    private int idx;

    public Player(){
        nickName = "";
        currentSector = new Sector("SA-L0", "Descrição:");
        attPoints = 100;
        defPoints = 100;
        exp = 0;
        bag = new Artifact[1];
        bagWeight = 0;
        idx = 0;
    }
    
    /**
     * Método para atribuir um nome ao Player.
     */
    public void setNickName(String newNickName){
        if(newNickName == null || newNickName == ""){
            nickName += "John";
        }else{
            nickName += newNickName;
        }
    }
    
    public String getNickName(){
        return nickName;
    }
    
    public int getAttPoints(){
        return attPoints;
    }
    
    public int getDefPoints(){
        return defPoints;
    }
    
    public int getExp(){
        return exp;
    }
    
    public int getNumberOfArtifacts(){
        int numberOfArtifacts = 0;
        for(int i=0; i<bag.length; ++i){
            if(bag[i] == null){
                numberOfArtifacts += 0;
            }else{
                numberOfArtifacts++;
            } 
        }
        return numberOfArtifacts;
    }
    
    public String getCurrentSector(){
        return currentSector.getIdentification();
    }
    
    public String getCurrentSectorDescription(){
        return currentSector.getDescription();
    }
    
    public int getChestSize(){
        return currentSector.getChestSize();
    }
    
    public int getBagWeight(){
        return bagWeight;
    }
    
    /*
    public Artifact[] getBag(){
        return bag;
    }
    */
   
    /**
     * Método para adicionar um artefacto à Bag.
     */
    public boolean addArtifact(Artifact artifact){
        if(artifact.getWeight() + bagWeight <= 2000){
            bag[idx] = artifact;
            bagWeight += artifact.getWeight();
            idx++;
            if(idx == bag.length){
                growArray();
            }
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Método para remover um artefacto da Bag.
     */
    public boolean removeArtifact(int id){
        if(bag[id] != null){
            bag[id] = null;
            return true;
        }else {
            return false;
        }
    }
    
    /**
     * Método para aumentar o tamanho da Bag.
     */
    private void growArray(){
        Artifact[] a = new Artifact[bag.length + 1];
        for(int i=0; i<bag.length;i++){
            a[i] = bag[i];
        }
        bag = a;
    }
    
    public void consumeArtifact(Artifact artifact){
        if(artifact.getType().equals(ArtifactType.ATTACKPACK)){
            if(attPoints + artifact.getAttPoints() <= maxAttPoints){
                attPoints += artifact.getAttPoints();
            }
        }else if(artifact.getType().equals(ArtifactType.DEFENSEPACK)){
            if(defPoints + artifact.getDefPoints() <= maxDefPoints){
                defPoints += artifact.getDefPoints();
            }
        }else if(artifact.getType().equals(ArtifactType.MONETARYSMALL)){
            coins += artifact.getCoins(); 
        }else if(artifact.getType().equals(ArtifactType.MONETARYMEDIUM)){
            coins += artifact.getCoins();
        }else if(artifact.getType().equals(ArtifactType.MONETARYLARGE)){
            coins += artifact.getCoins();
        }
    }
}
