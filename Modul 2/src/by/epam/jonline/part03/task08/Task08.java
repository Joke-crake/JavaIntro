package by.epam.jonline.part03.task08;

/*
8.Даны дроби(p , q - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task08 {
    public static void main(String[] args) {
        Fraction[] fractions = new Fraction[]{new Fraction(2, 3), new Fraction(4, 8),
                new Fraction(3, 5), new Fraction(4, 9)};
        toNewDenominator(fractions, commonDenominator(fractions));
        sortByNumerator(fractions);

        for (Fraction element : fractions) {
            System.out.println(element);
        }
    }

    public static int commonDenominator(Fraction[] array) {
        boolean isCommon = false;
        int commonDenominator = 0;
        while (!isCommon) {
            isCommon = true;
            commonDenominator++;
            for (Fraction element : array) {
                if (commonDenominator % element.denumerator != 0) {
                    isCommon = false;
                }
            }
        }
        return commonDenominator;
    }

    public static Fraction[] toNewDenominator(Fraction[] fractions, int commonDenominator) {
        for (Fraction element : fractions) {
            element.numerator *= commonDenominator / element.denumerator;
            element.denumerator = commonDenominator;
        }
        return fractions;
    }

    public static void sortByNumerator(Fraction[] arrayForSort) {
        for (int i = 0; i < arrayForSort.length - 1; i++) {
            for (int j = i + 1; j < arrayForSort.length; j++) {
                if (arrayForSort[j].numerator < arrayForSort[i].numerator) {
                    Fraction temp = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[j];
                    arrayForSort[j] = temp;
                }
            }
        }
    }
}