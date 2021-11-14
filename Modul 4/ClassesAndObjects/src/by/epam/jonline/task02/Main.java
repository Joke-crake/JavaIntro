package by.epam.jonline.task02;

/*
2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */
public class Main {
    public static void main(String[] args) {
        Test2 test = new Test2(2, 4);

        System.out.println(test.getA());
        System.out.println(test.getB());
    }
}
