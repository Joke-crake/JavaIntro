package by.epam.task.menuAction;

import by.epam.task.bean.Book;
import by.epam.task.bean.Letter;
import by.epam.task.bean.User;
import by.epam.task.controller.LibraryController;
import by.epam.task.service.*;
import by.epam.task.service.impl.BookServiceImpl;
import by.epam.task.service.impl.CatalogServiceImpl;
import by.epam.task.service.impl.LetterServiceImpl;
import by.epam.task.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCommands {

    public static void mainMenu() {
        System.out.println("Добро пожаловать в домашнюю библиотеку!");
        System.out.println("Выберите действие: \n" +
                "1. Авторизация. \n" +
                "2. Выход из программы.");
    }

    public static void underMenu(User user) {
        System.out.println("Выберите действие: \n" +
                "1. Просмотр каталога. \n" +
                "2. Поиск книги по названию. \n" +
                "3. Поиск книг по автору ");
        if (user.getUserType().getValue().equalsIgnoreCase("admin")) {
            System.out.println(
                    "4. Зарегистрировать пользователя \n" +
                            "5. Добавить книгу в каталог. \n" +
                            "6. Удалить книгу из каталога. \n" +
                            "7. Добавить описание книги. ");
        } else if (user.getUserType().getValue().equalsIgnoreCase("user")) {
            System.out.println(
                    "4. Предложить добавить книгу.");
        }
        System.out.println(
                "8. Проверить почту. \n" +
                        "9. Сменить пользователя. \n" +
                        "0. Выход из программы.");
    }


    public static int enterFromConsoleInt(String message) {
        Scanner sc = new Scanner(System.in);
        int value;
        System.out.println(message);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(message);
        }
        value = sc.nextInt();
        return value;
    }

    public static String enterFromConsoleString(String message) {
        Scanner sc = new Scanner(System.in);
        String value;
        System.out.println(message);
        while (!sc.hasNextLine()) {
            sc.next();
            System.out.println(message);
        }
        value = sc.nextLine();
        return value;
    }

    public static User processLogin() {
        User user = null;
        String login = enterFromConsoleString("Введите логин >>");
        String password = enterFromConsoleString("Введите пароль >>");
        LibraryController controller = new LibraryController();

        String request;
        request = "logination^login=" + login + "^password=" + password;

        String response;

        response = controller.doAction(request);

        String result = response.split("\\s+")[0];

        if (result.equalsIgnoreCase("1")) {
            System.out.println("Error");
        } else if (result.equalsIgnoreCase("0")) {
            UserService userService = new UserServiceImpl();
            try {
                user = userService.searchUser(login, password);
            } catch (ServiceException e) {
                e.printStackTrace();
            }
        }
        return user;
    }

    public static void processRegistration() {
        LibraryController controller1 = new LibraryController();
        System.out.println("Регистрация:");
        String registrationLogin = enterFromConsoleString("Введите логин");
        String registrationNickname = enterFromConsoleString("Введите никнейм");
        String registrationPassword = enterFromConsoleString("Введите пароль");
        String registrationEmail = enterFromConsoleString("Введите почту");
        String request1;

        request1 = "registration^login=" + registrationLogin + "^nickname=" + registrationNickname + "^password=" + registrationPassword + "^email=" + registrationEmail;

        String response1;

        response1 = controller1.doAction(request1);

        String result1 = response1.split("\\s+")[0];
        if (result1.equalsIgnoreCase("0")) {
            System.out.println("Регистрация прошла успешно");
        } else {
            System.out.println("Ошибка регистрации");
        }
    }

    public static List<Book> processGetCatalog() {
        LibraryController controller = new LibraryController();
        List<Book> books = null;

        String request;

        request = "getCatalog^ ";

        String response;

        response = controller.doAction(request);
        String result = response.split("\\s+")[0];
        if (result.equalsIgnoreCase("0")) {
            CatalogService catalogService = new CatalogServiceImpl();
            try {
                books = catalogService.getCatalog();
            } catch (ServiceException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Каталог не загружен.");
        }
        return books;

    }

    public static Book processSearchBookByTitle() {
        LibraryController controller = new LibraryController();
        Book book = null;

        String bookTitle;
        bookTitle = enterFromConsoleString("Введите название книги >>");
        System.out.println("Вы ищете: " + bookTitle);

        String request;
        request = "searchBookByTitle^bookTitle=" + bookTitle;

        String response;
        response = controller.doAction(request);

        String result = response.split("\\s+")[0];
        if (result.equalsIgnoreCase("0")) {
            BookService bookService = new BookServiceImpl();
            try {
                book = bookService.searchBookByTitle(bookTitle);
            } catch (ServiceException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Книга с указанным названием не найдена.");
        }
        return book;
    }

    public static List<Book> processSearchBookByAuthor() {
        LibraryController controller = new LibraryController();
        List<Book> books = null;

        String bookAuthor;
        bookAuthor = enterFromConsoleString("Введите имя автора >>");

        String request;

        request = "searchBookByAuthor^bookAuthor=" + bookAuthor;

        String response;
        response = controller.doAction(request);

        String result = response.split("\\s+")[0];
        if (result.equalsIgnoreCase("0")) {
            BookService bookService = new BookServiceImpl();
            try {
                books = bookService.searchBookByAuthor(bookAuthor);
            } catch (ServiceException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Книги с указанным автором не найдены.");
        }
        return books;
    }

    public static void processAddBook() {
        LibraryController controller = new LibraryController();

        String title = enterFromConsoleString("Введите название книги >>");
        String author = enterFromConsoleString("Введите автора книги >>");
        String description = enterFromConsoleString("Введите описание книги >>");
        String bookType = null;
        System.out.println("1. Электронная. \n" +
                "2. Бумажная.");
        int type = enterFromConsoleInt("Выберите тип книги >>");
        if (type == 1) {
            bookType = Book.BookType.EBOOK.getValue();
        } else if (type == 2) {
            bookType = Book.BookType.PAPERBOOK.getValue();
        }

        String request;
        request = "addBook^title=" + title + "^author=" + author + "^description=" + description + "^bookType=" + bookType;

        String response;
        response = controller.doAction(request);

        String result = response.split("\\s+")[0];
        if (result.equalsIgnoreCase("0")) {
            System.out.println("Книга успешно добавлена в каталог.");
        } else {
            System.out.println("Ошибка.");
        }
    }

    public static void processRemoveBook() {
        LibraryController controller = new LibraryController();

        String title = enterFromConsoleString("Введите название книги >>");

        String request;
        request = "removeBook^title=" + title;

        String response;
        response = controller.doAction(request);

        String result = response.split("\\s+")[0];
        if (result.equalsIgnoreCase("0")) {
            System.out.println("Книга успешно удалена.");
        } else {
            System.out.println("Ошибка.");
        }
    }

    public static String processAddDescription() {
        LibraryController controller = new LibraryController();

        String title = enterFromConsoleString("Введите название книги >>");
        String description = enterFromConsoleString("Введите описание >>");

        String request;
        request = "addDiscribe^title=" + title + "^description=" + description;

        String response;
        response = controller.doAction(request);

        String result = response.split("\\s+")[0];
        if (result.equalsIgnoreCase("0")) {
            System.out.println("Описание успешно добавлено.");
        } else {
            System.out.println("Ошибка.");
        }
        return title;
    }

    public static List<Letter> processGetLetters(String login) {
        LibraryController controller = new LibraryController();
        List<Letter> letterList = null;

        String request;

        request = "getLetters^login=" + login;

        String response;

        response = controller.doAction(request);
        String result = response.split("\\s+")[0];
        if (result.equalsIgnoreCase("0")) {
            LetterService letterService = new LetterServiceImpl();
            try {
                letterList = letterService.getLetters(login);
            } catch (ServiceException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Писем не найдено.");
        }
        return letterList;
    }

    public static void suggestAddBook(User user) {
        LibraryController controller = new LibraryController();

        String title = enterFromConsoleString("Введите название книги >>");
        String author = enterFromConsoleString("Введите имя автора книги >>");
        String description = enterFromConsoleString("Введите описание >>");
        String bookType = enterFromConsoleString("Выберите тип книги >>");
        String message = "Название: " + title + ", автор: " + author + ", описание: " + description + ", тип книги: " + bookType;

        String request;
        request = "suggestAddBook^e-mail получателя=joker@gmail.com" + "^title=Добавление новой книги." + "^message=" + message + "^e-mail отправителя=" + user.getEmail();

        String response;
        response = controller.doAction(request);

        String result = response.split("\\s+")[0];
        if (result.equalsIgnoreCase("0")) {
            System.out.println("Предложение отправлено.");
        } else {
            System.out.println("Ошибка.");
        }
    }

    public static String showMessage(List<Letter> letterList, int key){
        LibraryController controller = new LibraryController();
        Letter letter = null;
        for (int i = 0; i < letterList.size(); i++){
            if (i == key - 1){
                letter = letterList.get(i);
            }
        }

        String recepientEmail = letter.getRecipientEmail();
        String title = letter.getTitle();
        String letterMessage = letter.getMessage();
        String senderEmail = letter.getSenderEmail();
        String type = letter.getLetterType().getValue();

        String request;
        request = "showMessage^получатель=" + recepientEmail + "^тема=" + title + "^сообщение=" + letterMessage + "^отправитель=" + senderEmail + "^тип письма=" + type;

        String response;
        response = controller.doAction(request);

        String message = null;
        String result = response.split("\\s")[0];
        if (result.equalsIgnoreCase("0")){
            LetterService letterService = new LetterServiceImpl();
            System.out.println("Сообщение:");
            try {
                message = letterService.showMessage(letter);
            } catch (ServiceException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("Ошибка");
            return null;
        }
        return message;
    }

    public static void processNotification(List <User> users, String bookTitle){
        LibraryController controller = new LibraryController();
        String[] results = new String[users.size()];
        for (int i = 0; i < users.size(); i++){

            String request = "notification^e-mail=" + users.get(i).getEmail() + "^bookTitle=" + bookTitle;

            String response = controller.doAction(request);

            String result = response.split("\\s")[0];
            results[i] = result;
        }
        boolean result = false;
        for (String item : results){
            if(item.equalsIgnoreCase("0")){
                result = true;
            }else {
                result = false;
                break;
            }
        }
        if (result){
            System.out.println("Уведомления отправлены пользователям на e-mail.");
        }else {
            System.out.println("Произошла ошибка.");
        }
    }

    public static List<User> processGetUsers(){
        LibraryController controller = new LibraryController();
        List<User> users = new ArrayList<>();
        String request = "getUsers^";

        String response = controller.doAction(request);
        String result = response.split("\\s")[0];
        if(result.equalsIgnoreCase("0")){
            UserService userService = new UserServiceImpl();
            try {
                users = userService.getUsers();
            } catch (ServiceException e) {
                e.printStackTrace();
            }
        }
        return users;
    }
}
