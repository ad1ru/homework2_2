public class Hp extends Laptop {
    private String processor;
    public Hp(String model, Integer price, String processor) {
        super(model, price);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void print() {
        System.out.println("------------");
        System.out.println("Model: " + getModel() +
                "\nPrice: " + getPrice() + "$" +
                "\nProcessor: " + getProcessor());

    }
}
