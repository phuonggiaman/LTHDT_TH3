package TH3;

public class Product {
    private String description;
    private String product;
    private double price;

    public Product() {
    }

    public Product(String description, String product, double price) {
        this.description = description;
        this.product = product;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", product=" + product + ", price=" + price + '}';
    }
    
    
}