package XS2;

public class MobileAppFactory implements SalesChannelFactory {

    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new DiscountStrategy() {
            @Override
            public double applyDiscount(double total) {
                return total * 0.85;
            }

            @Override
            public String getDescription() {
                return "Giảm giá Website 15%";
            }
        };
    }

    @Override
    public PaymentMethod createPaymentMethod() {
        return amount -> {
            System.out.println("(*) Xử lý thanh toán MoMo: " + amount);
            return true;
        };
    }

    @Override
    public NotificationService createNotificationService() {
        return (msg, rec) -> System.out.println("Push Notification: " + msg);
    }

    @Override
    public String getChannelName() {
        return "Mobile App";
    }
}