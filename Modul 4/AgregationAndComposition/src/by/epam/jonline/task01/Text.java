package by.epam.jonline.task01;

public class Text {
    private String header;
    private StringBuilder text;

    public Text() {

    }

    public Text(String header, StringBuilder text) {
        this.header = header;
        this.text = new StringBuilder(text);
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setText(StringBuilder text) {
        this.text = text;
    }

    public String getHeader() {
        return header;
    }

    public StringBuilder getText() {
        return text;
    }

    public void printHeader(String header) {
        System.out.println(header);
    }

    public void printText(StringBuilder text) {
        System.out.println(text);
    }

    public void addSentence(Sentence sentence) {
        text.append(" ");
        text.append(sentence);

    }
}
