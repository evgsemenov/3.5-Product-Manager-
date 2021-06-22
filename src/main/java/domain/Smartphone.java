package domain;

public class Smartphone extends Product {
    private String vendor;


    public Smartphone() {
    }

    public Smartphone(int id, int cost, String name, String vendor) {
        super(id, cost, name);
        this.vendor = vendor;
    }
}
