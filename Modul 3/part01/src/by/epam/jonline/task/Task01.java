package by.epam.jonline.task;

/*
1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
*/
public class Task01 {
    public static void main(String[] args) {
        String[] camelCaseString = new String[]{"яркийСвет", "большойГриб", "сладкийАрбуз"};
        String[] snakeCase = toSnakeCase(camelCaseString);
        printMass(snakeCase);
    }

    public static String[] toSnakeCase(String[] masForTransformation) {
        String[] snakeCase = new String[masForTransformation.length];
        for (int i = 0; i < masForTransformation.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < masForTransformation[i].length(); j++) {
                char letter = masForTransformation[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    stringBuilder.append(letter);
                } else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }

    public static void printMass(String[] masForPrint) {

        for (int i = 0; i < masForPrint.length; i++) {
            if (i >= 0 && i < masForPrint.length - 1) {
                System.out.print(masForPrint[i] + ", ");
            } else {
                System.out.println(masForPrint[i] + ".");
            }
        }
    }
}

