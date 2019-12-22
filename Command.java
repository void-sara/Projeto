/**
 * Classe que representa um comando introduzido pelo utilizador
 *
 * @author joao.capinha
 */
public class Command {
    private final String firstWord;
    private final String secondWord;
    //private final String thirdWord;

    public Command(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
        //this.thirdWord = thirdWord;
    }

    public String getFirstWord() {
        return firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }
    
    /*
    public String getThirdWord(){
        return thirdWord;
    }
    */
   
    public boolean isUnknown() {
        return ("".equals(firstWord));
    }

    public boolean hasSecondWord() {
        return (!"".equals(secondWord));
    }
    /*
    public boolean hasThirdWord(){
        return (!"".equals(thirdWord));
    }
    */
}
