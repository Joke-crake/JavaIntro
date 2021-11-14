package by.epam.jonline.task08.main;
/*
8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

import by.epam.jonline.task08.entity.Customer;
import by.epam.jonline.task08.entity.Shop;
import by.epam.jonline.task08.logic.Logic;
import by.epam.jonline.task08.view.View;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        View view = new View();
        Logic logic = new Logic();
        Shop fishingShop = new Shop("FishingShop");
        fishingShop.addCostumerToShopList(new Customer("Иван", "Дмитриевич", "Чехия", 1324, "12_23_46"));
        fishingShop.addCostumerToShopList(new Customer("Герман", "Анатольевич", "Россия", 2569, "15_27_79"));
        fishingShop.addCostumerToShopList(new Customer("Ирина", "Константиновна", "Беларусь", 2587, "13_89_64"));
        fishingShop.addCostumerToShopList(new Customer("Ренат", "Дмитриевич", "Беларусь", 9875, "52_63_78"));
        fishingShop.addCostumerToShopList(new Customer("Аркадий", "Сергеевич", "Египет", 2365, "45_65_85"));
        fishingShop.addCostumerToShopList(new Customer("Константин", "Антонович", "Россия", 9854, "32_32_64"));
        fishingShop.addCostumerToShopList(new Customer("Сергей", "Семенович", "Беларусь", 8412, "74_96_69"));

        view.print("Изначальный список", fishingShop.getCustomerList());

        List<Customer> listSortByName;
        listSortByName = logic.getListByName(fishingShop.getCustomerList());
        view.print("Сортировка по алфавиту", listSortByName);

        List<Customer> listOfDiapasonCreditCards;
        listOfDiapasonCreditCards = logic.getListByDiapasonOfCreditCards(2000, 3000, fishingShop.getCustomerList());
        view.print("Покупатели с номерами кредитных карт с 2000 до 3000", listOfDiapasonCreditCards);
    }
}
