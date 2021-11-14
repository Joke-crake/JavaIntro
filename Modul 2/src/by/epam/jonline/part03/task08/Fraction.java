package by.epam.jonline.part03.task08;

import java.util.Objects;

public class Fraction {
    public int numerator;
    public int denumerator;

    public Fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denumerator == fraction.denumerator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denumerator);
    }

    @Override
    public String toString() {
        String str = "";
        str = str + numerator + "/" + denumerator;
        return str;
    }
}
