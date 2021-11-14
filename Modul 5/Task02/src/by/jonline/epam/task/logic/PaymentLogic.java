package by.jonline.epam.task.logic;


import by.jonline.epam.task.bean.Payment;

public class PaymentLogic {

    public double resultSum(Payment payment){
        double cost = 0;

        for (Payment.Product product : payment.getProductList()){
            cost += product.getPrice();
        }
        return cost;
    }

}
