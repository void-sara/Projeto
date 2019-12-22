/**
 * Escreva a descrição da classe Sector aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Sector{
    private String identification;
    private String description;
    private Sector[] exits;
    private Artifact[] chest;
    private int idx;
    private SectorReader sectorReader;
    private Generator generator;

    public Sector(String identification, String description){
        this.identification = identification;
        this.description = description;
        exits = new Sector[4];
        setExit(CardinalPoints.EAST, this);
        chest = new Artifact[5];
        idx = 0;
        sectorReader = new SectorReader();
        generator = new Generator();
    }
    
    private Sector setExit(CardinalPoints cp, Sector sector){
        exits[cp.NORTH.getId()] = sector;
        return sector;
    }
    
    public String getIdentification(){
        return identification;
    }
    
    public String getDescription(){
        return description;
    }
    
    public Sector[] getExits(){
        return exits;
    }
    
    public Artifact[] getChest(){
        return chest;
    }
    
    public int getChestSize(){
        int numberOfArtifacts = 0;
        for(int i=0; i<chest.length; ++i){
            if(chest[i] == null){
                numberOfArtifacts += 0;
            }else{
                numberOfArtifacts++;
            } 
        }
        return numberOfArtifacts;
    }
    
    public boolean removeArtifact(int id){
        chest[id] = null;
        return true;
    }
    
    public void fillChest(){
        for(int i=0; i < chest.length; ++i){
            chest[i] = generator.randomArtifact();
        }
    }
    
    //add, remove e search artifact
    //getEnemies(){}
}
