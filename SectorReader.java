import java.util.StringTokenizer;
import readfile.ReadFile;
/**
 * Escreva a descrição da classe SectorReader aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class SectorReader{
    private String[] sectors;
    private String[] values;
    private ReadFile rf;
    
    public SectorReader(){
        ReadFile rf = new ReadFile();
        rf.open("Base_Espacial.txt");
        
        String line;
        sectors = new String[25];
        
        line = rf.readOneLine();
        for(int i=0; i<sectors.length; ++i){
            values = proccessFileLine(sectors[i]);
            line = rf.readOneLine();
        }
        rf.close();
    }
    
        /**
    * Com o StringTokenizer, é considerado mais eficiente
    * @param str
    * @return 
    */
    public static String[] proccessFileLine(String str){
        if (str == null) {
            return null;
        }
        
        String[] values = new String[7];
        StringTokenizer st = new StringTokenizer(str, ",");

        values[0] = st.nextToken().replace("\"", "").trim();
        values[1] = st.nextToken();
        values[2] = st.nextToken();

        values[3] = st.nextToken().replace("\"", "").trim();
        if (values[3].isEmpty()) {
            values[3] = null;
        }

        values[4] = st.nextToken().replace("\"", "").trim();
        if (values[4].isEmpty()) {
            values[4] = null;
        }

        values[5] = st.nextToken().replace("\"", "").trim();
        if (values[5].isEmpty()) {
            values[5] = null;
        }

        values[6] = st.nextToken().replace("\"", "").trim();
        if (values[6].isEmpty()) {
            values[6] = null;
        }

        return values;
    }
}
