package by.epam.jonline.task03;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private int group;
    private int grades[] = new int[5];

    public Student(String name, int group, int[] grades) {
        this.name = name;
        this.group = group;
        this.grades = grades;
    }

    public boolean isExcellent() {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 9) {
                return false;
            }
        }
        return true;
    }

    public int getGroup() {
        return group;
    }

    public int[] getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group && Objects.equals(name, student.name) && Arrays.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, group);
        result = 31 * result + Arrays.hashCode(grades);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
