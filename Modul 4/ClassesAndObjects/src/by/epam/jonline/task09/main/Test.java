package by.epam.jonline.task09.main;
/*
9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать
критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */

import by.epam.jonline.task09.entity.Book;
import by.epam.jonline.task09.entity.Library;
import by.epam.jonline.task09.logic.Logic;
import by.epam.jonline.task09.view.View;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        View view = new View();
        Logic logic = new Logic();
        Library books = new Library();
        books.addBookToListOfBooks(new Book("Портрет Дориана Грея", "Оскар Уайльд", "Рваные костры", 1890, 452, 55, "Мягкий"));
        books.addBookToListOfBooks(new Book("Счастливый принц", "Оскар Уайльд", "Рваные костры", 1888, 360, 47, "Твердый"));
        books.addBookToListOfBooks(new Book("Преступление Лорда Артура Сэвина", "Оскар Уайльд", "Рваные костры", 1891, 250, 30, "Твердый"));
        books.addBookToListOfBooks(new Book("Кентельвильское приведение", "Оскар Уайльд", "Рваные костры", 1887, 163, 31, "Мягкий"));
        books.addBookToListOfBooks(new Book("Счастливый принц", "Оскар Уайльд", "Узури", 1888, 360, 47, "Твердый"));
        books.addBookToListOfBooks(new Book("Капитанская дочка", "Александр Пушкин", "Рваные костры", 1836, 635, 57, "Твердый"));
        books.addBookToListOfBooks(new Book("Пиковая дама", "Оскар Уайльд", "Утопия", 1888, 368, 47, "Твердый"));

        view.print("Изначальный список", books.getListOfBooks());

        List<Book> listOfAuthors;
        listOfAuthors = logic.getListOfAuthor("Оскар Уайльд", books.getListOfBooks());
        view.print("С автором Оскар Уайльд", listOfAuthors);

        List<Book> listOfPublishingHouses;
        listOfPublishingHouses = logic.getListOfBookOfPublishingHouse("Утопия", books.getListOfBooks());
        view.print("От издательства Утопия", listOfPublishingHouses);

        List<Book> listOfbooksScience;
        listOfbooksScience = logic.getListOfBookScience(1885, books.getListOfBooks());
        view.print("С 1885 года", listOfbooksScience);
    }
}

