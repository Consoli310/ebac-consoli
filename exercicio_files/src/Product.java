public class Product {

    private String name;
    private Double value;
    private int quantity;

    public Product(String name, Double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public double finalPrice(){
        return quantity * value;
    }
    public Product(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return name
                + ", "
                + finalPrice();
    }
}
