package by.epam.jonline.task01;

public class Test1 {
    private int a;
    private int b;

    public void print(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int max() {
        if (a > b) {
            return a;
        }
        return b;
    }

    public int sum() {
        return a + b;
    }
}
