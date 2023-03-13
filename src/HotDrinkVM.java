import java.util.ArrayList;

public class HotDrinkVM extends VendingMachine<HotDrink> {

    private ArrayList<HotDrink> htDrList;
    public HotDrinkVM(String nameOfVendingMachine) {
        super(nameOfVendingMachine);
        htDrList = new ArrayList<HotDrink>();
    }

    public void addHtDrink(HotDrink newDrink){
        htDrList.add(newDrink);
    }

    public HotDrink getProductByName(String name, int volume, int temp) {
        for (HotDrink el: htDrList) {
            if ( el.getName().equals(name) && el.getVolume() == volume && el.getTemp() == temp);
            return el;
        }
        return null;
    }
    }

