package by.jonline.epam.task;


import java.util.Objects;

public class TextFile extends File {
    private String text;
    {
        text = new String("");
    }

    public TextFile(){
    }

    public TextFile(String name){
        super(name, new Directory());

    }

    public TextFile(String name, Directory directory){
        super(name, directory);

    }

    public TextFile( String name, String text, Directory directory){
        super(name, directory);
        this.text = text;

    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public TextFile create(String name, Directory directory){
        return new TextFile(name, directory);
    }

    public void addText(String text){
        this.text = this.text.concat(text + " ");
    }

    public void deleteText(String text){
        this.text = this.text.replace(text, "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(text, textFile.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }

    @Override
    public String toString() {
        return super.toString() + "TextFile{" +
                "text='" + text + '\'' +
                '}';
    }
}
