import java.util.ArrayList;

public class DrinkVendingMachine extends VendingMachine{


    private ArrayList<Drink> drList;

    public DrinkVendingMachine(String nameOfVendingMachine) {
        super(nameOfVendingMachine);
        drList = new ArrayList<Drink>();
    }
    public void addDrink(Drink newDrink){
        drList.add(newDrink);
    }
    public Drink getDrinkByName(String name) {
        for (Drink pil: drList) {
            if (pil.getName().equals(name)) {
                return pil;
            }

        }
        return null;
    }

}
