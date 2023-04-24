public class SmartKitchen {


private Refrigerator refrigerator;
private Dishwasher dishwasher;
private CoffeeMaker coffeeMaker;

private Boolean icebox;
private Boolean dishWasher;
private Boolean brewMaster;


    public SmartKitchen() {
    }

    public SmartKitchen(Refrigerator refrigerator, Dishwasher dishwasher, CoffeeMaker coffeeMaker, Boolean icebox, Boolean dishWasher, Boolean brewMaster) {
        this.refrigerator = refrigerator;
        this.dishwasher = dishwasher;
        this.coffeeMaker = coffeeMaker;
        this.icebox = icebox;
        this.dishWasher = dishWasher;
        this.brewMaster = brewMaster;


    }


    public void doKitchenWork () {
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishwasher.doDishes();
    }
}
