import java.util.ArrayList;

public class HotDrink extends Drink {

    private int temp;

    public HotDrink(String name, float price, int volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
    public void consume(){
        System.out.print("Горячий напиток - потреблён!\n");
    }
}
