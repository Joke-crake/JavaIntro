package by.epam.jonline.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {
    private String name;
    private List<File> files;

    public Directory(){

    }

    public Directory (String name){
        this.name = name;
        this.files = new ArrayList<>();
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(String name){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(name, directory.name) && Objects.equals(files, directory.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, files);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", files=" + files +
                '}';
    }
}
