public class Dishwasher extends SmartKitchen {

    private boolean hasWorkToDo;

    public Dishwasher(Refrigerator refrigerator, Dishwasher dishwasher, CoffeeMaker coffeeMaker, Boolean icebox, Boolean dishWasher, Boolean brewMaster, boolean hasWorkToDo) {
        super(refrigerator, dishwasher, coffeeMaker, icebox, dishWasher, brewMaster);
        this.hasWorkToDo = hasWorkToDo;
    }

    public Dishwasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo == true) {
            System.out.println("Dishes are being done");
        }
    }
}

