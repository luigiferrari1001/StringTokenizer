import java.util.NoSuchElementException;

/**
 * Affetta le stringhe in pezzetti che restituisce uno alla volta
 * 
 * @author Classe 4aii 2020-21 
 * @version 11.2.2021
 */
public class Affettatore{
    
    private String str;
    private String delim;
    private int pos;
    private boolean ended;
    
    
    /**
     * Costruttore degli oggetti di classe  Affettatore
     * @param str stringa da affettare
     * @param delim elenco dei delimitatori ammessi.
     */
    public Affettatore(String str, String delim) {
        this.str = str;
        this.delim = delim;
        pos = 0;
        ended = false;
    }
    
    
    /**
     * Costruttore degli oggetti di classe  Affettatore
     * I delimitatori sono queli della stringa " \t\n\r\f"
     * (spazio, tab, a capo, fine file).
     * @param str stringa da affettare
     */
    public Affettatore(String str)   {
        this (str, " \t\n\r\f");
    }
    
    /**
     * Verifica se ci sono ancora fette disponibili
     * 
     * @return  true se ci sono ancora fette disponibili.
     */
    public boolean hasMoreTokens(){
        return !ended;
    }
       
    /**
     * Fornisce la prossima fetta, se disponibile
     * @return la prossima fetta
     * @throws NoSuchElementException se non ce ne sono più
     */
    public String nextToken(){
       if (!hasMoreTokens()) 
          throw new NoSuchElementException("Stringa finita!");
       String ris ="";
       int len = str.length();
       //salta delimitatori iniziali
       while(pos<len && (delim.contains(""+str.charAt(pos)))){
           System.out.println("Primo while " + pos);
           pos++;
           if(pos == len) {
               ended = true;
               System.out.println("Fine Primo while " + pos);
               return ris;
           }
       }
       System.out.println("In mezzo " + pos+
              "->"+str.charAt(pos)+ 
              delim.contains(""+str.charAt(pos)));
       //if (pos==0 || delim.contains(""+str.charAt(pos))){
           System.out.println("If while " + pos);
           int start = pos;
           int end = start;
           while(pos<len && (!delim.contains(""+str.charAt(pos)))){
              System.out.println("Secondo while " + pos+"->"+str.charAt(pos));
              pos++;
           }
           end = pos;
           ris = str.substring(start, end);
           System.out.println("Secondo while " + pos+ " Ris "+ ris);
           if (pos == len) ended = true;
       //}
       return ris;
    }  
}
