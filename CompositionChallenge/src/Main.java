public class Main {
    public static void main(String[] args) {

        Refrigerator fridge = new Refrigerator(true);
//        fridge.orderFood();
        Dishwasher dishes = new Dishwasher(true);
//        dishes.doDishes();
        CoffeeMaker coffee = new CoffeeMaker(true);
//        coffee.brewCoffee();
        SmartKitchen kitchen = new SmartKitchen(fridge, dishes, coffee, true, true, true);

        kitchen.doKitchenWork();






    }
}