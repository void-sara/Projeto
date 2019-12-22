import java.util.Scanner;
/**
 * Escreva a descrição da classe Game aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Game{
    private Parser parser;
    private Player player;
    private Scanner reader;

    public Game(){
        parser = new Parser();
        player = new Player();
        reader = new Scanner(System.in);
    }
    
    public void play(){
        welcome();
        CommandProcessor cp = new CommandProcessor();
        cp.start();
    }
    
    public void welcome(){
        String inputLine = "";
        System.out.println("Bem vindo, insira o seu nome!");
        System.out.print("> ");
        inputLine = reader.nextLine();
        player.setNickName(inputLine);
        System.out.println("Hello, " + player.getNickName() + "\n");
        System.out.println("Welcome to Planet Escape \n");
        System.out.println("Your goals are to find the Key and the Vault, use the Key on the Vault to collect the fuel, and escape in the spaceship. \n");
        System.out.println("You are in: " + player.getCurrentSector());
    }
}
