package TH3;

public class OrderDetail {
    private int quatity;
    private Product product;

    public OrderDetail(int quatity, Product product) {
        this.quatity = quatity;
        this.product = product;
    }

    public int getQuatity() {
        return quatity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quatity=" + quatity + ", product=" + product + '}';
    }
    
    public double calcTotalPrice()
    {
        double thanhtien = quatity * product.getPrice();
        return thanhtien;
    }
}