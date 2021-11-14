package by.jonline.epam.task;

public class Main {
    public static void main(String[] args) {
        TextFileView textFileView = new TextFileView();
        Directory directory = new Directory("Сочинения");
        TextFile textFile = new TextFile("Лето в лесу", directory);
        System.out.println(textFile);
        textFile.addText("Хорошо в лесу летом.");
        textFileView.printTextOnConsole(textFile);
        textFile.deleteText("лесу ");
        textFileView.printTextOnConsole(textFile);
        textFile.addText("Я больше люблю зиму.");
        textFileView.printTextOnConsole(textFile);

    }
}
