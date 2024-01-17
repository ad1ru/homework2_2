public class Lenovo extends Laptop {
    private String videoCard;
    public Lenovo(String model, Integer price, String videoCard) {
        super(model, price);
        this.videoCard = videoCard;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public void print() {
        System.out.println("Model: " + getModel() +
                "\nPrice: " + getPrice() + "$" +
                "\nVideo Card: " + getVideoCard());
    }
}
