import java.util.NoSuchElementException;

/**
 * Affetta le stringhe in pezzetti che restituisce uno alla volta
 * 
 * @author Classe 4aii 2020-21 
 * @version 11.2.2021
 */
public class Affettatore{
    
    /**
     * Costruttore degli oggetti di classe  Affettatore
     * @param str stringa da affettare
     * @param delim elenco dei delimitatori ammessi.
     */
    public Affettatore(String str, String delim) {
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
        return true;
    }
    
    
    /**
     * Fornisce la prossima fetta, se disponibile
     * @return la prossima fetta
     * @throws NoSuchElementException se non ce ne sono più
     */
    public String nextToken(){
       if (!hasMoreTokens()) 
          throw new NoSuchElementException("Stringa finita!");
       return "";
    }
    
}
