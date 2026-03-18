package XS2;

public class OrderService {
    private SalesChannelFactory factory;

    public OrderService(SalesChannelFactory factory) {
        this.factory = factory;
    }

    public void checkout(String product, double price, int quantity) {
        double total = price * quantity;
        DiscountStrategy discount = factory.createDiscountStrategy();
        PaymentMethod payment = factory.createPaymentMethod();
        NotificationService notification = factory.createNotificationService();

        double finalAmount = discount.applyDiscount(total);

        System.out.println("\n--- ĐƠN HÀNG " + factory.getChannelName().toUpperCase() + " ---");
        System.out.println("Sản phẩm: " + product);
        // Chỗ này hết lỗi vì đã thêm getDescription() vào interface
        System.out.println("Áp dụng " + discount.getDescription() + ": " + String.format("%,.0f", (total - finalAmount)));

        payment.processPayment(finalAmount);

        // Sửa lỗi truyền thiếu tham số: Thêm email/sđt giả định hoặc từ khách hàng
        notification.sendNotification("Đơn hàng thành công!", "customer@example.com");
    }
}