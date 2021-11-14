package by.epam.jonline.task03;

/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
(массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        int[] grades;
        for (int i = 0; i < students.length; i++) {
            grades = new int[5];
            for (int j = 0; j < grades.length; j++) {
                grades[j] = (int) Math.round(Math.random() * 2 + 8);
            }
            students[i] = new Student("Student " + i, 10, grades);
        }

        System.out.println("Все студенты:");
        for (Student c : students) {
            System.out.println(c);
        }

        System.out.println("Отличники:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].isExcellent()) {
                System.out.println(students[i]);
            }
        }
    }
}
