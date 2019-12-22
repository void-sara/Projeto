/**
 * Escreva a descrição da classe Assistant aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CommandProcessor{
    private Parser parser;
    private Command command;
    private Player player;

    public CommandProcessor(){
        parser = new Parser();
        player = new Player();
    }
    
    public void start(){
        boolean done;
        done=false;
        while(!done){ 
            Command command = parser.getCommand();
            done = processCommand(command);
        }
    }
    
    /**
     * Método para processar os comandos inseridos pelo utilizador
     */
    private boolean processCommand(Command command){        
        boolean wantToQuit = false;
        if(command.isUnknown()){
            System.out.println("\n That command is not available... Use Help to see all commands...\n");
            return false;
        }else if(command.getFirstWord().equalsIgnoreCase("Myself")){
            myself();
            return false;
        }else if(command.getFirstWord().equalsIgnoreCase("See")){
            if(command.hasSecondWord()){
                if(command.getSecondWord().equalsIgnoreCase("Chest")){
                    seeChest();
                    return false;
                }else if(command.getSecondWord().equalsIgnoreCase("Bag")){
                    seeBag();
                    return false;
                }
            }else{
                see();
                return false;
            }
        }else if(command.getFirstWord().equalsIgnoreCase("Help")){
            CommandActions commandActions = new CommandActions();
            commandActions.showAllCommands();
            return false;
        }else if(command.getFirstWord().equalsIgnoreCase("Quit")){
            wantToQuit = true;
        }
        return wantToQuit;
    }
    
    private void myself(){
        System.out.println("Hello, " + player.getNickName() + "\n");
        System.out.println("Your status are:");
        System.out.println("Attack Points: " + player.getAttPoints());
        System.out.println("Defence Points: " + player.getDefPoints());
        System.out.println("Experience: " + player.getExp() + "\n");
        System.out.println("Your Bag has " + player.getNumberOfArtifacts() + " Artifacts. \n");
    }
    
    public void see(){
        System.out.println("\nYou are in: " + player.getCurrentSector() + "\n");
        System.out.println(player.getCurrentSectorDescription());
        System.out.println("There is a chest with " + player.getChestSize() + " artifacts. \n");
        //Mostrar as saídas
    }
    
    public void seeChest(){
        System.out.println("\nYou are in: " + player.getCurrentSector() + "\n");
        if(player.getChestSize() == 0){
            System.out.println("There is a chest with 0 artifacts. \n");
        }else{
            System.out.println("There is a chest with " + player.getChestSize() + " artifacts. \n");
            //Percorrer Array para mostrar todos os artifactos
        }
    }
    
    public void seeBag(){
        if(player.getNumberOfArtifacts() == 0){
            System.out.println("\nYour Bag has 0 Artifacts. \n");
        }else{
            System.out.println("\nYour Bag has " + player.getNumberOfArtifacts() + " Artifacts \n");
            for(int i=0; i<player.getNumberOfArtifacts(); ++i){
                System.out.println("1 - \n");
            }
            System.out.println("Total weight of the bag: " + player.getBagWeight());
        }
    }
    
    //public void getAttackPack(){}
    
    /*
    private void processAction(String action){
        String actionReceived = action.trim().toUpperCase();
        if(actionReceived.equals("TIME")){
            timeInfo.showTime();
        }else if(actionReceived.equals("DATE")){
            timeInfo.showDate();
        }else if(actionReceived.equals("WEEKDAY")){
            timeInfo.showDayOfWeek();
        }else{
            System.out.println("\n Invalid Option \n");
        }
    }
    */
}