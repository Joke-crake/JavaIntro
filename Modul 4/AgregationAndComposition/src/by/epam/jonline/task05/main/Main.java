package by.epam.jonline.task05.main;
/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
питания и числа дней. Реализовать выбор и сортировку путевок.
 */
import by.epam.jonline.task05.entity.Client;
import by.epam.jonline.task05.entity.TouristAgency;
import by.epam.jonline.task05.entity.Voucher;
import by.epam.jonline.task05.logic.TouristAgencyLogic;
import by.epam.jonline.task05.logic.VoucherLogic;
import by.epam.jonline.task05.view.VoucherView;

public class Main {
    public static void main(String[] args) {
        TouristAgency touristAgency = new TouristAgency("Полетели");
        TouristAgencyLogic touristAgencyLogic = new TouristAgencyLogic();
        VoucherLogic voucherLogic = new VoucherLogic();
        VoucherView voucherView = new VoucherView();
        touristAgencyLogic.addVoucher(new Voucher("Россия", 10, 1000.0, "Самолет",
                "Все включено", "Отдых"), touristAgency.getVouchers());
        touristAgencyLogic.addVoucher(new Voucher("Россия", 5, 500.0, "Самолет",
                "Только завтрак", "Отдых"), touristAgency.getVouchers());
        touristAgencyLogic.addVoucher(new Voucher("Россия", 7, 700.0, "Поезд",
                "Завтрак и ужин", "Лечение"), touristAgency.getVouchers());
        touristAgencyLogic.addVoucher(new Voucher("Турция", 10, 1200.0, "Самолет",
                "Все включено", "Отдых"), touristAgency.getVouchers());
        touristAgencyLogic.addVoucher(new Voucher("Туция", 7, 800.0, "Самолет",
                "Завтрак и ужин", "Экскурсии"), touristAgency.getVouchers());
        touristAgencyLogic.addVoucher(new Voucher("Грузия", 10, 1100.0, "Самолет",
                "Все включено", "Экскурсии"), touristAgency.getVouchers());
        touristAgencyLogic.addVoucher(new Voucher("Италия", 3, 300.0, "Самолет",
                "Только завтрак", "Шопинг"), touristAgency.getVouchers());
        touristAgencyLogic.addVoucher(new Voucher("США", 11, 1700.0, "Самолет",
                "Все включено", "Круиз"), touristAgency.getVouchers());
        touristAgencyLogic.addClient(new Client("Василий", "Григорян", "+375(29)6523214",
                touristAgency.getVouchers().get(4)), touristAgency.getClients());
        touristAgencyLogic.addClient(new Client("Герман", "Веко", "+375(29)2563256",
                touristAgency.getVouchers().get(1)), touristAgency.getClients());
        touristAgencyLogic.addClient(new Client("Анатолий", "Котик", "+375(29)8964589",
                touristAgency.getVouchers().get(0)), touristAgency.getClients());
        touristAgencyLogic.addClient(new Client("Людмила", "Артюшенко", "+375(29)9856965",
                touristAgency.getVouchers().get(4)), touristAgency.getClients());

        Voucher choisedVoucher;
        choisedVoucher = voucherLogic.choiseVoucher(voucherLogic.choisedVouchers(voucherLogic.choisedFoodType(voucherLogic.choisedTransport(touristAgency.getVouchers()))));
        System.out.println(choisedVoucher);








    }
}
