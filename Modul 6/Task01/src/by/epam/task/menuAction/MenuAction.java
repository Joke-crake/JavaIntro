package by.epam.task.menuAction;

import by.epam.task.bean.Book;
import by.epam.task.bean.Letter;
import by.epam.task.bean.User;
import by.epam.task.dao.impl.SourceLettersDAO;

import java.util.ArrayList;
import java.util.List;


public class MenuAction {
    SourceLettersDAO sourceLettersDAO = new SourceLettersDAO();

    public void start(){
        int key;
        do {
            MenuCommands.mainMenu();
            key = MenuCommands.enterFromConsoleInt(">>");
            switch (key) {
                case 1:
                    User user = MenuCommands.processLogin();
                    System.out.println(user);
                    if (user != null && user.getUserType().getValue().equalsIgnoreCase("admin")) {
                        MenuCommands.underMenu(user);
                        do {
                            key = MenuCommands.enterFromConsoleInt("Выберите пункт меню >>");
                            switch (key) {
                                case 1:
                                    List<Book> books;
                                    books = MenuCommands.processGetCatalog();
                                    System.out.println(books);
                                    break;
                                case 2:
                                    Book book;
                                    book = MenuCommands.processSearchBookByTitle();
                                    System.out.println("Вот Ваша книга " + book);
                                    break;
                                case 3:
                                    List<Book> books1;
                                    books1 = MenuCommands.processSearchBookByAuthor();
                                    System.out.println(books1);
                                    break;
                                case 4:
                                    MenuCommands.processRegistration();
                                    break;
                                case 5:
                                    MenuCommands.processAddBook();
                                    break;
                                case 6:
                                    MenuCommands.processRemoveBook();
                                    break;
                                case 7:
                                    String bookTitle = MenuCommands.processAddDescription();
                                    List<User> users = MenuCommands.processGetUsers();
                                    MenuCommands.processNotification(users, bookTitle);
                                    break;
                                case 8:
                                    System.out.println("Выберите письмо для прочтения");
                                    List<Letter> letterList;
                                    String email = user.getEmail();
                                    letterList = MenuCommands.processGetLetters(email);
                                    int i = 1;
                                    for (Letter letter : letterList) {
                                        System.out.println(i + ". " + letter);
                                        i++;
                                    }
                                    do {
                                        key = MenuCommands.enterFromConsoleInt("Введите номер письма >>");
                                        System.out.println(MenuCommands.showMessage(letterList, key));
                                        System.out.println("0. Выход.");
                                    } while (key < letterList.size() || key != 0);
                            }
                        } while (key != 0);
                    }
                else if(user != null && user.getUserType().getValue().equalsIgnoreCase("user")) {
                    MenuCommands.underMenu(user);
                    do {
                        key = MenuCommands.enterFromConsoleInt(">>");
                        switch (key) {
                            case 1:
                                List<Book> books;
                                books = MenuCommands.processGetCatalog();
                                System.out.println(books);
                                break;
                            case 2:
                                Book book;
                                book = MenuCommands.processSearchBookByTitle();
                                System.out.println("Вот Ваша книга " + book);
                                break;
                            case 3:
                                List<Book> books1;
                                books1 = MenuCommands.processSearchBookByAuthor();
                                System.out.println(books1);
                                break;
                            case 4:
                                MenuCommands.suggestAddBook(user);
                                break;
                        }
                    } while (key != 0);
                }
                else {
                    System.out.println("Неверное имя пользователя или пароль.");
                    break;
                }
            }
        }while (key != 2);
    }
}
