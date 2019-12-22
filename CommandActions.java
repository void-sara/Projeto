/**
 *
 * @author 
 */
public class CommandActions {
    public CommandActions() {
    }

    /**
     * Metodo que valida se o comando recebido é igual a um dos comandos
     * reconhecidos pelo programa. Não é case sensitive.
     *
     * @param command
     * @return
     */
    public boolean isCommand(String command) {
        return (command.equalsIgnoreCase("MYSELF")
                || command.equalsIgnoreCase("SEE")
                || command.equalsIgnoreCase("SEE CHEST")
                || command.equalsIgnoreCase("SEE BAG")
                || command.equalsIgnoreCase("GET PACOTE DE ATAQUE")
                || command.equalsIgnoreCase("GET PACOTE DE DEFESA")
                || command.equalsIgnoreCase("GET PACOTE MONETÁRIO PEQUENO")
                || command.equalsIgnoreCase("GET PACOTE MONETÁRIO MÉDIO")
                || command.equalsIgnoreCase("GET PACOTE MONETÁRIO GRANDE")
                || command.equalsIgnoreCase("GET A CHAVE ESPECIAL")
                || command.equalsIgnoreCase("DROP PACOTE DE ATAQUE")
                || command.equalsIgnoreCase("DROP PACOTE DE DEFESA")
                || command.equalsIgnoreCase("DROP PACOTE MONETÁRIO PEQUENO")
                || command.equalsIgnoreCase("DROP PACOTE MONETÁRIO MÉDIO")
                || command.equalsIgnoreCase("DROP PACOTE MONETÁRIO GRANDE")
                || command.equalsIgnoreCase("DROP A CHAVE ESPECIAL")
                || command.equalsIgnoreCase("MOVE NORTH")
                || command.equalsIgnoreCase("MOVE EAST")
                || command.equalsIgnoreCase("MOVE SOUTH")
                || command.equalsIgnoreCase("MOVE WEST")
                || command.equalsIgnoreCase("ATTACK ALIEN")
                || command.equalsIgnoreCase("ATTACK MONSTER")
                || command.equalsIgnoreCase("USE PACOTE DE ATAQUE")
                || command.equalsIgnoreCase("USE PACOTE DE DEFESA")
                || command.equalsIgnoreCase("USE PACOTE MONETÁRIO PEQUENO")
                || command.equalsIgnoreCase("USE PACOTE MONETÁRIO MÉDIO")
                || command.equalsIgnoreCase("USE PACOTE MONETÁRIO GRANDE")
                || command.equalsIgnoreCase("USE CHAVE ESPECIAL")
                || command.equalsIgnoreCase("SHOW")
                || command.equalsIgnoreCase("HELP")
                || command.equalsIgnoreCase("QUIT"));
    }

    /**
     * Metodo responsavel pela apresentação da listagem de todos os comandos
     * possiveis.
     */
    public void showAllCommands() {
        System.out.println("\nYou can enter one of the following valid actions:"
                + "\n\t> MYSELF"
                + "\n\t> SEE"
                + "\n\t> SEE CHEST"
                + "\n\t> SEE BAG"
                + "\n\t> GET <Nome do Artefacto>"
                + "\n\t> DROP <Nome do Artefacto>"
                + "\n\t> MOVE <Cardinal Point>"
                + "\n\t> ATTACK <Nome do Artefacto>"
                + "\n\t> USE <Nome do Artefacto>"
                + "\n\t> SHOW"
                + "\n\t> HELP"
                + "\n\t> QUIT\n");
    }
}
