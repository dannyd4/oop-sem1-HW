import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("apple", 1);
        Product p2 = new Product("orange", 2);
        Product p3 = new Product("pear", 3);
        Drink d1 = new Drink("juice", 4, 4);
        Drink d2 = new Drink("milk", 5, 5);
        Drink d3 = new Drink("coldTea", 6, 6);
        HotDrink d4 = new HotDrink("HotTea", 7, 7, 65);
        HotDrink d5 = new HotDrink("HotCoffee", 8, 8, 66);
        HotDrink d6 = new HotDrink("HotWater", 9, 9, 67);

        VendingMachine VM1 = new VendingMachine("VM1");
        DrinkVendingMachine DVM1 = new DrinkVendingMachine("DVM1");
        HotDrinkVM HDVM1 = new HotDrinkVM("HDVM1");

        HDVM1.addHtDrink(d4);
        HDVM1.addHtDrink(d5);
        HDVM1.addHtDrink(d6);

        HotDrink out = HDVM1.getProductByName("HotTea", 7,  65);
        System.out.println();
        System.out.println(out.getName() + "  " + out.getPrice()+ "  " + out.getTemp());
        System.out.println();


        ArrayList<Product> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);
        list1.add(d1);
        list1.add(d2);
        list1.add(d3);
        list1.add(d4);
        list1.add(d5);
        list1.add(d6);

        for (Product el: list1){
            el.consume();
        }




    }


}