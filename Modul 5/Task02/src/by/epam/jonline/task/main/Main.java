package by.epam.jonline.task.main;

import by.epam.jonline.task.bean.Payment;
import by.epam.jonline.task.logic.PaymentLogic;
import by.epam.jonline.task.view.PaymentView;
/*
Задача 2.
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */

public class Main {
    public static void main(String[] args) {
        PaymentLogic paymentLogic = new PaymentLogic();
        PaymentView paymentView = new PaymentView();
        Payment.Product product1 = new Payment.Product("Ананас", 12.45);
        Payment.Product product2 = new Payment.Product("Дыня", 5.65);
        Payment.Product product3 = new Payment.Product("Инжир", 6.99);
        Payment.Product product4 = new Payment.Product("Абрикос", 4.99);
        Payment payment = new Payment();

        Payment payment1 = new Payment();

        payment.addProduct(product1);
        payment.addProduct(product2);
        payment1.addProduct(product3);
        payment1.addProduct(product4);
        System.out.println(payment1);
        double totalCostPayment1 = paymentLogic.resultSum(payment1);

        paymentView.printPaymentInfo(payment, totalCostPayment1);
    }
}
