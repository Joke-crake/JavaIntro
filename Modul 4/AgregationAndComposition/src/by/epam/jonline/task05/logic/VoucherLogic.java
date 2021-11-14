package by.epam.jonline.task05.logic;

import by.epam.jonline.task05.entity.Voucher;
import by.epam.jonline.task05.view.VoucherView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class VoucherLogic {
    VoucherView voucherView = new VoucherView();
    EnterLogic enter = new EnterLogic();

    public void sortedListByPrice(ArrayList<Voucher> vouchersForSort) {
        Collections.sort(vouchersForSort, new Comparator<Voucher>() {
            @Override
            public int compare(Voucher o1, Voucher o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }

    public void sortedListByDestination(ArrayList<Voucher> vouchersForSort) {
        Collections.sort(vouchersForSort, new Comparator<Voucher>() {
            @Override
            public int compare(Voucher o1, Voucher o2) {
                return o1.getCountry().compareTo(o2.getCountry());
            }
        });
    }

    public ArrayList<Voucher> destinations(ArrayList<Voucher> vouchersForSearch) {
        ArrayList<Voucher> destinations = new ArrayList<Voucher>();
        for (Voucher voucher : vouchersForSearch) {
            destinations.add(voucher);
        }
        for (int i = 0; i < destinations.size(); i++) {
            for (int j = i + 1; i < destinations.size(); j++) {
                if (destinations.get(i).equals(destinations.get(j))) {
                    destinations.remove(j);
                }
            }
        }
        return destinations;
    }

    public ArrayList<String> listOfTransportType() {
        ArrayList<String> listOfTransportType = new ArrayList<>();
        listOfTransportType.add("Самолет");
        listOfTransportType.add("Поезд");
        return listOfTransportType;
    }

    public ArrayList<Voucher> choisedTransport(ArrayList<Voucher> vouchersForSearch) {
        ArrayList<Voucher> listWithTransport = new ArrayList<>();
        ArrayList<String> listOfTransportType;
        listOfTransportType = listOfTransportType();
        System.out.println("Имеющийся транспорт:");
        voucherView.printStringList(listOfTransportType);
        int a = enter.enterFromConsole("Выберите тип транспорта >>");
        System.out.println("Вы выбрали: " + listOfTransportType.get(a - 1));
        if (a > 0 && a <= listOfTransportType.size()) {
            for (Voucher vouchers : vouchersForSearch) {
                if (vouchers.getTransportType().equalsIgnoreCase(listOfTransportType.get(a - 1))) {
                    listWithTransport.add(vouchers);
                }
            }
        }
        return listWithTransport;
    }

    public ArrayList<String> listOfFoodType(ArrayList<Voucher> choisedTransportForSearchFoodType) {
        ArrayList<String> choisedFoodType = new ArrayList<>();
        for (int i = 0; i < choisedTransportForSearchFoodType.size(); i++) {
            choisedFoodType.add(choisedTransportForSearchFoodType.get(i).getFoodType());
        }
        for (int i = 0; i < choisedFoodType.size(); i++) {
            for (int j = i + 1; j < choisedFoodType.size(); j++) {
                if (choisedFoodType.get(i).equalsIgnoreCase(choisedFoodType.get(j))) {
                    choisedFoodType.remove(j);
                }
            }
        }
        return choisedFoodType;
    }

    public ArrayList<Voucher> choisedFoodType(ArrayList<Voucher> choisedTransportlist) {
        ArrayList<Voucher> listWithFoodType = new ArrayList<>();
        ArrayList<String> listOfFoodType;
        listOfFoodType = listOfFoodType(choisedTransportlist);
        System.out.println("Имеющиеся типы питания:");
        voucherView.printStringList(listOfFoodType);
        int a = enter.enterFromConsole("Выберите тип питания >>");
        System.out.println("Вы выбрали: " + listOfFoodType.get(a - 1));
        if (a > 0 && a <= listOfFoodType.size()) {
            for (Voucher vouchers : choisedTransportlist) {
                if (vouchers.getFoodType().equalsIgnoreCase(listOfFoodType.get(a - 1))) {
                    listWithFoodType.add(vouchers);
                }
            }
        }
        return listWithFoodType;
    }

    public ArrayList<Integer> listOfCountOfDays(ArrayList<Voucher> choisedFoodTypeList) {
        ArrayList<Integer> choisedCountOfDays = new ArrayList<>();
        for (Voucher voucher : choisedFoodTypeList) {
            choisedCountOfDays.add(voucher.getCountOfDays());
        }
        for (int i = 0; i < choisedCountOfDays.size(); i++) {
            for (int j = choisedCountOfDays.size() - 1; j > i; j--) {
                if (choisedCountOfDays.get(i).equals(choisedCountOfDays.get(j))) {
                    choisedCountOfDays.remove(j);
                }
            }
        }
        return choisedCountOfDays;
    }

    public ArrayList<Voucher> choisedVouchers(ArrayList<Voucher> choisedFoodTypeList) {
        ArrayList<Voucher> resultList = new ArrayList<>();
        ArrayList<Integer> listOfCountOfDays;
        listOfCountOfDays = listOfCountOfDays(choisedFoodTypeList);
        System.out.println("Имеющиеся количество дней:");
        voucherView.printIntegerList(listOfCountOfDays);
        int a = enter.enterFromConsole("Выберите количество дней >>");
        System.out.println("Вы выбрали: " + listOfCountOfDays.get(a - 1));
        if (a > 0 && a <= listOfCountOfDays.size()) {
            for (Voucher vouchers : choisedFoodTypeList) {
                if (Integer.valueOf(vouchers.getCountOfDays()).equals(listOfCountOfDays.get(a - 1))) {
                    resultList.add(vouchers);
                }
            }
        }
        sortedListByPrice(resultList);
        return resultList;
    }

    public Voucher choiseVoucher(ArrayList<Voucher> choisedVouchers) {
        System.out.println("Имеющиеся путевки:");
        voucherView.printVouchers(choisedVouchers);
        int a = enter.enterFromConsole("Выберите путевку >>");
        System.out.println("Вы выбрали: ");
        return choisedVouchers.get(a - 1);
    }
}
