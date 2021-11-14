package by.epam.jonline.task03;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль столицу,
количество областей, площадь, областные центры.
 */
public class Main {
    public static void main(String[] args) {
        District district1 = new District("Мозырский", 265, "Мозырь");
        district1.addCity(new City("Мозырь", 120000));
        district1.addCity(new City("Наровля", 7000));

        District district2 = new District("Калинковичский", 208, "Калинковичи");
        district2.addCity(new City("Калинковичи", 45000));
        district2.addCity(new City("Дудичи", 3000));

        District district3 = new District("Барановичский", 256, "Барановичи");
        district3.addCity(new City("Барановичи", 100000));
        district3.addCity(new City("Ивацевичи", 12000));

        District district4 = new District("Браславский", 300, "Браслав");
        district4.addCity(new City("Браслав", 100000));
        district4.addCity(new City("Опса", 1200));

        District district5 = new District("Волковысский", 236, "Волковыск");
        district5.addCity(new City("Волковыск", 21000));
        district5.addCity(new City("Волпов", 806));

        District district6 = new District("Бобруйский", 238, "Бобруйск");
        district6.addCity(new City("Бобруйск", 31000));
        district6.addCity(new City("Горбацевичи", 1405));

        Region region1 = new Region("Гомельская", "Гомель");
        region1.addDistrict(district1);
        region1.addDistrict(district2);
        region1.area(region1.getCitiesOfDistrict());

        Region region2 = new Region("Брестская", "Брест");
        region2.addDistrict(district3);
        region2.addDistrict(district4);
        region2.area(region2.getCitiesOfDistrict());

        Region region3 = new Region("Витебская", "Витебск");
        region3.addDistrict(district5);
        region3.addDistrict(district6);
        region3.area(region3.getCitiesOfDistrict());

        State state = new State("Беларусь", "Минск");
        state.addRegion(region1);
        state.addRegion(region2);
        state.addRegion(region3);
        state.area(state.getRegions());

        state.printCapital();
        state.countOfRegions();

        state.printRegionsCenters(state.getRegions());

        System.out.println(region1.area(region1.getCitiesOfDistrict()));
    }
}
