package by.epam.jonline.task;

/*
2. Дана строка, содержащая следующий текст (xml-документ):
<notes>
    <note id = "1">
        <to>Вася</to>
        <from>Света</from>
        <heading>Напоминание</heading>
        <body>Позвони мне завтра!</body>
    </note>
    <note id = "2">
        <to>Петя</to>
        <from>Маша</from>
        <heading>Важное напоминание</heading>
        <body/>
    </note>
</notes>
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий тег,
закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {

    public static void main(String[] args) {
        String xmlText = "<notes>\n"
                + "   <note id = \"1\">\n"
                + "       <to>Вася</to>\n"
                + "       <from>Света</from>\n"
                + "       <heading>Напоминание</heading>\n"
                + "       <body>Позвони мне завтра!</body>\n"
                + "   </note>\n"
                + "   <note id = \"2\">\n"
                + "       <to>Петя</to>\n"
                + "       <from>Маша</from>\n"
                + "       <heading>Важное напоминание</heading>\n"
                + "       <body/>\n"
                + "   </note>\n"
                + "</notes>";
        System.out.println(xmlParser(xmlText));
    }

    public static String xmlParser(String textForParser) {

        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        StringBuilder resultString = new StringBuilder();

        String[] rows = textForParser.split("\n");

        for (String row : rows) {
            Matcher mOpen = pOpen.matcher(row);
            Matcher mClose = pClose.matcher(row);
            Matcher mBody = pBody.matcher(row);
            Matcher mEmpty = pEmpty.matcher(row);
            if (mEmpty.find()) {
                resultString.append(mEmpty.group());
                resultString.append(" - пустой тег\n");
            } else if (mOpen.find()) {
                resultString.append(mOpen.group());
                resultString.append(" - открывающий тег\n");
            }
            if (mBody.find()) {
                resultString.append(mBody.group().substring(1));
                resultString.append("\b - содержимое тега\n");
            }
            if (mClose.find()) {
                resultString.append(mClose.group());
                resultString.append(" - закрывающий тег\n");
            }
        }
        return resultString.toString();
    }
}
