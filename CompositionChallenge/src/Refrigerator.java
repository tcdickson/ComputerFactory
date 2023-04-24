public class Refrigerator extends SmartKitchen {

    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public Refrigerator(Refrigerator refrigerator, Dishwasher dishwasher, CoffeeMaker coffeeMaker, Boolean icebox, Boolean dishWasher, Boolean brewMaster, boolean hasWorkToDo) {
        super(refrigerator, dishwasher, coffeeMaker, icebox, dishWasher, brewMaster);
        this.hasWorkToDo = hasWorkToDo;


}

    public void orderFood() {
        if (hasWorkToDo == true) {
            System.out.println("Food is being ordered");
        }
    }
}

