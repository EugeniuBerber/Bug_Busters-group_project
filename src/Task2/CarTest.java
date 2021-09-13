package Task2;

public class CarTest {
    public static void main(String[] args) {
        Sedan obj = new Sedan(22);
        obj.carPrice=35000;
        obj.calculateSalePrice();
        Truck obj1 = new Truck(5600);
        obj1.carPrice= 65000;
        obj1.calculateSalePrice();
    }
}
