package by.epam.jonline.task.consoleAction;

import by.epam.jonline.task.logic.CaveLogic;
import by.epam.jonline.task.logic.TreasureLogic;
import by.epam.jonline.task.main.Main;
import by.epam.jonline.task.view.TreasureView;

import java.util.Scanner;

public class CaseMenu {
    private Scanner sc = new Scanner(System.in);

    public CaseMenu(Scanner sc){
        this.sc = sc;
    }

    private void printMenu(){
        System.out.println("Сокровища и дракон.");
        System.out.println("1. Просмотреть сокровища.");
        System.out.println("2. Показать самое дорогое сокровище.");
        System.out.println("3. Выбор сокровищей на определенную сумму.");
        System.out.println("4. Завершение работы.");
    }
    public void start(){
        CaveLogic.loadTreasuresFromFile(Main.cave);
        if (this.sc != null){
            int key;
            do{
                printMenu();
                System.out.println("Выберите нужный пункт меню");
                key = this.sc.nextInt();
                switch (key){
                    case 1:
                        System.out.println("Весь список сокровищ:");
                        TreasureView.printTreasureView(Main.cave);
                        break;
                    case 2:
                        System.out.println("Самое дорогое сокровище:");
                        TreasureView.printMoreExpensiveTreasure();
                        break;
                    case 3:
                        System.out.println("Введите сумму, на которую хотите получить сокровищ");
                        int value;
                        value = sc.nextInt();
                        while (value <= 0) {
                            System.out.println("Введено неверное значение, повторите ввод.");
                            value = sc.nextInt();
                            if (value > 0) {
                                TreasureLogic.treasuresForSum(Main.cave, value);
                            }
                            break;
                        }
                    case 4:
                        System.out.println("Завершение программы...");
                        break;
                    default:
                        System.out.println("Вы ввели неверное число.");
                }
            }while (key != 4);
        }
    }
    
}
