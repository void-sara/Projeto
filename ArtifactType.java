/**
 * Enumeration class ArtifactType - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ArtifactType{
    ATTACKPACK("Pacote de Ataque", "Attack Pack", 50, 100, 0, 0, 200, 0, 0, 0),  
    DEFENSEPACK("Pacote de Defesa", "Defense Pack", 0, 0, 50, 100, 200, 0, 0, 0), 
    MONSTER("Monstro intergalático", "Monster", 50, 100, 50, 100, 0, 0, 3, 4),
    ALIEN("Alienígena", "Alien", 20, 50, 20, 50, 0, 0, 1, 2),
    MONETARYSMALL("Pacote Monetário - Pequeno", "Monetary Small", 0, 0, 0, 0, 100, 10, 1, 1),
    MONETARYMEDIUM("Pacote Monetário - Médio", "Monetary Medium", 0, 0, 0, 0, 200, 20, 2, 2),
    MONETARYLARGE("Pacote Monetário - Grande", "Monetary Large", 0, 0, 0, 0, 300, 30, 3, 3),
    KEY("A Chave (especial)", "Key", 0, 0, 0, 0, 100, 0, 0, 0),
    VAULT("O Cofre (especial)", "Vault", 0, 0, 0, 0, 0, 0, 0, 0);
    
    private String name;
    private String type;
    private int minAttPoints;
    private int maxAttPoints;
    private int minDefPoints;
    private int maxDefPoints;
    private int weight;
    private int coins;
    private int minExp;
    private int maxExp;
    
    private ArtifactType(String name, String type, int minAttPoints, int maxAttPoints, int minDefPoints, int maxDefPoints, int weight, int coins, int minExp, int maxExp){
        this.name = name;
        this.type = type;
        this.minAttPoints = minAttPoints;
        this.maxAttPoints = maxAttPoints;
        this.minDefPoints = minDefPoints;
        this.maxDefPoints = maxDefPoints;
        this.weight = weight;
        this.coins = coins;
        this.minExp = minExp;
        this.maxExp = maxExp;
    }
    
    public String getName(){
        return name;
    }
    
    public String getType(){
        return type;
    }
    
    public int getMinAttPoints(){
        return minAttPoints;
    }
    
    public int getMaxAttPoints(){
        return maxAttPoints;
    }
    
    public int getMinDefPoints(){
        return minDefPoints;
    }
    
    public int getMaxDefPoints(){
        return maxDefPoints;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public int getCoins(){
        return coins;
    }
    
    public int getMinExp(){
        return minExp;
    }
    
    public int getMaxExp(){
        return maxExp;
    }
}
