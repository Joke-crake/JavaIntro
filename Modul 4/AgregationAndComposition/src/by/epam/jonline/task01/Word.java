package by.epam.jonline.task01;

public class Word {
    private StringBuilder word;

    public Word() {
    }

    public Word(StringBuilder word) {
        this.word = new StringBuilder(word);
    }

    public StringBuilder getWord() {
        return word;
    }

    public void setWord(StringBuilder word) {
        this.word = word;
    }

    public void changeWord(StringBuilder word) {
        this.word = new StringBuilder(word);
    }

    public String toString() {
        String str = "";
        str = str + word;
        return str;
    }
}
