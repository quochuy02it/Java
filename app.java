import java.io.FileNotFoundException;

public class app {
    public static void main(String[] args) throws FileNotFoundException {
        Dictionary dictionary = new Dictionary();
        DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        dictionaryManagement.InsertFromFile(dictionary);
        dictionaryManagement.dictionaryLookup(dictionary);
    }
}