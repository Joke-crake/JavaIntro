package by.epam.jonline.task.view;

import by.epam.jonline.task.bean.Payment;

public class PaymentView {
    public void printPaymentInfo(Payment payment, double totalCost){
        System.out.println("Информация об оплате:");
        System.out.println("payment id = " + payment.getid());
        System.out.println("Список товаров в корзине: ");
        for (Payment.Product i : payment.getProductList()){
            System.out.println(i);
        }
        System.out.println("Итоговая сумма: " + totalCost);
    }

}
