package XS2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chọn kênh bán hàng: 1. Website | 2. Mobile App");
        int choice = sc.nextInt(); sc.nextLine();

        SalesChannelFactory factory = (choice == 1) ? new WebsiteFactory() : new MobileAppFactory();

        System.out.print("Sản phẩm: "); String name = sc.nextLine();
        System.out.print("Giá: "); double price = sc.nextDouble();
        System.out.print("Số lượng: "); int qty = sc.nextInt();

        OrderService order = new OrderService(factory);
        order.checkout(name, price, qty);
    }
}