public class CoffeeMaker extends SmartKitchen {

    public boolean hasWorkToDo;

    public CoffeeMaker(Refrigerator refrigerator, Dishwasher dishwasher, CoffeeMaker coffeeMaker, Boolean icebox, Boolean dishWasher, Boolean brewMaster, boolean hasWorkToDo) {
        super(refrigerator, dishwasher, coffeeMaker, icebox, dishWasher, brewMaster);
        this.hasWorkToDo = hasWorkToDo;

}

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo == true) {
            System.out.println("Coffee is being brewed");
        }
    }

}

