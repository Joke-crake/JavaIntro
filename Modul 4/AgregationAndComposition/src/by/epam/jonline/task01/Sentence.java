package by.epam.jonline.task01;

import java.util.ArrayList;

public class Sentence {
    private StringBuilder sentence;

    public Sentence() {
    }

    public Sentence(String sentence) {
        this.sentence = new StringBuilder(sentence);
    }

    public StringBuilder getSentence() {
        return sentence;
    }

    public void setSentence(StringBuilder sentence) {
        this.sentence = sentence;
    }

    public void addWord(Word word) {
        sentence.append(word);
        sentence.append(" ");
    }

    public String toString() {
        String str = "";
        str = str + sentence;
        return str;
    }
}
