package by.epam.jonline.task.bean;

import by.epam.jonline.task.logic.PaymentLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {
    private static int Id;
    private int id;
    private List<Product> productList;


    public Payment(){
        this.id = Id++;
        productList = new ArrayList<>();
    }

    public Payment(PaymentLogic summa){
        id = Id++;
        this.productList = new ArrayList<>();
    }

    public int getid() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


    public void addProduct(Product product){
        productList.add(product);
    }

    public void deleteProduct(Product product){
        productList.remove(product);
    }

    public static class Product{
        private String name;
        private double price;

        public Product(String name, double price){
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price);
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return id == payment.id && Objects.equals(productList, payment.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productList);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", productList=" + productList +
                '}';
    }
}
