/**
 * An entry in the database of words
 */
public class WordEntry implements Comparable {
    public String word;
    private int occurrences;

    public WordEntry(String word, int occurrences) {
        this.word = word;
        this.occurrences = occurrences;
    }


    @Override
    public int compareTo(Object o) {
        return this.occurrences - ((WordEntry) o).occurrences;
        //return this.word.compareTo(((WordEntry)o).word);
    }

    public String toString() {
        return "Word: [" + word + "] Frequency: [" + occurrences + "]";
    }
}
