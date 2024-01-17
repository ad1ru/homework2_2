public class Acer extends Laptop {
    private double screenSize;
    public Acer(String model, Integer price, double screenSize) {
        super(model, price);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void print() {
        System.out.println("------------");
        System.out.println("Model: " + getModel() +
                "\nPrice: " + getPrice() + "$" +
                "\nScreen Size: " + getScreenSize() + " Inch");
    }
}
