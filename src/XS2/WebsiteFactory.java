package XS2;

public class WebsiteFactory implements SalesChannelFactory {
    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new DiscountStrategy() {
            @Override
            public double applyDiscount(double total) {
                return total * 0.9;
            }

            @Override
            public String getDescription() {
                return "Giảm giá Website 10%";
            }
        };
    }

    @Override
    public PaymentMethod createPaymentMethod() {
        return new PaymentMethod() {
            @Override
            public boolean processPayment(double amount) {
                System.out.println("(*) Xử lý thanh toán thẻ tín dụng qua cổng online: " + amount);
                return true;
            }
        };
    }

    @Override
    public NotificationService createNotificationService() {
        return new NotificationService() {
            @Override
            public void sendNotification(String msg, String rec) {
                System.out.println("Gửi email đến " + rec + ": " + msg);
            }
        };
    }

    @Override
    public String getChannelName() {
        return "Website";
    }
}