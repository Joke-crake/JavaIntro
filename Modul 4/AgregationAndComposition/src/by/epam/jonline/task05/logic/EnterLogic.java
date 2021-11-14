package by.epam.jonline.task05.logic;

import java.util.Scanner;

public class EnterLogic {

    public int enterFromConsole(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        int value;
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(message);
        }
        value = sc.nextInt();
        return value;
    }
}
