package Task2;

abstract class Car {
    double carPrice;
    String color;

    abstract void calculateSalePrice();
}

class Sedan extends Car {
    double length;

    Sedan(double length) {
        this.length = length;
    }

    @Override
    void calculateSalePrice() {
        if (length > 20)
            System.out.println("Final price with 5% discount: "+carPrice * 0.95+"$");
        else
            System.out.println("Final price with 10% discount: "+carPrice * 0.9+"$");
    }
}
class Truck extends Car{
    int weight;
    Truck(int weight){
        this.weight=weight;
    }

    @Override
    void calculateSalePrice() {
        if(weight>2000)
            System.out.println("Final price with 10% discount: "+carPrice*0.9+"$");
        else
            System.out.println("Final price with 20% discount: "+carPrice*0.8+"$");
    }
}