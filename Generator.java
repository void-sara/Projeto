import java.util.Random;
/**
 * Escreva a descrição da classe Generator aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Generator{
    private int min;
    private int max;
    private ArtifactType artifactType;
    
    public Generator(){
        min = 0;
        max = 0;
        artifactType = null;
    }
    
    /**
     * Método para gerar um número aleaório de pontos de ataque.
     */
    public int randomAttPack(){
        min = ArtifactType.ATTACKPACK.getMinAttPoints();
        max = ArtifactType.ATTACKPACK.getMaxAttPoints();
        Random randomValue = new Random();
        return randomValue.nextInt(max - min + 1) + min;
    }
    
    /**
     * Método para gerar um número aleatório de pontos de defesa.
     */
    public int randomDefPack(){
        min = ArtifactType.DEFENSEPACK.getMinDefPoints();
        max = ArtifactType.DEFENSEPACK.getMaxDefPoints();
        Random randomValue = new Random();
        return randomValue.nextInt(max - min + 1) + min;
    }
    
    /**
     * Método para gerar um número aleatório de pontos de experiência.
     */
    public int randomMonsterExp(){
        min = ArtifactType.MONSTER.getMinExp();
        max = ArtifactType.MONSTER.getMaxExp();
        Random randomValue = new Random();
        return randomValue.nextInt(max - min + 1) + min;
    }
    
    public int randomAlienAttDef(){
        min = ArtifactType.ALIEN.getMinAttPoints();
        max = ArtifactType.ALIEN.getMaxAttPoints();
        Random randomValue = new Random();
        return randomValue.nextInt(max - min + 1) + min;
    }
    
    public int randomAlienExp(){
        min = ArtifactType.ALIEN.getMinExp();
        max = ArtifactType.ALIEN.getMaxExp();
        Random randomValue = new Random();
        return randomValue.nextInt(max - min + 1) + min;
    }

    public Artifact randomArtifact(){
        int rv = 0;
        Random randomValue = new Random();
        rv += randomValue.nextInt(8);
        if(rv == 0){
            Artifact art = new Artifact("Pacote de Ataque", ArtifactType.ATTACKPACK);
            artifactType = ArtifactType.ATTACKPACK;
            return art;
        }else if(rv == 1){
            Artifact art1 = new Artifact("Pacote de Defesa", ArtifactType.DEFENSEPACK);
            artifactType = ArtifactType.DEFENSEPACK;
            return art1;
        }else if(rv == 2){
            Artifact art2 = new Artifact("Monstro intergalático", ArtifactType.MONSTER);
            artifactType = ArtifactType.MONSTER;
            return art2;
        }else if(rv == 3){
            Artifact art3 = new Artifact("Alienígena", ArtifactType.ALIEN);
            artifactType = ArtifactType.ALIEN;
            return art3;
        }else if(rv == 4){
            Artifact art4 = new Artifact("Pacote Monetário - Pequeno", ArtifactType.MONETARYSMALL);
            artifactType = ArtifactType.MONETARYSMALL;
            return art4;
        }else if(rv == 5){
            Artifact art5 = new Artifact("Pacote Monetário - Médio", ArtifactType.MONETARYMEDIUM);
            artifactType = ArtifactType.MONETARYMEDIUM;
            return art5;
        }else if(rv == 6){
            Artifact art6 = new Artifact("Pacote Monetário - Grande", ArtifactType.MONETARYLARGE);
            artifactType = ArtifactType.MONETARYLARGE;
            return art6;
        }else{
            artifactType = null;
            return null;
        }
    }
}
