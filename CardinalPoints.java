/**
 * Enumeration class CardinalPoints - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum CardinalPoints{
    NORTH(1), EAST(2), SOUTH(3), WEST(4);
    
    private final int id;
    
    private CardinalPoints(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
}
