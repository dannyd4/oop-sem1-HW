public class Drink extends Product {
    private int volume;

    public Drink(String name, float price, int volume) {
        super(name, price);
        this.volume = volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
    public void consume(){
        System.out.print("Напиток - потреблён!\n");
    }

}
