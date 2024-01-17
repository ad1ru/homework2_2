import java.awt.geom.GeneralPath;

public class Main {
    public static void main(String[] args) {
        Laptop Lenovo = createObject("Lenovo");
        Lenovo.print();

        Laptop Acer = createObject("Acer");
        Acer.print();

        Laptop Hp = createObject("Hp");
        Hp.print();
    }
    public static Laptop createObject(String className) {
        switch (className) {
            case "Lenovo":
                return new Lenovo("Legion Pro 5 Gen 8 ", 1419, "Nvidia RTX 4070");
            case "Acer":
                return new Acer("Nitro V15 ", 699, 15.6);
            case "Hp":
                return new Hp("Envy Laptop 17t ", 849, "Intel Core i7-13700H");
            default:
                return null;
        }
    }
}