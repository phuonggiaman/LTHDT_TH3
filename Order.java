package TH3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TH3.Product;

public class Order {

    private int orderID;
    private LocalDate orderDate;
    private List<OrderDetail> lineitems = new ArrayList<OrderDetail>();
    private int count;
    OrderDetail orde;
    Product pro = new Product();
    Scanner sc = new Scanner(System.in);

    public Order() {
    }

    public Order(int orderID, LocalDate orderDate, List<OrderDetail> lineitems, int count) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineitems = new ArrayList<>();
        this.count = 0;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderDetail> getLineitems() {
        return lineitems;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void addLineItems(Product p, int quatity) {
        if (count < 20) {
            lineitems.add(new OrderDetail(quatity, p));
            count++;
        } else {
            System.out.println("toi da 20 san pham cho 1 hoa don");
        }
    }

    public double calcTotalCharge() {
        double totalcharge = 0;
        for (OrderDetail lineitem : lineitems) {
            totalcharge += lineitem.calcTotalPrice();
        }
        return totalcharge;
    }

    public void Nhap() {
        sc.nextLine();
        System.out.print("Nhap ma hoa don: ");
        String productID = sc.nextLine();
        System.out.print("Nhap mo ta san pham: ");
        String description = sc.nextLine();
        System.out.print("Nhap gia san pham: ");
        double Price = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int quatity = sc.nextInt();

        pro = new Product(description, productID, Price);
        addLineItems(pro, quatity);
        System.out.println("Da tao hoa don");
    }

    public void in() {
        System.out.println("Ma hoa don: " + orderID);
        System.out.println("Ngay mua: " + orderDate.now());
        System.out.println(String.format("|%-20s|%-20s|%-20s|%-20s|%-20s|",
                "Ma san pham", "Mo ta san pham", "Gia", "So luong", "Thanh tien"));
        System.out.println("========================================================================================================");
        for (OrderDetail lineitem : lineitems) {
            System.out.println(String.format("|%-20s|%-20s|%-20s|%-20s|%-20s|",
                    pro.getProduct(), pro.getDescription(), pro.getPrice(), lineitem.getQuatity(), lineitem.calcTotalPrice()));
        }
        System.out.print("Tong tien: " );System.out.println(calcTotalCharge());
    }
}