/**
 * Escreva a descrição da classe Artifact aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Artifact{
    private String name;
    private ArtifactType type;
    private int attPoints;
    private int defPoints;
    private int weight;
    private int coins;
    private int exp;
    private Generator generator;
    
    public Artifact(String name, ArtifactType type){ 
        generator = new Generator();
        if(type == ArtifactType.ATTACKPACK){
            this.name = type.getName();
            this.type = type;
            attPoints = generator.randomAttPack();
            defPoints = 0;
            weight = type.getWeight();
            coins = type.getCoins();
            exp = 0;
        }else if(type == ArtifactType.DEFENSEPACK){
            this.name = type.getName();
            this.type = type;
            attPoints = 0;
            defPoints = generator.randomDefPack();
            weight = type.getWeight();
            coins = type.getCoins();
            exp = 0;
        }else if(type == ArtifactType.MONSTER){
            this.name = type.getName();
            this.type = type;
            attPoints = generator.randomAttPack();
            defPoints = generator.randomDefPack();
            weight = type.getWeight();
            coins = type.getCoins();
            exp = generator.randomMonsterExp();
        }else if(type == ArtifactType.ALIEN){
            this.name = type.getName();
            this.type = type;
            attPoints = generator.randomAlienAttDef();
            defPoints = generator.randomAlienAttDef();
            weight = type.getWeight();
            coins = type.getCoins();
            exp = generator.randomAlienExp();
        }else if(type == ArtifactType.MONETARYSMALL){
            this.name = type.getName();
            this.type = type;
            attPoints = 0;
            defPoints = 0;
            weight = type.getWeight();
            coins = type.getCoins();
            exp = 1;
        }else if(type == ArtifactType.MONETARYMEDIUM){
            this.name = type.getName();
            this.type = type;
            attPoints = 0;
            defPoints = 0;
            weight = type.getWeight();
            coins = type.getCoins();
            exp = 2;
        }else if(type == ArtifactType.MONETARYLARGE){
            this.name = type.getName();
            this.type = type;
            attPoints = 0;
            defPoints = 0;
            weight = type.getWeight();
            coins = type.getCoins();
            exp = 3;
        }else{}
    }
    
    public String getName(){
        return name;
    }
    
    public ArtifactType getType(){
        return type;
    }
    
    public int getAttPoints(){
        return attPoints;
    }
    
    public int getDefPoints(){
        return defPoints;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public int getCoins(){
        return coins;
    }
    
    public int getExp(){
        return exp;
    }
}
