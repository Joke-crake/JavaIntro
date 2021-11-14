package by.jonline.epam.task;

import java.util.Objects;

public abstract class File {

    private String name;
    private Directory directory;

    public File (){

    }
    public File (String name, Directory directory){
        this.name = name;
        this.directory = directory;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(name, file.name) && Objects.equals(directory, file.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, directory);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", directory=" + directory +
                '}';
    }
}
